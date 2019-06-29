package com.nitrohsu.leetcodefor.utils;

import com.nitrohsu.leetcodefor.model.ListNode;

import java.util.List;

public class CollectionUtils {

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static String listNodeToString(ListNode node) {

        StringBuilder builder = new StringBuilder();

        for (; node != null; node = node.next) {
            builder.append(node.val);
            builder.append("->");
        }

        return builder.toString();
    }

    public static String listToString(List list) {

        if (list == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();


        for (Object item : list) {
            builder.append(item);
            builder.append("->");
        }

        return builder.toString();
    }

    public static String StringArrayToString(String[] strings) {
        if (strings == null) {
            return "";
        }
        StringBuilder builder = new StringBuilder();

        for (String string : strings) {
            builder.append(string);
            builder.append(",");
        }

        return builder.toString();
    }
}
