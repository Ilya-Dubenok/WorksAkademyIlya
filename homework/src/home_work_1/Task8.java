package home_work_1;

public class Task8 {

    public static void main(String[] args) {
        byte b = -128;
        System.out.println(toBinaryString(b));

    }

    public static String toBinaryString(byte num) {
        String res = "";
        byte num2 = num;
        while (num != 0) {
            //прямой код
            if (num >= 0) {
                if (num % 2 == 0) {
                    res = "0".concat(res);
                } else {
                    res = "1".concat(res);
                }
            //обратный код
            } else {
                if (num % 2 == 0) {
                    res = "1".concat(res);
                } else {
                    res = "0".concat(res);
                }
            }
            num /= 2;
        }
        //добиваем до 8 бит
        while (res.length() < 8) {
            if (num2 >= 0) {
                res = "0".concat(res);
            } else {
                res = "1".concat(res);
            }
        }
        //the most tricky part -- представление дополнительного кода
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
