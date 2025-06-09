package com.juniair.kim.cafekisok.unit;

import com.juniair.kim.cafekisok.unit.beverages.Americano;
import com.juniair.kim.cafekisok.unit.beverages.Latte;

public class CafeKioskRunner {

    public static void main(String[] args) {

        // 키오스크 객체 생성
        CafeKiosk kiosk = new CafeKiosk();

        // 키오스크 객체에 음료 추가 메서드 호출
        kiosk.addBeverage(new Americano());

        // 추가 안내 메시지 출력
        System.out.println("아메리카노 추가");

        // 라떼 추가
        kiosk.addBeverage(new Latte());

        // 키오스크 객체로 총 가격 얻기
        int totalPrice = kiosk.getTotalPrice();

        // 추가된 음료 수 반환
        int total = kiosk.getOrder().getBeverages().size();

        // 총가격 출력
        System.out.println("음료 총 가격: " + totalPrice);

    }
}
