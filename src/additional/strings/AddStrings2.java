package additional.strings;


public class AddStrings2 {
    public static void main(String[] args) {

        System.out.println(toString(5929700.6132));


    }

    /**
     * Метод принимает число и возвращает его значение прописью,
     * включая его дробную часть, которая возвращается до двух знаков после запятой
     *
     * @param number число от -999_999_999.99 до 999_999_999.99
     * @return Значение введенного числа прописью, включая дробную часть
     */
    public static String toString(double number) {

        String numInStr = String.valueOf(number);

        String firstPart = numInStr.substring(0, numInStr.indexOf('.'));
        String secondPart = numInStr.substring(numInStr.indexOf('.')).length() < 3 ?
                numInStr.substring(numInStr.indexOf('.') + 1) :
                numInStr.substring(numInStr.indexOf('.') + 1, numInStr.indexOf('.') + 3);

        String afterDotPart = "";

        String beforeDotPart = helperString(Integer.parseInt(firstPart));

        if (beforeDotPart.matches(".*[Оо]дна\\s*$")) {

            beforeDotPart += " целая ";

        } else {

            beforeDotPart += " целых ";
        }

        if (secondPart.equals("0")) {

            return beforeDotPart.strip();

        } else if (secondPart.startsWith("0") || secondPart.length() > 1) {

            afterDotPart = helperString(Integer.parseInt(secondPart)).toLowerCase();

            if (afterDotPart.matches(".*одна\\s*$")) {

                afterDotPart += " сотая";

            } else {

                afterDotPart += " сотых";
            }

        } else {

            afterDotPart = helperString(Integer.parseInt(secondPart)).toLowerCase();

            if (afterDotPart.matches(".*одна\\s*$")) {

                afterDotPart += " десятая";

            } else if (afterDotPart.matches(".*(две|три|четыре)\\s*$")) {

                afterDotPart += " десятые";

            } else {

                afterDotPart += " десятых";
            }

        }


        return beforeDotPart + afterDotPart;
    }

    /**
     * Вспомогательный метод, принимает число 999_999_999 до 999_999_999, возвращает
     * его значение прописью в женском роде. Используется в методе toString(double number)
     *
     * @param number число для возврата прописью, от -999_999_999 до 999_999_999
     * @return Значение введенного числа прописью в женском роде
     */

    public static String helperString(int number) {
        String minusSign = "";
        String[] digits = {"", "одна", "две", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] teens = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать",};
        String[] tenth = {"", "десять", "двадцать", "тридцать", "сорок",
                "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто",};
        String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот",
                "шестьсот", "семьсот", "восемьсот", "девятьсот",};


        if (number == 0)
            return "Ноль";

        if (number < 0) {
            minusSign = "Минус ";
            number *= -1;
        }

        String res = "";

        if (number / 1_000_000 > 0) {
            res += helperString(number / 1_000_000);
            int ten = number / 1_000_000 % 100;
            if ((ten > 20 || ten < 10) && (ten % 10 > 0 && ten % 10 < 5)) {
                if (ten % 10 == 1) {
                    res = res.replaceFirst("[Оо]дна$", "один миллион ");

                } else if (ten % 10 == 2) {
                    res = res.replaceFirst("[Дд]ве$", "два миллиона ");

                } else {
                    res += " миллиона ";
                }

            } else {
                res = res + " миллионов ";

            }
            number = number - (number / 1_000_000 * 1_000_000);

        }

        if (number / 1000 > 0) {
            res += helperString(number / 1000);
            int ten = number / 1000 % 100;
            if ((ten > 20 || ten < 10) && (ten % 10 > 0 && ten % 10 < 5)) {

                if (res.matches(".*([Дд]ве|[Тт]ри|[Чч]етыре)")) {
                    res += " тысячи ";
                } else {
                    res += " тысяча ";
                }

            } else {
                res = res + " тысяч ";
            }
            number = number - (number / 1000 * 1000);
        }


        boolean flagForDigits = true;

        if (number > 99) {
            res = res + hundreds[number / 100] + " ";
            number = number - number / 100 * 100;
        }


        if (number > 9) {

            if (number % 10 == 0) {
                res = res + tenth[number / 10] + " ";
                flagForDigits = false;
            } else if (number < 20) {
                res = res + teens[number % 10] + " ";
                flagForDigits = false;

            } else {
                res = res + tenth[number / 10] + " ";
            }

            number = number % 10;

        }

        if (flagForDigits && number != 0) {

            res = res + digits[number] + " ";


        }

        res = res.toLowerCase();

        if (minusSign.isBlank()) {
            res = res.substring(0, 1).toUpperCase() + res.substring(1);
        } else {
            res = minusSign + res;
        }

        return res.strip();


    }


}
