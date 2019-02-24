package com.singlepoint.stock;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfitCalculatorTest {

    @Test
    public void calculateWithStockListNull() {
        int[] prices = null;
        ProfitCalculator profitCalculator = new ProfitCalculator();
        int result = profitCalculator.calculate(prices);
        assertEquals(0, result);
    }

    @Test
    public void calculateWithStockListLessThan2() {
        int[] prices = new int[]{1};
        ProfitCalculator profitCalculator = new ProfitCalculator();
        int result = profitCalculator.calculate(prices);
        assertEquals(0, result);
    }

    @Test
    public void calculateWithSmallDataSet(){
        int[] prices = new int[]{20, 40, 52, 15, 30, 50, 10, 25};
        ProfitCalculator profitCalculator = new ProfitCalculator();
        int result = profitCalculator.calculate(prices);
        assertEquals(35, result);
    }

    @Test
    public void calculateWithLargeDataSet(){
        int[] prices = largetPriceList();
        ProfitCalculator profitCalculator = new ProfitCalculator();
        int result = profitCalculator.calculate(prices);
        assertEquals(99999999, result);
    }

    private int[] largetPriceList() {
        int[] prices = new int[100000000];
        for (int i = 1; i < 100000000; i++) {
            prices[i] = i;
        }
        return prices;
    }
}