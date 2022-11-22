package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

import java.util.HashSet;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CalculatorStringExpression implements ICalculator {

    /*
    Получилось корявенько, но как-то работает. Поначалу все шло неплохо, но потом увидел, что не успеваю,
    и пришлось делать костыли. По идее, класс выполняет основные требования и даже выводит, где он нашел
    ошибку в выражении, если она есть. По идее...

    Для работы с классом необходимо использовать метод accept(String expression), куда передается
    выражение для расчета.

    Если не вывело сообщение об ошибке, для получения результата далее вызвается метод getResult(),
    который возвращет результат типа double;
     */

    private ICalculator calculator;

    public CalculatorStringExpression(ICalculator calculator) {
        this.calculator = calculator;
    }

    private CalculatorStringExpression(ICalculator calculator, boolean hasParent) {
        this.calculator = calculator;
        this.hasParent = true;
    }

    private final HashSet<Character> operatorsZeroLevel = new HashSet<>(List.of('+', '-'));
    private final HashSet<Character> operatorsFirstLevel = new HashSet<>(List.of('\\', '*'));
    private final HashSet<Character> operatorsSecondLevel = new HashSet<>(List.of('^'));
    private final HashSet[] allOperators = {operatorsZeroLevel, operatorsFirstLevel, operatorsSecondLevel};




    private CalculatorStringExpression parent;
    private boolean hasParent;
    private boolean hasAnError = false;

    private boolean removedPatenthesis = false;

    private int startErrorPosition;
    private int endErrorPosition;
    private char operator;

    private String regexForNumber = "^(?:-?(?:(?:0[\\.,])|(?:[1-9]\\d*[\\.,])|(?:[\\.,]))?(?:(?<=[,\\.])0\\d*|[1-9]\\d*))|(?:PI)|(?:E)||(?:0)$";

    private CalculatorStringExpression firstPart;
    private CalculatorStringExpression secondPart;

    private String currentExpression;

    private String simpleNumber;

    private double result;


    /**
     * Принимает строку для разбивки ее на составляющие (firstPart, secondPart, operator), которые тоже в свою очередь разбиваются на
     * составляющие и т.д. Если увидит ошибку в выражении, то выводит сообщение об ошибке.
     * @param expression
     */
    public void accept(String expression) {
        if (!this.hasParent) {
            reset();
        }
        this.currentExpression = expression.replaceAll("\\s", "");
        char[] expressionInArray = currentExpression.toCharArray();
        if (expressionInArray.length > 0) {
            if (hasOneModuleOnWholeExpression(expressionInArray)) {
                makeModulePart();
            } else {
                if (hasOpeningAndClosingPatenthesis()) {
                    removeUnnecessaryParenthesis();
                }
                if (!this.removedPatenthesis) {
                    splitOnLevel(expressionInArray, 0);
                }
            }
        } else {
            this.hasAnError = true;
        }
        if (!this.hasParent && this.hasAnError) {
            makeErrorMessage();
        }
    }


    /**
     * Метод для вывода ошибки в консоль
     */
    private void makeErrorMessage() {
        System.out.println("Ошибка в введенном выражении!");
        System.out.println("Было введено следующее выражение: " + this.currentExpression);
        System.out.print("Предполагаемая область ошибки:    ");

        for (int i = 0; i < startErrorPosition; i++) {
            System.out.print(" ");
        }
        for (int i = startErrorPosition; i <= endErrorPosition; i++) {
            System.out.print("^");

        }
        System.out.print("\n");
        System.out.println("Дальнейший результат не будет верным.");
    }


    /**
     * Метод для возврата результата
     * @return результат типа double если переданное выражение было математически верным, или
     * 0.0, если неверным
     */
    public double getResult() {
        if (!this.hasAnError) {
            result = calculate();
        }
        return result;
    }

    /**
     * Необходим для сброса значений класса в случае, если повторно вызвается метод accept(String a)
     */
    private void reset() {
        this.simpleNumber = null;
        this.hasAnError = false;
        this.firstPart = null;
        this.secondPart = null;
        this.removedPatenthesis = false;
        this.startErrorPosition = 0;
        this.endErrorPosition = 0;
        this.result = 0;
        this.operator = '0';
    }

    /**
     * Метод для подсчета результата firstPart -operator- secondPart. secondPart может отсутствовать в отдельных случаях(модуль)
     * @return
     */
    private double calculate() {

        if (simpleNumber != null) {
            if (simpleNumber.equals("PI")) {
                return Math.PI;
            } else if (simpleNumber.equals("E")) {
                return Math.E;

            }
            return Double.parseDouble(simpleNumber);

        } else if (secondPart == null && operator == '|') {
            return calculator.module(firstPart.calculate());
        } else if (operator == '+') {
            return calculator.sum(firstPart.calculate(), secondPart.calculate());

        } else if (operator == '-') {
            return calculator.substract(firstPart.calculate(), secondPart.calculate());

        } else if (operator == '*') {
            return calculator.multiply(firstPart.calculate(), secondPart.calculate());

        } else if (operator == '\\') {
            return calculator.divide(firstPart.calculate(), secondPart.calculate());

        } else if (operator == '^') {
            return calculator.exponiate(firstPart.calculate(), (int) secondPart.calculate());
        } else if (operator == '(') {
            return firstPart.calculate();
        }
        return 0;

    }

    /**
     * Метод для поиска знака операции. Одновременно проверяет выражение на наличие неверной скобки, в
     * этом случае прерывает операцию и ставит hasAnError = true;
     * В первую очередь разбивает на части в случае, если найдет знаки +-, затем \*, затем ^
     * @param expressionInArray
     * @param level
     */
    private void splitOnLevel(char[] expressionInArray, int level) {


        for (int i = 0; i < expressionInArray.length; i++) {
            if (i == 0 && expressionInArray[i] == '-') {
                continue;
            }
            if (expressionInArray[i] == '(') {
                i = findExitFromParenthesis(i, expressionInArray);
                continue;
            } else if (expressionInArray[i] == '|') {
                i = findExitFromModuleSign(i, expressionInArray);
                continue;
            } else if (expressionInArray[i] == ')') {
                this.hasAnError = true;
                this.startErrorPosition = i;
                this.endErrorPosition = i;
                return;

            } else if (allOperators[level].contains(expressionInArray[i])) {
                makeParts(i);
                return;
            }
            if (level == 2 && i == currentExpression.length() - 1) {
                simpleNumber = currentExpression.replaceAll(",", ".");

                if (!this.hasCorrectSimpleNumber()) {
                    this.hasAnError = true;
                    this.startErrorPosition = findStartErrorPosition();
                    this.endErrorPosition = findEndErrorPosition();
                }
                return;
            }

        }
        if (level < 2) {
            splitOnLevel(expressionInArray, level + 1);
        } else {
            this.hasAnError = true;
            this.startErrorPosition = 0;
            this.endErrorPosition = currentExpression.length();
            return;
        }
    }

    /**
     * Метод для поиска "выхода" из найденной открывающей скобки. Применяется в методе
     * splitOnLevel(char[] expressionInArray, int level)
     * @param position
     * @param expressionInArray
     * @return
     */
    private int findExitFromParenthesis(int position, char[] expressionInArray) {
        int openingParenthesis = 0;
        int closingParenthesis = 0;
        for (; position < expressionInArray.length; position++) {
            if (expressionInArray[position] == '(') {
                openingParenthesis++;
                closingParenthesis--;
            } else if (expressionInArray[position] == ')') {
                if (openingParenthesis > closingParenthesis) {
                    openingParenthesis--;
                    closingParenthesis++;
                }
            }

            if (openingParenthesis == 0 && closingParenthesis == 0) {
                return position;
            }


        }

        return position;
    }

    /**
     * Возвращет true, если есть открывающая и закрывающая скобка
     * @return
     */
    private boolean hasOpeningAndClosingPatenthesis() {
        return currentExpression.startsWith("(") && currentExpression.endsWith(")");
    }

    /**
     * Метод для опускания "ненужных скобок", к примеру первой и последней скобки в выражении
     * (5+(7-9)-4). Прерывает операцию и ставит this.hasAnError = true в случае, если в процессе
     * парсинга увидит несоответствие по скобкам.
     */
    private void removeUnnecessaryParenthesis() {
        if (currentExpression.startsWith("(") && currentExpression.endsWith(")")) {
            int last_opening = 0;
            if (currentExpression.length() > 2) {
                char[] curExpressionInArray = currentExpression.toCharArray();
                int openingParenthesis = 0;
                int closingParenthesis = 0;
                for (int i = 1; i < curExpressionInArray.length - 1; i++) {
                    if (curExpressionInArray[i] == '(') {
                        last_opening = i;
                        openingParenthesis++;
                        closingParenthesis--;
                    } else if (curExpressionInArray[i] == ')') {
                        if (openingParenthesis > closingParenthesis) {
                            openingParenthesis--;
                            closingParenthesis++;
                        }
                    }
                }
                if (openingParenthesis == 0 && closingParenthesis == 0) {
                    firstPart = new CalculatorStringExpression(calculator, true);
                    firstPart.accept(currentExpression.substring(1, currentExpression.length() - 1));
                    operator = '(';
                    removedPatenthesis = true;
                    if (firstPart.hasAnError) {
                        this.hasAnError = true;
                        this.startErrorPosition = firstPart.startErrorPosition + 1;
                        this.endErrorPosition = firstPart.endErrorPosition + 1;
                        return;
                    }
                } else if (closingParenthesis > openingParenthesis) {
                    removedPatenthesis = true;
                    this.hasAnError = true;
                    this.startErrorPosition = last_opening;
                    this.endErrorPosition = last_opening;
                    return;
                }
            } else {
                removedPatenthesis = true;
                this.hasAnError = true;
                this.startErrorPosition = 0;
                this.endErrorPosition = 1;
                return;

            }

        }

    }

    /**
     * Вызывается в случае, если был найден знак |. Возвращает позицию следующего найденного знака
     * в принятом массиве чаров, или длину массива
     * @param position
     * @param expressionInArray
     * @return
     */
    private int findExitFromModuleSign(int position, char[] expressionInArray) {

        for (int i = position + 1; i < expressionInArray.length; i++) {
            if (expressionInArray[i] == '|') {
                return i;
            }

        }
        return expressionInArray.length;
    }

    /**
     * Возвращает true, если размер переданного массива больше 1 и массив начинается и заканчивается со знаком |
     * @param expressionInArray
     * @return
     */
    private boolean hasOneModuleOnWholeExpression(char[] expressionInArray) {

        return expressionInArray[0] == '|' && expressionInArray[expressionInArray.length - 1] == '|' && expressionInArray.length > 1;
    }


    /**
     * Метод вызвается в том случае, если был найден оператор +-*\^. В этом случае метод
     * создает new CalculatorStringExpression(calculator, true) и записывает его в поле firstPart
     * и вызывает у firstPart метод accept(String a), где a - строка до знака операции.
     * По завершению данного метода в firstPart уже будет сведения о том, имеется ли там ошибка или нет. Если ошибка имеется,
     * метод прерывается и вставится this.hasAnError = true, что каскадно прерывает работу всех "вышестоящих" фреймов, что
     * позволяет не делать расчетов тогда, когда это уже не нужноо
     * Затем проверяет, имеется ли возможность передать secondPart (путем проверки i==currentExpression.length() - 1);
     * Если не выдало ошибку, переходит к secondPart, где все по аналогии с firstPart;
     * @param i индекс оператора +-*\^ в this.currentExpression
     */
    private void makeParts(int i) {
        firstPart = new CalculatorStringExpression(calculator, true);
        firstPart.accept(currentExpression.substring(0, i));
        if (firstPart != null && firstPart.hasAnError) {
            this.hasAnError = true;
            this.startErrorPosition = firstPart.startErrorPosition;
            this.endErrorPosition = firstPart.endErrorPosition;
            return;
        }
        if (i == currentExpression.length() - 1) {
            this.hasAnError = true;
            this.startErrorPosition = i + 1;
            this.endErrorPosition = i + 1;
            return;
        }

        secondPart = new CalculatorStringExpression(calculator, true);
        secondPart.accept(currentExpression.substring(i + 1));
        if (secondPart != null && secondPart.hasAnError) {
            this.hasAnError = true;
            this.startErrorPosition = firstPart.currentExpression.length() + 1 + secondPart.startErrorPosition;
            this.endErrorPosition = firstPart.currentExpression.length() + 1 + secondPart.endErrorPosition;
            return;
        }
        operator = currentExpression.charAt(i);

    }


    /**
     * Метод для создания new CalculatorStringExpression(calculator, true) и записи его в firstPart
     * вызывается в случае, если найдено выражение |....|. secondPart в этом случае не создается
     * а в firstPart передается все выражение целиком, но без знака модуля
     */
    private void makeModulePart() {
        firstPart = new CalculatorStringExpression(calculator, true);
        firstPart.accept(currentExpression.substring(1, currentExpression.length() - 1));
        operator = '|';
        if (firstPart.hasAnError) {
            this.hasAnError = true;
            this.startErrorPosition = firstPart.startErrorPosition + 1;
            this.endErrorPosition = firstPart.endErrorPosition + 1;
            return;
        }

    }

    /**
     * Метод возвращает, соответствует ли currentExpression регулярному выражению,
     * определенному в regexForNumber
     * @return
     */
    private boolean hasCorrectSimpleNumber() {
        return currentExpression.matches(regexForNumber);
    }

    /**
     * Метод для получения начала позиции ошибки. В случае, если simpleNumber
     * валидно в начале, но не к конку (к примеру, 854а), вернет позицию
     * а. Иначе вернет 0
     * @return
     */
    private int findStartErrorPosition() {
        Matcher matcher = Pattern.compile(regexForNumber).matcher(simpleNumber);
        if (matcher.find()) {

            return matcher.end();

        } else {
            return 0;
        }
    }

    /**
     * Метод для получения конца позиции ошибки. Если simpleNumber валидно в начале,
     * вернет позицию первого невалидного знака. Иначе вернет размер currentexpression-1;
     * @return
     */
    private int findEndErrorPosition() {
        Matcher matcher = Pattern.compile(regexForNumber).matcher(simpleNumber);
        if (matcher.find()) {
            return matcher.end();
        } else {
            return currentExpression.length() - 1;
        }
    }


    /**
     * Возвращает сумму двух чисел
     * @param a
     * @param b
     * @return Сумма двух чисел
     */
    public double sum(double a, double b) {
        return a + b;
    }

    /**
     * Возвращает разницу двух чисел (a-b)
     * @param a Число, из которого будем вычитать
     * @param b Число, которое будем вычитать
     * @return Разница двух чисел
     */
    public double substract(double a, double b) {
        return a - b;
    }

    /**
     * Возвращает деление числа a на b
     * @param a Делитель
     * @param b Знаменатель
     * @return Результат деления
     */
    public double divide(double a, double b) {
        return a / b;
    }

    /**
     * Возвращает умножение числа a на b
     * @param a
     * @param b
     * @return Результат умножения
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Возвращает значение числа по модулю путем вызова метода из библиотеки Math
     * @param num
     * @return Значение числа по модулю
     */
    public double module(double num) {

        return Math.abs(num);
    }

    /**
     * Возвращает заданное число, возведенное в заданную целую степень путем вызова метода из библиотеки Math
     * @param num Возводимое в степень число
     * @param exp Степень
     * @return Число, возведенное в заданную степерь
     */
    public double exponiate(double num, int exp) {

        return Math.pow(num, exp);
    }

    /**
     * Возвращает квадратный корень из заданного числа путем вызова метода из библиотеки Math
     * @param num
     * @return квадратный корень из числа
     */
    public double squareRoot(double num) {
        return Math.sqrt(num);
    }
}
