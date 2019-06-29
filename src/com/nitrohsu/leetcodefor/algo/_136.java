package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _136 extends Solution {

    public _136() {
        super(136, "SingleNumber");
    }

    public int singleNumber(int[] nums) {

        int s = nums[0];
        for (int i = 1; i < nums.length; i++) {
            s = s ^ nums[i];
        }

        return s;
    }

    @Override
    public void run() {

        int[] nums = {1, 1, 2, 2, 3, 3, 5, 8, 5, 2, 2};
        input(nums);

        output(singleNumber(nums));
    }
}
