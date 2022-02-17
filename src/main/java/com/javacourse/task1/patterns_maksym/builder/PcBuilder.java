package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.cases.Cases;
import com.javacourse.task1.patterns_maksym.builder.details.cases.LaptopCase;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Intel;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Processor;

public class PcBuilder implements Builder {
    Cases cases = new Cases();
    Processor processor=new Processor();
    String ram;
    String battery;
    String rom;
    String graphicCard;

    @Override
    public void addCase(Cases newCase) {
    cases=newCase;
    }

    @Override
    public void addProcessor(Processor newProcessor) {
    processor=newProcessor;
    }

    @Override
    public void addRam() {

    }

    @Override
    public void addRom() {

    }

    @Override
    public void addGraphicCard() {

    }

    @Override
    public void getResult() {

    }

    public static void main(String[] args) {
        PcBuilder one=new PcBuilder();
        one.addProcessor(new Intel());
        one.addCase(new LaptopCase());
        System.out.println(one.processor.getCost());
        System.out.println(one.cases.getName());
    }
}
