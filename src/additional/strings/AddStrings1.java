package additional.strings;

public class AddStrings1 {

    public static void main(String[] args) {

        System.out.println(toString(-423012000));

    }

    /**
     * Метод принимает число и возвращает его значение прописью
     *
     * @param number число для возврата прописью, от -999_999_999 до 999_999_999
     * @return Значение введенного числа прописью
     */

    public static String toString(int number) {
        String minusSign = "";
        if (number == 0)
            return "Ноль";

        if (number < 0) {
            minusSign = "Минус ";
            number *= -1;
        }

        String res = "";
        if (number / 100_000_0 > 0) {
            res += getMillions(number / 1_000_000);
            number = number - (number / 1_000_000 * 1_000_000);

        }

        if (number / 1000 > 0) {
            res += getThousands(number / 1000);
            number = number - (number / 1000 * 1000);
        }

        res += getOrdinaryHundred(number % 1000);

        if (minusSign.isBlank()) {
            res = res.substring(0, 1).toUpperCase() + res.substring(1);
        } else {
            res = minusSign + res;
        }

        return res.strip();


    }


    /**
     * Вспомогательный метод для возврата трезначного числа
     * в виде прописи данного числа с приставкой "миллион" в соответствующем числительном
     * используется для работы метода toString(int number);
     *
     * @param number число от 0 до 999
     * @return пропись данного числа с приставкой "миллион" в соответствующем числительном
     */
    public static String getMillions(int number) {
        String result = getOrdinaryHundred(number);
        int ten = number % 100;
        String[] digits = {"", "один миллион ", "два миллиона ", "три миллиона ", "четыре миллиона "};
        if ((ten > 20 || ten < 10) && (ten % 10 > 0 && ten % 10 < 5)) {
            String[] results = result.split(" +");
            results[results.length - 1] = digits[ten % 10];
            StringBuilder builder = new StringBuilder();

            boolean comma = false;
            for (String s1 : results) {
                if (comma) {
                    builder.append(" ");
                } else {
                    comma = true;
                }
                builder.append(s1);
            }

            result = builder.toString();

        } else {
            result = result + "миллионов ";
        }
        return result;

    }


    /**
     * Вспомогательный метод для возврата трезначного числа
     * в виде прописи данного числа с приставкой "тысяч" в соответствующем числительном
     * используется для работы метода toString(int number);
     *
     * @param number число от 0 до 999
     * @return пропись данного числа с приставкой "тысяч" в соответствующем числительном
     */
    public static String getThousands(int number) {
        String result = getOrdinaryHundred(number);
        int ten = number % 100;
        String[] digits = {"", "одна тысяча ", "две тысячи ", "три тысячи ", "четыре тысячи "};
        if ((ten > 20 || ten < 10) && (ten % 10 > 0 && ten % 10 < 5)) {
            String[] results = result.split(" +");
            results[results.length - 1] = digits[ten % 10];
            StringBuilder builder = new StringBuilder();

            boolean comma = false;
            for (String s1 : results) {
                if (comma) {
                    builder.append(" ");
                } else {
                    comma = true;
                }
                builder.append(s1);
            }

            result = builder.toString();

        } else {
            result = result + "тысяч ";
        }
        return result;

    }

    /**
     * Вспомогательный метод для возврата трезначного числа
     * в виде прописи данного числа в мужском роде
     * используется для работы методов toString(int number), getMillions(int number)
     * getThousands(int number)
     *
     * @param number число от 0 до 999
     * @return
     */
    public static String getOrdinaryHundred(int number) {

        String[] digits = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
        String[] teens = {"", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать",
                "пятнадцать", "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать",};
        String[] tenth = {"", "десять", "двадцать", "тридцать", "сорок",
                "пятьдесят", "шестьдесят", "семьдесят", "восемьдесят", "девяносто",};
        String[] hundreds = {"", "сто", "двести", "триста", "четыреста", "пятьсот",
                "шестьсот", "семьсот", "восемьсот", "девятьсот",};

        String result = "";


        boolean flagForDigits = true;


        if (number > 99) {
            result = hundreds[number / 100] + " ";
            number = number - number / 100 * 100;
        }


        if (number > 9) {

            if (number % 10 == 0) {
                result = result + tenth[number / 10] + " ";
                flagForDigits = false;
            } else if (number < 20) {
                result = result + teens[number % 10] + " ";
                flagForDigits = false;

            } else {
                result = result + tenth[number / 10] + " ";
            }

            number = number % 10;

        }

        if (flagForDigits && number != 0) {

            result = result + digits[number] + " ";


        }

        return result;
    }
}
