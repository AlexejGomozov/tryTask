package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.Intel;
import com.javacourse.task1.patterns_maksym.builder.details.Processor;

public class PcBuilder implements Builder {
    String pcCase;
    Processor processor=new Processor();
    String ram;
    String battery;
    String rom;
    String graphicCard;

    @Override
    public void addCase() {

    }

    @Override
    public void addProcessor(Processor newProcessor) {
    processor=newProcessor;
    }

    @Override
    public void addRam() {

    }

    @Override
    public void addBattery() {

    }

    @Override
    public void addRom() {

    }

    @Override
    public void addGraphicCard() {

    }

    @Override
    public void countCost() {

    }

    public static void main(String[] args) {
        PcBuilder one=new PcBuilder();
        one.addProcessor(new Intel());
        System.out.println(one.processor.getCost());
    }
}
