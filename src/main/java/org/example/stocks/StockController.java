package org.example.stocks;

public class StockController {
    private final StockService stockService = new StockService();

    public StockModel getStockEndPoint() throws InterruptedException {
        MonitorInfo info = new MonitorInfo();
        System.out.println(info);

        StockModel stock = stockService.getStock(info);

        System.out.println(info);
        return stock;
    }
}
