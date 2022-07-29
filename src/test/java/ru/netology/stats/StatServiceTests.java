package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTests {

    @Test
    public void testSumAllMonth () {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

       long actual = service.allMonth(sales);
       long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testAvgSales () {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 15;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testCountBelowAvg () {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.countBelowAvg(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testCountAboveAvg () {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.countAboveAvg(sales);
        int expected = 5;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMinSales () {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void testMaxSales () {
        StatService service = new StatService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 21, 7, 14, 14, 18};

        int actual = service.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(actual, expected);
    }
}
