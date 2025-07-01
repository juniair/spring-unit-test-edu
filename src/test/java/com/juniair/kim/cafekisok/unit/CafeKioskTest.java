package com.juniair.kim.cafekisok.unit;


import com.juniair.kim.cafekisok.unit.beverages.Americano;
import com.juniair.kim.cafekisok.unit.beverages.Beverage;
import com.juniair.kim.cafekisok.unit.beverages.Latte;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class CafeKioskTest {

    void addBeverageTest() {

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
    void totalCountTestWithEqualToMethod() {

        // given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage americano = new Americano();
        Beverage latte = new Latte();

        // when
        cafeKiosk.addBeverage(americano);
        cafeKiosk.addBeverage(latte);

        // than
        assertThat(cafeKiosk.getBeverages().size()).isEqualTo(2);
    }

    @Test
    void totalCountTestWithHasSizeMethod() {

        // given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage americano = new Americano();
        Beverage latte = new Latte();

        // when
        cafeKiosk.addBeverage(americano);
        cafeKiosk.addBeverage(latte);

        // than
        assertThat(cafeKiosk.getBeverages()).hasSize(2);
    }

    @Test
    void hasBeverageTestForName() {

        // given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Beverage americano = new Americano();

        // when
        cafeKiosk.addBeverage(americano);

        // than
        assertThat(cafeKiosk.getBeverages().get(0).getName()).isEqualTo("아메리카노");
    }

    @Test
    void removeBeverageTest() {
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
    void clearBeverageTest() {
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


    // 아메리카노 2개 추가 테스트
    @Test
    void addBeveragesEqualsTest() {

        // given
        // 카페 키오스크 객체 생성
        CafeKiosk cafeKiosk = new CafeKiosk();

        // 아메리카노 객체 생성
        Beverage americano = new Americano();

        // when

        // 아메리카노 2잔 추가
        cafeKiosk.addBeverages(americano, 2);
        Beverage firstAmericano = cafeKiosk.getBeverages().get(0);
        Beverage secondAmericano = cafeKiosk.getBeverages().get(1);

        // then
        // 첫번쨰 아메리카노와 두번쨰 아메리카노 비교
        assertThat(firstAmericano).isEqualTo(secondAmericano);

    }

    // 아메리카노 0개 추가
    @Test
    void addBeveragesThrowTest() {
        // given
        // 카페 키오스크 객체 생성
        CafeKiosk cafeKiosk = new CafeKiosk();

        // 아메리카노 객체 생성
        Beverage americano = new Americano();

        // when & then
        // 아메리카노 0잔 추가시 예외 발생 확인
        assertThatThrownBy(() -> cafeKiosk.addBeverages(americano, 0))
                .isInstanceOf(IllegalArgumentException.class)   // 발생한 예외 확인(then)
                .hasMessage("갯수는 0이하가 될 수 없습니다.");      // 예외에 대한 메시지 확인(then)
    }



}
