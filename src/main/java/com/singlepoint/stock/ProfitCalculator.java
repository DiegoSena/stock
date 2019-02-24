package com.singlepoint.stock;

import org.springframework.stereotype.Component;

@Component
public class ProfitCalculator {

    public int calculate(int[] stockPrices){
        if(stockPrices != null && stockPrices.length >= 2){
            int maxProfit = 0;
            int minPrice = stockPrices[0];
            for (int i = 0; i < stockPrices.length; i++) {
                minPrice = Math.min(minPrice, stockPrices[i]);
                if( stockPrices[i] - minPrice > maxProfit){
                    maxProfit = stockPrices[i] - minPrice;
                }
            }
            return maxProfit;
        }
        return 0;
    }
}
