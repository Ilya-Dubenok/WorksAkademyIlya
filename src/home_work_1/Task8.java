package home_work_1;

public class Task8 {

    public static void main(String[] args) {
        byte b = -128;
        System.out.println(toBinaryString(b));

        byte num = -100;
        System.out.println(toBinaryString(num));
        System.out.println(Integer.toBinaryString(num));
    }

    /**
     * Метод принимает byte и возвращет его представление в двичном коде в типе String
     * @param num
     * @return
     */
    public static String toBinaryString(byte num) {
        String res = "";
        byte num2 = num;
        while (num != 0) {
            //эта часть вывод прямой код
            if (num >= 0) {
                if (num % 2 == 0) {
                    res = "0".concat(res);
                } else {
                    res = "1".concat(res);
                }
            //эта часть выводит обратный код
            } else {
                if (num % 2 == 0) {
                    res = "1".concat(res);
                } else {
                    res = "0".concat(res);
                }
            }
            num /= 2;
        }
        /*если результат на данный момент меньше 8 бит (чисел) - эта часть
        дополняем String до 8 бит
        */
                while (res.length() < 8) {
            if (num2 >= 0) {
                res = "0".concat(res);
            } else {
                res = "1".concat(res);
            }
        }
        /*Эта часть выводит дополнительный код из обратного кода*/
        if (num2 < 0) {
            char [] chars = res.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                if (chars[i] == '0') {
                    chars[i] = '1';
                    break;
                } else {
                    chars[i] = '0';
                }
            }
            res = String.valueOf(chars);

        }
        return res;
    }
}
