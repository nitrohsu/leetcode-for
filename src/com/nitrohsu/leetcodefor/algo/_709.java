package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _709 extends Solution {

    public _709() {
        super(709, "ToLowerCase");
    }

    @Override
    public void run() {

        String str = "aAAbbbb";
        input(str);
        output(toLowerCase(str));
    }

    public String toLowerCase(String str) {

        char[] ret = new char[str.length()];

        char tmp = 0;
        for (int i = 0; i < str.length(); i++) {

            tmp = str.charAt(i);
            if (tmp > 64 && tmp < 91) {
                ret[i] = (char) (tmp + 32);
            } else {
                ret[i] = tmp;
            }
        }

        return new String(ret);
    }
}
