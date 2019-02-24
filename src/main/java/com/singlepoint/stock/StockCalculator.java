package com.singlepoint.stock;

import org.springframework.stereotype.Component;

@Component
public class StockCalculator {

    public int calculate(int[] stocks){
        if(stocks != null && stocks.length >= 2){
            int maxProfit = 0;
            int minPrice = stocks[0];
            for (int i = 0; i < stocks.length; i++) {
                minPrice = Math.min(minPrice, stocks[i]);
                if( stocks[i] - minPrice > maxProfit){
                    maxProfit = stocks[i] - minPrice;
                }
            }
            return maxProfit;
        }
        return 0;
    }
}
