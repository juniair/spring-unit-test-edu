package com.juniair.kim.cafekisok.unit;


import com.juniair.kim.cafekisok.unit.beverages.Americano;
import com.juniair.kim.cafekisok.unit.beverages.Beverage;

public class CafeKioskTest {

    public void addBeverageTest() {
        CafeKiosk cafeKiosk = new CafeKiosk();
        Americano americano = new Americano();
        cafeKiosk.addBeverage(americano);

        Beverage beverage = cafeKiosk.getOrder().getBeverages().get(0);
        System.out.println("추가 된 음료: " + beverage.getName());
        System.out.println("추가 된 음료가격: " + beverage.getPrice());
    }

}
