import model.TreeNode;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _938RangeSumOfDST {



    class Solution {
        int sum = 0;

        public int rangeSumBST(TreeNode root, int L, int R) {
            if (root == null) {
                return 0;
            }
            if (root.val >= L && root.val <= R) {
                sum += root.val;
            }
            if (root.val < L) {
                rangeSumBST(root.right, L, R);
            } else if (root.val > R) {
                rangeSumBST(root.left, L, R);
            } else {
                rangeSumBST(root.right, L, R);
                rangeSumBST(root.left, L, R);
            }

            return sum;
        }
    }
}
