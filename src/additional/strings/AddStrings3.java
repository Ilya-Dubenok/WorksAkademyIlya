package additional.strings;

public class AddStrings3 {

    public static void main(String[] args) {

        System.out.println(toString(177));

    }

    /**
     * Метод принимает значение количества дней и возвращает прописью,
     * сколько недель составляет введенное количество дней
     *
     * @param day количество дней
     * @return количество недель прописью
     */
    public static String toString(int day) {

        int fullWeeks = day / 7;

        String res = String.valueOf(fullWeeks);

        if (res.matches(".*[^1][1]$") || res.equals("1")) {
            res = res + " неделя";
        } else if (res.matches(".*[^1][234]$") || res.matches("^[234]$")) {
            res = res + " недели";
        } else {
            res = res + " недель";
        }

        return res;

    }
}
