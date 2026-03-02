package leetcode.easy;

import org.example.leetcode.easy.SumBST;
import org.example.leetcode.easy.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SumBSTTest {
    private SumBST bst = new SumBST();
    @Test
    void testOK(){
// [10,5,15,3,7,null,18] as a tree
        TreeNode root = new TreeNode(10,
            new TreeNode(5, new TreeNode(3), new TreeNode(7)),
            new TreeNode(15, null, new TreeNode(18))
        );

        int res = bst.rangeSumBST(root, 7, 15);
        assertThat(res).isEqualTo(32);
    }
}
