package com.javacourse.task1.testCode;

import com.javacourse.task1.patterns.maximpatterns.builder.Constructor;
import com.javacourse.task1.patterns.maximpatterns.builder.PcBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorTest {
    Constructor con;
    int expectedCost;
    PcBuilder build;

    @BeforeEach
    void prepare(){
        con=new Constructor();
        build= new PcBuilder();
        Constructor.builder.startOrReset();
        expectedCost = 300;
    }

    @Test
    void costShouldBeClear(){
        con.powerPc();
        Constructor.builder.startOrReset();
        Assertions.assertEquals  (0, Constructor.builder.getResult().getPcCost());
    }

    @Test
    void costPowerPcShouldCost1180(){
        con.powerPc();
        Assertions.assertEquals(1180, Constructor.builder.getResult().getPcCost());
    }

    @Test
    void costWeakPcShouldCost540(){
        con.weakPc();
        Assertions.assertEquals(540, Constructor.builder.getResult().getPcCost());
    }
}
