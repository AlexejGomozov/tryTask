package com.javacourse.task1.patterns.maximpatterns.builder;

import com.javacourse.task1.patterns.maximpatterns.builder.details.cases.Cases;
import com.javacourse.task1.patterns.maximpatterns.builder.details.ram.Ram;
import com.javacourse.task1.patterns.maximpatterns.builder.details.rom.Rom;
import com.javacourse.task1.patterns.maximpatterns.builder.details.processor.Processor;

public interface PcBuilderInterface {
    void startOrReset();                     //создаёт или перезаписывает собираемый объект
    void addName(String name);
    void addCase(Cases newCase);
    void addProcessor(Processor processor);
    void addRam(Ram ram);
    void addRom(Rom rom);
    void addGraphicCard(boolean choice);
    PcClass getResult();                         //Возвращает собранный объект

}
