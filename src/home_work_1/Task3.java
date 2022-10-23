package home_work_1;

public class Task3 {
    public static void main(String[] args) {
        //выводим абсолютное значение
        int a = -254;
        System.out.println("Абсолютное (по модулю) значение числа -254: "+Math.abs(a));

        // выводим наибольшее из двух чисел (при этом инт преобразуется в double)
        int b = 23;
        double c = 22.5;
        System.out.println("Наибольшее значение 23 и 22.5 равно: "+Math.max(b, c));

        //Есть угол 35 градусов. Найти его косинус
        double angle = 35.0;
        System.out.println("Косинус угла в 35 градусов: "+Math.cos(Math.toRadians(angle)));
                                                            /*т.к. Math.cos принимает значения в радианах
                                                                необходимо было перевести угол в радианы*/

        //Есть значение катета catet1 = 5, катета catet2 = 7, найти длину гипотенузы
        double catet1 = 5.0, catet2 = 7.0;
        double hipotenuza = Math.sqrt(Math.pow(catet1, 2)+Math.pow(catet2, 2));
        System.out.println("Длина гипотенузы: "+hipotenuza);

        //округлим полученное значение гипотенузы несколькими способами
        System.out.println("Гипотенуза, окгругленная методом Math.round(): "
                +Math.round(hipotenuza)); // результат лонг = 9(округление до целого)
        System.out.println("Гипотенуза, окгругленная методом Math.floor(): "
                +Math.floor(hipotenuza)); // результат double = 8.0(округление до низа)

        //округлим до трех знаков после запятой
        System.out.println("Гипотенуза, округленная до трех знаков после запятой: "
                +Math.round(hipotenuza*1000.0)/1000.0);

    }
}
