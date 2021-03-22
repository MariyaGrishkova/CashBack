package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashBackServiceTest {
    CashBackService cashBackService = new CashBackService();

    @Test
    public void shouldCheckRemain() {
        assertEquals(100, cashBackService.remain(900));
    }

    @Test
    public void shouldCheckRemainIfAmountEqualToBoundary() {
        assertEquals(1000, cashBackService.remain(1000));
    }
}