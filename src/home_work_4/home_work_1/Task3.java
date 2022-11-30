package home_work_4.home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Task3 {

    @Test
    @DisplayName("проеврка на правильность округления, когда последнее число ниже 5")
    public void getRoundedNum1() {
        Assertions.assertEquals(9563.656,home_work_1.Task3.getRoundedNum(9563.6563));
    }

    @Test
    @DisplayName("проеврка на правильность округления, когда последнее число 5")
    public void getRoundedNum2() {
        Assertions.assertEquals(9563.657,home_work_1.Task3.getRoundedNum(9563.6565));
    }

    @Test
    @DisplayName("проеврка на правильность округления для отрицат. чисел")
    public void getRoundedNum3() {
        Assertions.assertEquals(-656.122,home_work_1.Task3.getRoundedNum(-656.122157));
    }

    @Test
    @DisplayName("проеврка на правильность округления для чисел -0.xxx")
    public void getRoundedNum4() {
        Assertions.assertEquals(-0.122,home_work_1.Task3.getRoundedNum(-0.122157));
    }

    @Test
    @DisplayName("проеврка на правильность получения косинуса, когда угол 60 градусов")
    public void getCos1() {
        Assertions.assertEquals(0.5,home_work_1.Task3.getRoundedNum(
                home_work_1.Task3.getCos(60)));
    }

    @Test
    @DisplayName("проеврка на правильность получения косинуса, когда угол 0 градусов")
    public void getCos2() {
        Assertions.assertEquals(1,home_work_1.Task3.getRoundedNum(
                home_work_1.Task3.getCos(0)));
    }

    @Test
    @DisplayName("проеврка на правильность получения гипотенузы, когда катеты 3 и 4")
    public void getHipotenuza1() {
        Assertions.assertEquals(5.0, home_work_1.Task3.getHipotenuza(3, 4));

    }

    @Test
    @DisplayName("проеврка на правильность получения гипотенузы, когда катеты 4 и 3")
    public void getHipotenuza2() {
        Assertions.assertEquals(5.0, home_work_1.Task3.getHipotenuza(4, 3));

    }
}
