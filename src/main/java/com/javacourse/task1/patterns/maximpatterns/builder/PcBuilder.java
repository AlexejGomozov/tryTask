package com.javacourse.task1.patterns.maximpatterns.builder;

import com.javacourse.task1.patterns.maximpatterns.builder.details.cases.Cases;
import com.javacourse.task1.patterns.maximpatterns.builder.details.ram.Ram;
import com.javacourse.task1.patterns.maximpatterns.builder.details.rom.Rom;
import com.javacourse.task1.patterns.maximpatterns.builder.details.processor.Processor;

public class PcBuilder implements PcBuilderInterface {
    private PcClass pcClass;


    @Override
    public void startOrReset() {
    pcClass = new PcClass();
    }

    @Override
    public void addName(String name){
        pcClass.pcName=name;
    }

    @Override
    public void addCase(Cases newCase) {
        pcClass.casesName=newCase.getName();
        pcClass.casesCost=newCase.getCost();
    }

    @Override
    public void addProcessor(Processor newProcessor) {
        pcClass.processorName=newProcessor.getName();
        pcClass.processorCost=newProcessor.getCost();
    }

    @Override
    public void addRam(Ram ram) {
        pcClass.ramName=ram.getName();
        pcClass.ramCost=ram.getCost();
    }

    @Override
    public void addRom(Rom rom) {
        pcClass.romName=rom.getName();
        pcClass.romCost=rom.getCost();

    }

    @Override
    public void addGraphicCard(boolean choice) {        //можно выбрать существует ли граф.карта или нет
        if (choice){
            pcClass.graphicCardName="Graphic Card exist";
            pcClass.graphicCardCost=200;
        }
    }

    @Override
    public PcClass getResult() {
        return pcClass;
    }
}
