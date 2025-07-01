package com.juniair.kim.cafekisok.unit;

import com.juniair.kim.cafekisok.order.Order;
import com.juniair.kim.cafekisok.unit.beverages.Beverage;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CafeKiosk {

    private final LocalTime SHOP_OPEN_TIME = LocalTime.of(10, 0);
    private final LocalTime SHOP_END_TIME = LocalTime.of(20, 0);

    private List<Beverage> beverages = new ArrayList<>();

    // 음료 추가 기능
    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }


    public void addBeverages(Beverage beverage, int count) {

        if(count <= 0) {
            throw new IllegalArgumentException("갯수는 0이하가 될 수 없습니다.");
        }

        for(int i = 0; i < count; i++) {
            addBeverage(beverage);
        }

    }

    // 음료 삭제 기능
    public void removeBeverage(Beverage beverage) {
        beverages.remove(beverage);
    }

    // 음료 전체 삭제
    public void clear() {
        beverages.clear();
    }

    // 음료 총 금액 반환 메서드
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Beverage beverage : beverages) {
            totalPrice += beverage.getPrice();
        }

        return totalPrice;
    }

    public Order getOrder() {
        // LocalDateTime으로 현재 날짜 시간 가지고
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalTime currentTime = currentDateTime.toLocalTime();
        if (currentTime.isBefore(SHOP_OPEN_TIME) || currentTime.isAfter(SHOP_OPEN_TIME)) {
            throw new IllegalArgumentException("현재 주문을 할 수 없는 시간입니다.");
        }
        return new Order(LocalDate.now(), beverages);
    }


}
