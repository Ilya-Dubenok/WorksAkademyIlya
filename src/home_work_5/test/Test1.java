package home_work_5.test;

import home_work_5.containter.DataContainer;
import home_work_5.utils.IntegerComparator;
import home_work_5.utils.StringLengthComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Test1 {


    @Test
    @DisplayName("Проверка на добавление элемента1")
    public void test1() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{null, 1, null, 2});
        Assertions.assertEquals(0, dataContainer.add(0));
    }


    @Test
    @DisplayName("Проверка на добавление элемента2")
    public void test2() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{1, 1, null, 2});
        Assertions.assertEquals(2, dataContainer.add(0));
    }

    @Test
    @DisplayName("Проверка на добавление элемента3")
    public void test3() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{1, 1, 2, null});
        Assertions.assertEquals(3, dataContainer.add(0));
    }

    @Test
    @DisplayName("Проверка на добавление элемента4")
    public void test4() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        Assertions.assertEquals(0, dataContainer.add(0));
    }

    @Test
    @DisplayName("Проверка на взятие элемента 1")
    public void test5() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        dataContainer.add(999);
        Assertions.assertEquals(999, dataContainer.get(0));
    }

    @Test
    @DisplayName("Проверка на взятие элемента 2")
    public void test6() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        dataContainer.add(999);
        Assertions.assertNull(dataContainer.get(1));
    }

    @Test
    @DisplayName("Проверка на удаление индекса 0")
    public void test7() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        Assertions.assertFalse(dataContainer.delete(0));
    }

    @Test
    @DisplayName("Проверка на удаление индекса 1")
    public void test8() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        Assertions.assertFalse(dataContainer.delete(1));
    }

    @Test
    @DisplayName("Проверка на удаление индекса 1")
    public void test8_1() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        dataContainer.add(999);
        Assertions.assertFalse(dataContainer.delete(1));
    }

    @Test
    @DisplayName("Проверка на удаление индекса 0")
    public void test9() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        dataContainer.add(999);
        Assertions.assertTrue(dataContainer.delete(0));
    }

    @Test
    @DisplayName("Проверка на удаление индекса 1")
    public void test10() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        dataContainer.add(999);
        dataContainer.add(15);
        dataContainer.add(153);
        Assertions.assertTrue(dataContainer.delete(1));
    }

    @Test
    @DisplayName("Проверка на удаление индекса 0")
    public void test11() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        dataContainer.add(999);
        dataContainer.add(15);
        dataContainer.add(153);
        Assertions.assertTrue(dataContainer.delete(0));
    }

    @Test
    @DisplayName("Проверка на удаление индекса 2")
    public void test12() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{});
        dataContainer.add(999);
        dataContainer.add(15);
        dataContainer.add(153);
        Assertions.assertTrue(dataContainer.delete(2));
    }

    @Test
    @DisplayName("Проверка на удаление индекса 2")
    public void test13() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{null, 3, null});

        Assertions.assertTrue(dataContainer.delete(2));
    }

    @Test
    @DisplayName("Проверка на удаление элемента 1")
    public void test14() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{null, 3, null});

        Assertions.assertFalse(dataContainer.delete(null));
    }

    @Test
    @DisplayName("Проверка на удаление элемента 2")
    public void test15() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{null, 3, null});

        Assertions.assertFalse(dataContainer.delete(Integer.valueOf(15)));
    }

    @Test
    @DisplayName("Проверка на удаление элемента 3")
    public void test16() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{3, 3, 9});

        Assertions.assertFalse(dataContainer.delete(Integer.valueOf(15)));
    }

    @Test
    @DisplayName("Проверка на удаление элемента 4")
    public void test17() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{null, 3, 3, 9, null});

        Assertions.assertTrue(dataContainer.delete(Integer.valueOf(9)));
    }

    @Test
    @DisplayName("Проверка на удаление элемента 5")
    public void test18() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{1, 2, 3, 77});
        dataContainer.delete(Integer.valueOf(77));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3}, dataContainer.getItems());
    }

    @Test
    @DisplayName("Проверка на удаление элемента 6")
    public void test19() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{1, 2, 3, 77, null});
        dataContainer.delete(Integer.valueOf(55));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 3, 77, null}, dataContainer.getItems());
    }


    @Test
    @DisplayName("Проверка на удаление элемента 7")
    public void test20() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{1, 2, 3, 77, 3});
        dataContainer.delete(Integer.valueOf(3));
        Assertions.assertArrayEquals(new Integer[]{1, 2, 77, 3}, dataContainer.getItems());
    }

    @Test
    @DisplayName("Проверка cортировки 1")
    public void test21() {
        DataContainer<Integer> dataContainer =
                new DataContainer<>(new Integer[]{1, -2, 3, 77, 3});
        dataContainer.sort(new IntegerComparator());
        Assertions.assertArrayEquals(new Integer[]{-2, 1, 3, 3, 77}, dataContainer.getItems());
    }

    @Test
    @DisplayName("Проверка cортировки 2")
    public void test22() {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[]{"1", "22", "333", "55555", "22"});
        dataContainer.sort(new StringLengthComparator());
        Assertions.assertArrayEquals(new String[]{"1", "22", "22", "333", "55555"}, dataContainer.getItems());
    }

    @Test
    @DisplayName("Проверка cортировки 3")
    public void test23() {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[]{"112412", "22", "2", "55555", "232"});
        dataContainer.sort(new StringLengthComparator());
        Assertions.assertArrayEquals(new String[]{"2", "22", "232", "55555", "112412"}, dataContainer.getItems());
    }

    @Test
    @DisplayName("Проверка cортировки с 1 пустым элементом")
    public void test24() {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[]{"112412", "22", null, "55555", "232"});
        dataContainer.sort(new StringLengthComparator());
        Assertions.assertArrayEquals(new String[]{"22", "232", null, "55555", "112412"}, dataContainer.getItems());
    }

    @Test
    @DisplayName("Проверка cортировки с 2 пустыми элементами рядом")
    public void test25() {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[]{"112412", "22", null, null, "232"});
        dataContainer.sort(new StringLengthComparator());
        Assertions.assertArrayEquals(new String[]{"22", "232", null, null, "112412"}, dataContainer.getItems());
    }


    @Test
    @DisplayName("Проверка cортировки с 2 пустыми элементами yt рядом")
    public void test26() {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[]{"112412", "22", null, "4444", null, "333"});
        dataContainer.sort(new StringLengthComparator());
        Assertions.assertArrayEquals(new String[]{"22", "333", null, "4444", null, "112412"}, dataContainer.getItems());
    }

    @Test
    @DisplayName("Проверка cортировки с 1 не пустым элементом")
    public void test27() {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[]{"1", null, null});
        dataContainer.sort(new StringLengthComparator());
        Assertions.assertArrayEquals(new String[]{"1", null, null}, dataContainer.getItems());
    }

    @Test
    @DisplayName("Проверка cортировки с пустыми элементами")
    public void test28() {
        DataContainer<String> dataContainer =
                new DataContainer<>(new String[]{null, null, null});
        dataContainer.sort(new StringLengthComparator());
        Assertions.assertArrayEquals(new String[]{null, null, null}, dataContainer.getItems());
    }


}
