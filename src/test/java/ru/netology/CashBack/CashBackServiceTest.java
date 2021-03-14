package ru.netology.CashBack;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

class CashBackServiceTest {
    ru.netology.service.CashBackService cashBackService = new ru.netology.service.CashBackService();

    @Test
    public void shouldCheckRemain() {
        assertEquals (cashBackService.remain(900), 100);
    }

    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        assertEquals(cashBackService.remain(1000), 0 );

    }
}