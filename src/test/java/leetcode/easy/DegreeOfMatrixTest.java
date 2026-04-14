package leetcode.easy;

import org.example.leetcode.easy.DegreeOfMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DegreeOfMatrixTest {
    private DegreeOfMatrix dm = new DegreeOfMatrix();

        @Test
        void testOk() {
            int[] res = dm.findDegrees(new int[][]{{0, 1, 1}, {1, 0, 1}, {1, 0, 1}});
            assertArrayEquals(new int[]{2, 2, 2}, res);

        }
    @Test
    void testOk1() {
        int[] res = dm.findDegrees(new int[][]{{0,1,0},{1,0,0}, {0,0,0}});
        assertArrayEquals(new int[]{1,1,0}, res);

    }
}
