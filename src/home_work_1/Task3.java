package home_work_1;

public class Task3 {
    public static void main(String[] args) {


        System.out.println(demonstrationOfMathWork
                (-254,23,22.5,35,5,7));

    }

    /**
     * Выводит стринг с демонстрацией работы некоторых методов класса Math:
     *  первое число по модулю, сравнивает второе и третье числа,
     *  косинус 4 числа (как если оно в градусах),
     *  гипотенузу, исчисленноую по длине двух катетов (1 и 2 число)
     *  окгругление гипотенузы разными способами
     *
     *
     * @param firstNum число, которое будем выводить по модулю
     * @param secondNum первое число для сравнения
     * @param thirdNum второе число для сравнения
     * @param angle угол, косинус которого будем определять
     * @param catet1 катет1 для нахождения гипотенузы
     * @param catet2 катет2 для нахождения гипотенузы
     * @return
     */
    public static String demonstrationOfMathWork (double firstNum, double secondNum, double thirdNum,
    double angle, double catet1, double catet2) {
        double hipotenuza = getHipotenuza(catet1,catet2);
        StringBuffer sb = new StringBuffer("Абсолютное (по модулю) значение числа "+firstNum+": "+Math.abs(firstNum)+"\n");
        sb.append("Наибольшее значение "+secondNum+" и "+thirdNum+" равно: "+Math.max(secondNum, thirdNum)+"\n")
                .append("Косинус угла в "+angle+" градусов: "+getCos(angle)+"\n")
                .append("Длина гипотенузы : " + hipotenuza+"\n")
                .append("Гипотенуза, окгругленная методом Math.round(): " + Math.round(hipotenuza) + "\n")
                .append("Гипотенуза, окгругленная методом Math.floor(): " + Math.floor(hipotenuza) + "\n")
                .append("Гипотенуза, округленная до трех знаков после запятой: "+getRoundedNum(hipotenuza));

        return sb.toString();

    }

    /**
     * Возвращает значение числа с округлением до трех знаков после запятой
     * @param num число джля окгругления
     * @return
     */
    public static double getRoundedNum(double num) {
        return Math.round(num * 1000.0) / 1000.0;
    }

    /**
     * Возвращает значение косинуса угла, принимая угол в градусах
     * @param angle угол в градусах
     * @return косинус угла
     */
    public static double getCos(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    /**
     * Возвоащает длину гипотенузы при заданных двух катетах
     * @param catet1
     * @param catet2
     * @return
     */
    public static double getHipotenuza(double catet1, double catet2) {
        return  Math.sqrt(Math.pow(catet1, 2)+Math.pow(catet2, 2));
    }
}
