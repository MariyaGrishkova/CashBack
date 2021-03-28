package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackServiceTest {
    CashBackService cashBackService = new CashBackService();

    @Test
    public void shouldCheckRemain() {
        assertEquals(cashBackService.remain(900), 100);
    }

    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        assertEquals(cashBackService.remain(1000), 0);
    }
}