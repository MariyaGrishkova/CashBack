package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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