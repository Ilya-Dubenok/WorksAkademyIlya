package home_work_4.home_work_2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1_3 {

    @Test
    public void test1() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3("-5","0");
        assertEquals("-5.0 ^ 0 = 1.0", task.message);

    }

    @Test
    public void test2() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3("-5","1");
        assertEquals("-5.0 ^ 1 = -5.0", task.message);

    }

    @Test
    public void test3() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3("3.5","3");
        assertEquals("3.5 ^ 3 = 42.875", task.message);

    }


    @Test
    public void test4() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3("3","-3");
        assertEquals("Введено отрицательное число!", task.message);

    }

    @Test
    public void test5() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3("dfg","-3");
        assertEquals("Введено не число", task.message);

    }

    @Test
    public void test6() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3("3","pdlfg");
        assertEquals("Введено не число", task.message);

    }

    @Test
    public void test7() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3("3","3.5");
        assertEquals("Введено дробное число", task.message);

    }

    @Test
    public void test8() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3(null,"3.5");
        assertEquals("Введено не число", task.message);

    }

    @Test
    public void test9() {
        home_work_2.loops.Task1_3 task = new home_work_2.loops.Task1_3("3",null);
        assertEquals("Введено не число", task.message);

    }

}
