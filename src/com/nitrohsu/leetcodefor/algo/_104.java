package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;
import com.nitrohsu.leetcodefor.model.TreeNode;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _104 extends Solution {

    public _104() {
        super(104, "MaxDepthOfTree");
    }

    @Override
    public void run() {

        TreeNode node = new TreeNode(10);
        input(node);

        output(maxDepth(node));
    }

    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left != null && root.right != null) {
            return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
        } else if (root.left != null) {
            return 1 + maxDepth(root.left);
        } else if (root.right != null) {
            return 1 + maxDepth(root.right);
        } else {
            return 1;
        }
    }
}
