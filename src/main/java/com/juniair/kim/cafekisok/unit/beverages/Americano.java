package com.juniair.kim.cafekisok.unit.beverages;

public class Americano implements Beverage {


    @Override
    public int getPrice() {
        return 1000;
    }

    @Override
    public String getName() {
        return "아메리카노";
    }
}
