package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.cases.Cases;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Processor;
import com.javacourse.task1.patterns_maksym.builder.details.ram.Ram;

public class PcBuilder implements Builder {
    private Pc pc;


    @Override
    public void newPc(Pc newPc) {
    newPc=new Pc();
    pc = newPc;
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
    public void addRom() {

    }

    @Override
    public void addGraphicCard(boolean choice) {

    }

    @Override
    public Pc getResult(Pc newPc) {

    }

    public static void main(String[] args) {

    }
}
