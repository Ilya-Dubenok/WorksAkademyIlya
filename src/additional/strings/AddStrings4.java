package additional.strings;

public class AddStrings4 {

    public static void main(String[] args) {

        System.out.println(toHoursMinuteSecondMilllisecond(10861022, true));
        System.out.println(toHoursMinuteSecondMilllisecond(10861022, false));

    }


    /**
     * Метод принимает количество миллисекунд и значение boolean shortFormat
     * Если shortFormat==true, то возвращет значение, скольким часах, минутам, секундам, миллисекундам
     * равняется заданное количество миллисекунд в формате HH:mm:ss.SSS, где HH - это часы, mm - это минуты,
     * ss - это секунды, SSS - это миллисекунды
     * Если shortFormat==true, то возвращет количество миллисекунд в формате количества часов, минут,
     * секунд, миллисекунд прописью
     *
     * @param millisecond количество миллисекунд
     * @param shortFormat выводить ли в формате HH:mm:ss.SSS
     * @return в заданном формате выводит,
     * скольким часам, минутам, секундам, миллисекундам равняется заданное количество миллисекунд
     */
    public static String toHoursMinuteSecondMilllisecond(long millisecond, boolean shortFormat) {

        long hours = millisecond / 60 / 60 / 1000;

        long minutes = millisecond / 60 / 1000 - hours * 60;

        long seconds = millisecond / 1000 - minutes * 60 - hours * 60 * 60;

        long realMilliSeconds = millisecond % 1000;


        String result = "";


        if (shortFormat) {

            result += hours < 10 ? "0" + hours + ":" : hours + ":";

            result += minutes < 10 ? "0" + minutes + ":" : minutes + ":";

            result += seconds < 10 ? "0" + seconds + "." : seconds + ".";

            if (realMilliSeconds < 100) {
                result += "0";
            }

            if (realMilliSeconds < 10) {
                result += "0";
            }

            result += realMilliSeconds;


        } else {

            result += String.valueOf(hours) + " ";

            if (hours == 1) {

                result += "час ";

            } else if (hours % 10 >= 2 && hours % 10 <= 4 && (hours % 100 > 20 || hours % 100 < 10)) {

                result += "часа ";


            } else {

                result += "часов ";

            }

            result += String.valueOf(minutes) + " ";

            if (minutes == 1) {

                result += "минута ";

            } else if (minutes % 10 >= 2 && minutes % 10 <= 4 && (minutes > 20 || minutes < 10)) {

                result += "минуты ";


            } else {

                result += "минут ";

            }


            result += String.valueOf(seconds) + " ";

            if (seconds == 1) {

                result += "секунда ";

            } else if (seconds % 10 >= 2 && seconds % 10 <= 4 && (seconds > 20 || seconds < 10)) {

                result += "секунды ";


            } else {

                result += "секунд ";

            }

            result += String.valueOf(realMilliSeconds) + " ";

            if (realMilliSeconds == 1) {

                result += "миллисекунда";

            } else if (realMilliSeconds % 10 >= 2 && realMilliSeconds % 10 <= 4 &&
                    (realMilliSeconds % 100 > 20 || realMilliSeconds % 100 < 10)) {

                result += "миллисекунды";


            } else {

                result += "миллисекунд";

            }
        }

        return result;

    }
}
