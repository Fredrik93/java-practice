package amazon;

import org.example.amazon.DroneDelivery;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DroneDeliveryTest
{
    @Disabled
    @Test
    void testOk(){
       int result = DroneDelivery.getDeliveryTime(1,2,1,1);
        assertThat(result).isEqualTo(3);
    }
    @Disabled
    @Test
    void testOk1(){
        int result = DroneDelivery.getDeliveryTime(1,1,1,1);
        assertThat(result).isEqualTo(2);
    }
    @Disabled
    @Test
    void testOk2(){
        int result = DroneDelivery.getDeliveryTime(2,3,1,4);
        assertThat(result).isEqualTo(0);
    }
}
