package com.juniair.kim.cafekisok.unit;


import com.juniair.kim.cafekisok.unit.beverages.Americano;
import com.juniair.kim.cafekisok.unit.beverages.Beverage;
import com.juniair.kim.cafekisok.unit.beverages.Latte;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CafeKioskTest {

    public void addBeverageTest() {

        // given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Americano americano = new Americano();

        // when
        cafeKiosk.addBeverage(americano);
        Beverage beverage = cafeKiosk.getOrder().getBeverages().get(0);

        // then
        System.out.println("추가 된 음료: " + beverage.getName());
        System.out.println("추가 된 음료가격: " + beverage.getPrice());
    }

    @Test
    public void totalCountTest() {

        // given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage americano = new Americano();
        Beverage latte = new Latte();

        // when
        cafeKiosk.addBeverage(americano);
        cafeKiosk.addBeverage(latte);

        // than
        assertThat(cafeKiosk.getBeverages().size()).isEqualTo(2);
        assertThat(cafeKiosk.getBeverages()).hasSize(2);
    }

    @Test
    public void hasBeverageTestForName() {

        // given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage americano = new Americano();

        // when
        cafeKiosk.addBeverage(americano);

        // than
        assertThat(cafeKiosk.getBeverages().get(0).getName()).isEqualTo("아메리카노");
    }

    @Test
    public void removeBeverageTest() {
        // given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage americano = new Americano();

        // when
        cafeKiosk.addBeverage(americano);
        cafeKiosk.removeBeverage(americano);

        // then
        assertThat(cafeKiosk.getBeverages()).hasSize(0);
        assertThat(cafeKiosk.getBeverages()).isEmpty();

    }

    @Test
    public void clearBeverageTest() {
        // given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage americano = new Americano();
        Beverage latte = new Latte();

        // when
        cafeKiosk.addBeverage(americano);
        cafeKiosk.addBeverage(latte);
        cafeKiosk.clear();

        // then
        assertThat(cafeKiosk.getBeverages()).hasSize(0);
        assertThat(cafeKiosk.getBeverages()).isEmpty();
    }

}
