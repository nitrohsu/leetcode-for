package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _283 extends Solution {

    public _283() {
        super(283, "MoveZeroes");
    }

    @Override
    public void run() {

        int[] array = new int[]{0, 1, 0, 3, 12};

        input(array);
        moveZeroes(array);

        output(array);
    }

    public void moveZeroes(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i];
            }
        }

        for (int j = count; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

}
