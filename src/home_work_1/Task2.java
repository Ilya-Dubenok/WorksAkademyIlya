package home_work_1;


public class Task2 {
    public static void main(String[] args) {
        int a = 5, b = 2, c = 8;


        int[] results1_6 = getArrayOfIntResults(a, b, c);

        boolean[] results7_8 = {run7(),run8()};

        System.out.printf("res1 = %d\nres2 = %d\nres3 = %d\nres4 = %d\nres5 = %d\n" +
                "res6 = %d\nres7 = %b\nres8 = %b\n", results1_6[0],results1_6[1],results1_6[2],results1_6[3],
                results1_6[4],results1_6[5],results7_8[0],results7_8[1]);

    }

    public static int[] getArrayOfIntResults(int a, int b, int c) {
        return new int[] {run1(a, b, c), run2(a, b, c), run3(a, b, c), run4(a, b, c), run5(a, b, c), run6(b, c)};
    }


    /**
     * Возвращает a + b / c. Если с == 0, возвращает 0
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int run1(int a, int b, int c) {
        if (c == 0) {
            return 0;
        }
        return a + b / c;

    }

    /**
     * Возвращает (a + b) / c. Если с == 0, возвращает 0
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int run2(int a, int b, int c) {
        if (c == 0) {
            return 0;
        }
        return (a + b) / c;

    }

    /**
     * Возвращает (a + b++) / c. Если с == 0, возвращает 0
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int run3(int a, int b, int c) {
        if (c == 0) {
            return 0;
        }
        return (a + b++) / c;

    }

    /**
     * Возвращает (a + b++) / --c. Если с == 1, возвращает 0
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int run4(int a, int b, int c) {
        if (c == 1) {
            return 0;
        }
        return (a + b++) / --c;

    }

    /**
     * Возвращает (a * b >> b++) / --c. Если с == 1, возвращает 0
     * @param a
     * @param b
     * @param c
     * @return
     */
    public static int run5(int a, int b, int c) {
        if (c == 1) {
            return 0;
        }
        return (a * b >> b++) / --c;

    }


    /**
     * Возвращает (5 + 7 > 20 ? 68 : 22 * b >> b++) / --c Если с == 1, возвращает 0
     * @param b
     * @param c
     * @return
     */
    public static int run6(int b, int c) {
        if (c == 1) {
            return 0;
        }
        return (5 + 7 > 20 ? 68 : 22 * b >> b++) / --c;

    }

    public static boolean run7 () {
        return 6 - 2 > 3 && 12 * 12 <= 119;

    }

    public static boolean run8 () {
        return true&&false;

    }
}
