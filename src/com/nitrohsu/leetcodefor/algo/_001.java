package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

import java.util.HashMap;

public class _001 extends Solution {

    public _001() {
        super(1, "TwoSum");
    }

    @Override
    public void run() {

        int[] nums = {3, 2, 4};
        input(nums);

        output(twoSum2(nums, 6));
    }

    public int[] twoSum(int[] nums, int target) {

        int left = -1;
        int right = -1;
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int rest = target - nums[i];
            for (int j = i + 1; j < length; j++) {
                if (rest == nums[j]) {
                    left = i;
                    right = j;
                    break;
                }
            }
            if (left != -1 && right != -1) {
                return new int[]{left, right};
            }
        }

        return new int[0];
    }

    public int[] twoSum2(int[] nums, int target) {

        int length = nums.length;
        HashMap<Integer, Integer> restMap = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (restMap.containsKey(nums[i])) {
                return new int[]{restMap.get(nums[i]), i};
            }
            int rest = target - nums[i];
            restMap.put(rest, i);
        }

        return new int[0];
    }
}