package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {
  @Test
  public void shouldRecommend100if900() {
    int amount = 900;
    int expected = 100;

    CashbackHackService service = new CashbackHackService();

    int actual = service.remain(amount);

    Assert.assertEquals(expected, actual);
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
  public void shouldRecommend0if1000() {
    int amount = 1000;
    int expected = 0;

    CashbackHackService service = new CashbackHackService();

    int actual = service.remain(amount);

    Assert.assertEquals(actual, expected);
  }
}
