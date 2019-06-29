package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;
import com.nitrohsu.leetcodefor.model.TreeNode;

public class _671 extends Solution {
    public _671() {
        super(671, "Merge Two Binary Trees");
    }

    @Override
    public void run() {

        TreeNode left = new TreeNode(1);
        TreeNode right = new TreeNode(2);
        input(left);
        input(right);


        output(left);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

        TreeNode node;
        if (t1 == null && t2 == null) {
            return null;
        } else if (t1 == null) {
            node = new TreeNode(t2.val);

            node.left = mergeTrees(null, t2.left);
            node.right = mergeTrees(null, t2.right);
        } else if (t2 == null) {
            node = new TreeNode(t1.val);

            node.left = mergeTrees(t1.left, null);
            node.right = mergeTrees(t1.right, null);
        } else {
            node = new TreeNode(t1.val + t2.val);

            node.left = mergeTrees(t1.left, t2.left);
            node.right = mergeTrees(t1.right, t2.right);
        }

        return node;
    }
}
