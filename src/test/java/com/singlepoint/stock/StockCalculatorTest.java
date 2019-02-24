package com.singlepoint.stock;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class StockCalculatorTest {

    @Test
    public void calculateWithStockListNull() {
        int[] stocks = null;
        StockCalculator stockCalculator = new StockCalculator();
        int result = stockCalculator.calculate(stocks);
        assertEquals(0, result);
    }

    @Test
    public void calculateWithStockListLessThan2() {
        int[] stocks = new int[]{1};
        StockCalculator stockCalculator = new StockCalculator();
        int result = stockCalculator.calculate(stocks);
        assertEquals(0, result);
    }

    @Test
    public void calculateWithSmallDataSet(){
        int[] stocks = new int[]{20, 40, 52, 15, 30, 50, 10, 25};
        StockCalculator stockCalculator = new StockCalculator();
        int result = stockCalculator.calculate(stocks);
        assertEquals(35, result);
    }

    @Test
    public void calculateWithLargeDataSet(){
        int[] stocks = largetStockList();
        StockCalculator stockCalculator = new StockCalculator();
        int result = stockCalculator.calculate(stocks);
        assertEquals(99999999, result);
    }

    private int[] largetStockList() {
        int[] stocks = new int[100000000];
        for (int i = 1; i < 100000000; i++) {
            stocks[i] = i;
        }
        return stocks;
    }
}