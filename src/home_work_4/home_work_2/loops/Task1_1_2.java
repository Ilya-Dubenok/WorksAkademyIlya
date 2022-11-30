package home_work_4.home_work_2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Task1_1_2 {

    @Test
    public void test1() {
        home_work_2.loops.Task1_1_2 task = new home_work_2.loops.Task1_1_2(0);
        assertEquals("0 * 0 = 0", task.message);

    }

    @Test
    public void test2() {
        home_work_2.loops.Task1_1_2 task = new home_work_2.loops.Task1_1_2(1);
        assertEquals("1 * 1 = 1", task.message);

    }

    @Test
    public void test3() {
        home_work_2.loops.Task1_1_2 task = new home_work_2.loops.Task1_1_2(-5);
        assertEquals("Введенное число меньше нуля!", task.message);

    }

    @Test
    public void test4() {
        home_work_2.loops.Task1_1_2 task = new home_work_2.loops.Task1_1_2(7);
        assertEquals("1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040", task.message);

    }

    @Test
    public void test5() {
        home_work_2.loops.Task1_1_2 task = new home_work_2.loops.Task1_1_2(21);
        assertTrue(task.message.contains("Произошло переполнение, дальнейшие операции " +
                "не дадут верного результата.") && !task.message.contains("* 21"));

    }

    @Test
    public void test6() {
        home_work_2.loops.Task1_1_2 task = new home_work_2.loops.Task1_1_2(5);
        assertEquals("1 * 2 * 3 * 4 * 5 = 120", task.message);

    }

    
}
