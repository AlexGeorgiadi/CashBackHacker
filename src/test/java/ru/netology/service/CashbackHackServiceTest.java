package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void shouldRecommend100if900() {
        int amount = 900;
        int expected = 100;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldRecommend1000if0() {
        int amount = 0;
        int expected = 1000;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldRecommend0if1100() {
        int amount = 1100;
        int expected = 0;

        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

}