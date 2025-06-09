package com.juniair.kim.cafekisok.unit.beverages;


import com.juniair.kim.cafekisok.unit.CafeKiosk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AmericanoTest {

    @Test
    public void nameEqualsWithJUnit5() throws Exception {

        //given
        CafeKiosk cafeKiosk = new CafeKiosk();
        Americano americano = new Americano();

        // when
        cafeKiosk.addBeverage(americano);

        //then
        Assertions.assertEquals(cafeKiosk.getOrder().getBeverages().get(0).getName(), americano.getName());

    }


}
