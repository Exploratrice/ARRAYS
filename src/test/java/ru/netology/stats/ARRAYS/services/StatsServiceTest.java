package ru.netology.stats.ARRAYS.services;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldCalcSumSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 180;
        long actual = service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMiddleValueSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 15;
        long actual = service.middleValueSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMaxSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 8;
        long actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMinSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 9;
        long actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcBelowMiddleValueSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 10;
        long actual = service.belowMiddleValueSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcOverMiddleValueSales() {
        StatsService service = new StatsService();

        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        int expected = 11;
        long actual = service.overMiddleValueSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
