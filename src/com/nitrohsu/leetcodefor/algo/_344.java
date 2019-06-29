package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _344 extends Solution {

    public _344() {
        super(344, "ReverseString");
    }

    @Override
    public void run() {
        char[] target = "Hello".toCharArray();

        input(target);
        reverseString(target);

        output(target);
    }

    public void reverseString(char[] s) {

        char tmp = 0;
        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = tmp;
        }
    }
}
