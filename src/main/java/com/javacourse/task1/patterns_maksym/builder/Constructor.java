package com.javacourse.task1.patterns_maksym.builder;

import com.javacourse.task1.patterns_maksym.builder.details.cases.FullSizeCase;
import com.javacourse.task1.patterns_maksym.builder.details.cases.LaptopCase;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Amd;
import com.javacourse.task1.patterns_maksym.builder.details.processor.Intel;
import com.javacourse.task1.patterns_maksym.builder.details.ram.Ram;
import com.javacourse.task1.patterns_maksym.builder.details.rom.Hdd;
import com.javacourse.task1.patterns_maksym.builder.details.rom.Ssd;

public class Constructor {
    public PcBuilder builder = new PcBuilder();
    public void powerPc(){                    //создает заготовленный объекст из строителя
        builder.startOrReset();
        builder.addName("Power pc");
        builder.addCase(new LaptopCase());
        builder.addProcessor(new Intel());
        builder.addRam(new Ram(8));
        builder.addRom(new Ssd());
        builder.addGraphicCard(true);
    }

    public void weakPc(){                      //смотрите выше
        builder.startOrReset();
        builder.addName("Weak pc");
        builder.addCase(new FullSizeCase());
        builder.addProcessor(new Amd());
        builder.addRam(new Ram(4));
        builder.addRom(new Hdd());
        builder.addGraphicCard(false);
    }
}
