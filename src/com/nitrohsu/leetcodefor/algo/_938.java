package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;
import com.nitrohsu.leetcodefor.model.TreeNode;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _938 extends Solution {

    public _938() {
        super(938, "RangeSumOfDST");
    }

    @Override
    public void run() {
        TreeNode node = new TreeNode(10);
        rangeSumBST(node, 1, 10);
    }

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
