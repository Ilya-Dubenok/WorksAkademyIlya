package home_work_2.loops;

public class Task1_6 {

    public static void main(String[] args) {

        System.out.println(getTable());

    }

    public static String getTable() {
        String res = "";

        for (int i = 1; i < 11; i++) {

            for (int j = 2; j < 6; j++) {
                if (i == 10) {
                    res += j + " * " + i + " = " + j * i + " | ";

                } else if (j * i < 10) {
                    res += j + " * " + i + "  =  " + j * i + " | ";
                } else {
                    res += j + " * " + i + "  = " + j * i + " | ";

                }

            }
            res += "\n";

        }

        res+="-------------------------------------------------------\n";


        for (int i = 1; i < 11; i++) {

            for (int j = 6; j < 10; j++) {
                if (i == 10) {
                    res+=j + " * " + i + " = " + j * i + " | ";

                } else if (j * i < 10) {
                    res+=j + " * " + i + "  =  " + j * i + " | ";
                } else {
                    res+=j + " * " + i + "  = " + j * i + " | ";

                }

            }
            res += "\n";

        }

        return res;

    }
}
