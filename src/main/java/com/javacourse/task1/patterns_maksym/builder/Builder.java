package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.cases.Cases;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Processor;
import com.javacourse.task1.patterns_maksym.builder.details.ram.Ram;

public interface Builder {
    void newPc(Pc pc);
    void addCase(Cases newCase);
    void addProcessor(Processor processor);
    void addRam(Ram ram);
    void addRom();
    void addGraphicCard(boolean choice);
    Pc getResult(Pc newPc);
}
