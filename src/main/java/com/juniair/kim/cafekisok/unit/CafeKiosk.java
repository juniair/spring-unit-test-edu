package com.juniair.kim.cafekisok.unit;

import com.juniair.kim.cafekisok.order.Order;
import com.juniair.kim.cafekisok.unit.beverages.Beverage;
import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CafeKiosk {

    private List<Beverage> beverages = new ArrayList<>();

    // 음료 추가 기능
    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
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
        return new Order(LocalDate.now(), beverages);
    }


}
