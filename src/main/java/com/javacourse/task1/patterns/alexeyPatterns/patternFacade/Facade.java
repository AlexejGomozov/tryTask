package com.javacourse.task1.patterns.alexeypatterns.patternfacade;

public class Facade {

    public static double rubToUSD(double rub){
        MyURL url = new MyURL();
        url.href = "https://какой-то-сайт-с-курсом-валют";
        Request r = new Request(url);
        String result = r.sendRequest();
        Parser p = new Parser();
        double ratio = p.getRatioCurrency(result);
        return ((double) Math.round(rub * 100/ ratio)/100);
    }
}
