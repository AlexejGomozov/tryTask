package com.javacourse.task1.testCode;

import com.javacourse.task1.patterns_maksym.builder.Constructor;
import com.javacourse.task1.patterns_maksym.builder.PcBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorTest {
    Constructor con;
    int expectedCost;
    PcBuilder build;

    @BeforeEach
    void prepare(){
        con=new Constructor();
        build= new PcBuilder();
        con.builder.startOrReset();
        expectedCost = 300;
    }

    @Test
    void costShouldBeClear(){
        con.powerPc();
        con.builder.startOrReset();
        assertEquals  (0, con.builder.getResult().getPcCost());
    }

    @Test
    void costPowerPcShouldCost1180(){
        con.powerPc();
        assertEquals(1180, con.builder.getResult().getPcCost());
    }

    @Test
    void costWeakPcShouldCost540(){
        con.weakPc();
        assertEquals(540, con.builder.getResult().getPcCost());
    }
}
