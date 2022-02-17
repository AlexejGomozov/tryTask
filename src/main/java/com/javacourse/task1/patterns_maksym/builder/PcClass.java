package com.javacourse.task1.patterns_maksym.builder;

public class PcClass {       //Класс конструктор для конструированных объектов
    String pcName = "Default Pc(Unnamed)";      //базовые параметры, если строитель не построил часть объекта
    String processorName="no cpu";
    String casesName="no Case";
    String ramName="no RAM";
    String romName="No ROM";
    String graphicCardName="no graphic card";

    int processorCost=0;                        //базовая цена комплектующих равная нулю
    int casesCost=0;
    int ramCost=0;
    int romCost=0;
    int graphicCardCost=0;

    public int getPcCost(){                     //возвращается стоимость всех комплектующих
        return processorCost+casesCost+ramCost+romCost+graphicCardCost;
    }
    public String getPcSpecification(){         //Возвращает строками в удобном виде характеристики объекта
        String name = ("Pc name: " + pcName + "\n");
        String proc = ("Processor type: " + processorName+"\n");
        String cases = ("Case type: " + casesName + "\n");
        String ram = ("Ram capacity: " + ramName + "\n");
        String rom = ("Rom type: " + romName +"\n");
        String card = ("Graphic card: " + graphicCardName +"\n");
        return name + cases + proc + ram + rom + card;
    }
}
