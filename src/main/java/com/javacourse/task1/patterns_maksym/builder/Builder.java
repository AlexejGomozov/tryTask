package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.cases.Cases;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Processor;

public interface Builder {
    void addCase(Cases newCase);
    void addProcessor(Processor processor);
    void addRam();
    void addRom();
    void addGraphicCard();
    void getResult();
}
