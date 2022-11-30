package home_work_4.home_work_2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1_2 {

    @Test
    public void test1() {
        home_work_2.loops.Task1_2 task = new home_work_2.loops.Task1_2(0);
        assertEquals("0 = 0", task.message);

    }

    @Test
    public void test2() {
        home_work_2.loops.Task1_2 task = new home_work_2.loops.Task1_2(-5);
        assertEquals("Отрицательное число", task.message);

    }

    @Test
    public void test3() {
        home_work_2.loops.Task1_2 task = new home_work_2.loops.Task1_2(6554);
        assertEquals("6 * 5 * 5 * 4 = 600", task.message);

    }

    @Test
    public void test4() {
        home_work_2.loops.Task1_2 task = new home_work_2.loops.Task1_2(181232375);
        assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", task.message);

    }
}
