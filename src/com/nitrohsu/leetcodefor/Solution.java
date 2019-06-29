package com.nitrohsu.leetcodefor;

import com.nitrohsu.leetcodefor.model.ListNode;
import com.nitrohsu.leetcodefor.model.TreeNode;
import com.nitrohsu.leetcodefor.utils.CollectionUtils;

import java.util.List;

public abstract class Solution {

    public int index;
    public String name;

    public Solution(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public void before() {
        System.out.println(String.format("Index: %s-%s", String.format("%03d", index), name));
    }

    public void input(Object object) {
        System.out.println("Input: " + io(object));
    }

    public abstract void run();

    public void output(Object object) {
        System.out.println("Output: " + io(object));
    }

    public void after() {
        System.out.println("\n--------------------------");
    }

    private String io(Object object) {
        if (object == null) {
            return "";
        }

        if (object instanceof int[]) {
            return CollectionUtils.integerArrayToString((int[]) object);
        } else if (object instanceof char[]) {
            return new String((char[]) object);
        } else if (object instanceof String[]) {
            return CollectionUtils.StringArrayToString((String[]) object);
        } else if (object instanceof TreeNode) {
            return String.valueOf(((TreeNode) object).val);
        } else if (object instanceof ListNode) {
            return CollectionUtils.listNodeToString((ListNode) object);
        } else if (object instanceof List) {
            return CollectionUtils.listToString((List) object);
        } else if (object instanceof String) {
            return object.toString();
        } else {
            return object.toString();
        }
    }
}
