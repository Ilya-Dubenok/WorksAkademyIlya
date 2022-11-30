package home_work_4.home_work_2.loops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1_4 {

    @Test
    public void getNumsBeforeAndAfterOverfilling1() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_4.getNumsBeforeAndAfterOverfilling(1,3));

    }

    @Test
    public void getNumsBeforeAndAfterOverfilling2() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_4.getNumsBeforeAndAfterOverfilling(1,188));

    }

    @Test
    public void getNumsBeforeAndAfterOverfilling3() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_4.getNumsBeforeAndAfterOverfilling(1,-19));

    }

    @Test
    public void getNumsBeforeAndAfterOverfilling4() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_4.getNumsBeforeAndAfterOverfilling(1,600));

    }

    @Test
    public void getNumsBeforeAndAfterOverfilling5() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_4.getNumsBeforeAndAfterOverfilling(60,0));

    }

    @Test
    public void getNumsBeforeAndAfterOverfilling6() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_4.getNumsBeforeAndAfterOverfilling(600,1));

    }

    @Test
    public void getNumsBeforeAndAfterOverfilling7() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_4.getNumsBeforeAndAfterOverfilling(Long.MAX_VALUE,Integer.MAX_VALUE));

    }

    @Test
    public void getNumsBeforeAndAfterOverfilling8() {

        assertDoesNotThrow(()->home_work_2.loops.Task1_4.getNumsBeforeAndAfterOverfilling(Long.MIN_VALUE,Integer.MAX_VALUE));

    }

}
