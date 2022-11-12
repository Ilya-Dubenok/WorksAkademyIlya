package additional.strings;

public class AddStrings1 {

    public static void main(String[] args) {

        System.out.println(toString(-423012703));

    }

    /**
     * Метод принимает число и возвращает его значение прописью
     *
     * @param number число для возврата прописью, от -999_999_999 до 999_999_999
     * @return Значение введенного числа прописью
     */

    public static String toString(int number) {
        String minusSign = "";
        String[] digits = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
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
            res += toString(number / 1_000_000);
            int ten = number / 1_000_000 % 100;
            if ((ten > 20 || ten < 10) && (ten % 10 > 0 && ten % 10 < 5)) {
                if (res.matches(".*([Дд]ва|[Тт]ри|[Чч]етыре)")) {
                    res += " миллиона ";
                } else {
                    res += " миллион ";
                }

            } else {
                res = res + " миллионов ";
            }
            number = number - (number / 1_000_000 * 1_000_000);

        }

        if (number / 1000 > 0) {
            res += toString(number / 1000);
            int ten = number / 1000 % 100;
            if ((ten > 20 || ten < 10) && (ten % 10 > 0 && ten % 10 < 5)) {
                if (ten % 10 == 1) {
                    res = res.replaceFirst("[Оо]дин$", "одна тысяча ");

                } else if (ten % 10 == 2) {
                    res = res.replaceFirst("[Дд]ва$", "две тысячи ");

                } else {
                    res += " тысячи ";
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
