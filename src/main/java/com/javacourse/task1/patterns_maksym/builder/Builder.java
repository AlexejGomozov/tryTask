package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.cases.Cases;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Processor;

public interface Builder {
    void newPc();
    void addCase(Cases newCase);
    void addProcessor(Processor processor);
    void addRam();
    void addRom();
    void addGraphicCard(boolean choice);
    void getResult(Pc newPc);
}
