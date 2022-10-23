package home_work_1;

public class Task4_1 {

    public static void main(String[] args) {
        //по задаче нужно взять два случайных числа, одно из которых четное,
        //второе нечетное

        //берем случайное число, чтобы оно при этом не было равно 0
        int even = (int) ((Math.random()+0.1)*100);
        //делаем его наверняка нечетным
        even = even % 2 == 0 ? even + 1 : even;

        //берем случайное число и делаем его наверняка четным
        int odd = (int) (Math.random()*100)*2;

        int result = odd % 2 != 0 ? odd : even;

        //Выводим числа и результат
        System.out.println("Число odd: "+odd+" Число even: "+even+
                "\nНечетное из них: "+result);

    }
}
