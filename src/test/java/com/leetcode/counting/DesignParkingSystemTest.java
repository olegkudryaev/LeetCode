package com.leetcode.counting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DesignParkingSystemTest {

    @Test
    void test1(){
        DesignParkingSystem designParkingSystem = new DesignParkingSystem(1, 1, 0);


        boolean b = designParkingSystem.addCar(1);
        Assertions.assertEquals(true, b);
        boolean b1 = designParkingSystem.addCar(2);
        Assertions.assertEquals(true, b1);
        boolean b2 = designParkingSystem.addCar(3);
        Assertions.assertEquals(false, b2);
        boolean b3 = designParkingSystem.addCar(1);
        Assertions.assertEquals(false, b3);
    }
}
