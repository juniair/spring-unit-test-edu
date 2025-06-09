package com.juniair.kim.cafekisok.order;

import com.juniair.kim.cafekisok.unit.beverages.Beverage;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class Order {

    // 주문 일자
    private final LocalDate orderDate;

    // 주문 음료 목록
    private final List<Beverage> beverages;
}
