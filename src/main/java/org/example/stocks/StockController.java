package org.example.stocks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StockController {
    private static final Logger log = LoggerFactory.getLogger(StockController.class);
    private final StockService stockService = new StockService();

    public StockModel getStockEndPoint() throws InterruptedException {
        MonitorInfo info = new MonitorInfo();
        System.out.println(info);
        StockModel stock = null;

        try {
            stock = stockService.getStock(info);

            stock = stockService.getNullPointer(stock);

            int value = stock.getValue();
            System.out.println("value:" +  value);
        } catch (NullPointerException np){
            log.error("e: ", np);
        }

        System.out.println(info);
        return stock;
    }
}
