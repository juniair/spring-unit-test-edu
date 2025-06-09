package com.juniair.kim.cafekisok.unit;

import com.juniair.kim.cafekisok.unit.beverages.Americano;
import com.juniair.kim.cafekisok.unit.beverages.Latte;

public class CafeKioskRunner {

    public static void main(String[] args) {

        // 키오스크 객체 생성
        CafeKiosk kiosk = new CafeKiosk();

        // 키오스크 객체에 음료 추가 메서드 호출
        Americano americano = new Americano();
        kiosk.addBeverage(americano);

        // 추가 안내 메시지 출력
        System.out.println(americano.getName() + " 추가");

        // 라떼 추가
        Latte latte = new Latte();
        kiosk.addBeverage(latte);

        System.out.println(latte.getName() + " 추가");

        // 키오스크 객체로 총 가격 얻기
        int totalPrice = kiosk.getTotalPrice();

        // 추가된 음료 수 반환
        int totalCount = kiosk.getOrder().getBeverages().size();
        System.out.println("음료 총 갯수: " + totalCount);

        // 총가격 출력
        System.out.println("음료 총 가격: " + totalPrice);
    }
}
