package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashBackServiceTest {
    CashBackService cashBackService = new CashBackService();

    @Test
    public void shouldCheckRemain() {
        assertEquals(100, cashBackService.remain(900));
    }

    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        assertEquals(0, cashBackService.remain(1000));
    }
}