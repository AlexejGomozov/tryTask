package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.cases.Cases;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Processor;
import com.javacourse.task1.patterns_maksym.builder.details.ram.Ram;
import com.javacourse.task1.patterns_maksym.builder.details.rom.Rom;

public class PcBuilder implements Builder {
    private Pc pc;


    @Override
    public void startOrReset() {
    pc = new Pc();
    }

    @Override
    public void addName(String name){
        pc.pcName=name;
    }

    @Override
    public void addCase(Cases newCase) {
        pc.casesName=newCase.getName();
        pc.casesCost=newCase.getCost();
    }

    @Override
    public void addProcessor(Processor newProcessor) {
        pc.processorName=newProcessor.getName();
        pc.processorCost=newProcessor.getCost();
    }

    @Override
    public void addRam(Ram ram) {
        pc.ramName=ram.getName();
        pc.ramCost=ram.getCost();
    }

    @Override
    public void addRom(Rom rom) {
        pc.romName=rom.getName();
        pc.romCost=rom.getCost();

    }

    @Override
    public void addGraphicCard(boolean choice) {
        if (choice){
            pc.graphicCardName="Graphic Card exist";
            pc.graphicCardCost=200;
        }
    }

    @Override
    public Pc getResult() {
        return pc;
    }
}
