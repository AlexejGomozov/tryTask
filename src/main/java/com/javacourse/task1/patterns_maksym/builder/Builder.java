package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.cases.Cases;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Processor;
import com.javacourse.task1.patterns_maksym.builder.details.ram.Ram;
import com.javacourse.task1.patterns_maksym.builder.details.rom.Rom;

public interface Builder {
    void startOrReset();
    void addName(String name);
    void addCase(Cases newCase);
    void addProcessor(Processor processor);
    void addRam(Ram ram);
    void addRom(Rom rom);
    void addGraphicCard(boolean choice);
    Pc getResult();
}
