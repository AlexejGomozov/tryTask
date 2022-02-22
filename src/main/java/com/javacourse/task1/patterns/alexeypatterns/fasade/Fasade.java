package com.javacourse.task1.patterns.alexeypatterns.fasade;

public class Fasade {

    private Fasade(){}

    public static double rubToUSD(double rub){
        MyURL url = new MyURL();
        url.href = "http://какой-то-сайт-с-курсом-валют";
        Request r = new Request(url);
        String result = r.sendRequest();
        Parser p = new Parser();
        double ratio = p.gerRatioCurrency(result);
        return ((double) Math.round(rub * 100/ratio)/100);
    }
}
