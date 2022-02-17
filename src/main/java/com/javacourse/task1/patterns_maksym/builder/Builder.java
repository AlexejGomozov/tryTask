package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.Processor;

public interface Builder {
    void addCase();
    void addProcessor(Processor processor);
    void addRam();
    void addBattery();
    void addRom();
    void addGraphicCard();
    void countCost();
}
