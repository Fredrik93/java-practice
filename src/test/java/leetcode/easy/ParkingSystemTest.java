package leetcode.easy;

import org.example.leetcode.easy.ParkingSystem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingSystemTest {
    private ParkingSystem ps;

    @Test
    void testOk(){
        ps = new ParkingSystem(1,1,0);
        assertTrue(ps.addCar(1));
        assertTrue(ps.addCar(2));
        assertFalse(ps.addCar(25));
        assertFalse(ps.addCar(3));
        assertFalse(ps.addCar(1));
    }
}
