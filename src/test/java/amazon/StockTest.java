package amazon;

import org.example.stocks.StockController;
import org.example.stocks.StockModel;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StockTest
{
    private StockController sc = new StockController();
    @Test
    void getStock() throws InterruptedException {
        StockModel res = sc.getStockEndPoint();
        assertThat(res.getName()).isEqualTo("SHB");
    }
}
