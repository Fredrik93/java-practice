package org.example.stocks;

public class StockService {

    public StockModel getStock(MonitorInfo info) throws InterruptedException {
        StockModel stock = getStockFromDb(info);
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(500);

            if (stock.getValue() < 200) {
                stock.setValue(300);
            }

            long end = System.currentTimeMillis() - start;
            info.setDuration(end);
            info.setReason(MonitorInfo.Reason.WORKS);
            return stock;

        } catch (IllegalArgumentException e ){
            System.out.println(e.getMessage());
            info.setReason(MonitorInfo.Reason.NOT_WORKING);

        } finally {
            stock.setValue(1);
            info.setOtherDuration(6789);
            info.setReason(MonitorInfo.Reason.FINAL_STAGE);

        }
        return stock;
    }
    public StockModel getNullPointer(StockModel stock){
        return null;
    }
    public void fillHistory(){
        throw new ArithmeticException();
    }

    private StockModel getStockFromDb(MonitorInfo info) {
        info.setOtherDuration(12345);
        // fake fetch a stock
        return new StockModel("SHB", 100);
    }


}
