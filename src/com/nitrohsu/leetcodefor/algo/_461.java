package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

public class _461 extends Solution {
    public _461() {
        super(461, "Hamming Distance");
    }

    @Override
    public void run() {

        int x = 1, y = 4;
        input(x);
        input(y);

        output(hammingDistance(x, y));
    }

    public int hammingDistance(int x, int y) {

        int t = x ^ y;
        int sum = 0;
        while (t != 0) {
            if (t % 2 != 0) {
                sum++;
            }
            t = t >>> 1;
        }

        return sum;
    }
}
