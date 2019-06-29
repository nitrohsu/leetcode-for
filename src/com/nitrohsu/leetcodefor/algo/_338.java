package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _338 extends Solution {

    public _338() {
        super(338, "Counting Bits");
    }

    @Override
    public void run() {
        int num = 16;

        input(num);

        output(countBits(num));
    }


    public int[] countBits(int num) {

        int[] array = new int[num + 1];

        int index = 1;

        array[0] = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & i - 1) == 0) {
                //判断2的幂次，高效
                index = 1;
                array[i] = 1;
            } else {
                int value = array[index];
                array[i] = value + 1;

                index++;
            }
        }

        return array;
    }
}
