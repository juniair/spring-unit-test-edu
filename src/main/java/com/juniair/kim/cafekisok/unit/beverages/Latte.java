package com.juniair.kim.cafekisok.unit.beverages;

public class Latte implements Beverage {


    @Override
    public int getPrice() {
        return 2000;
    }

    @Override
    public String getName() {
        return "라떼";
    }
}
