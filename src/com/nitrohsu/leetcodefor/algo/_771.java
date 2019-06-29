package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

import java.util.*;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _771 extends Solution {

    public _771() {
        super(771, "JewelsAndStones");
    }

    @Override
    public void run() {

        String[] i = {"aA", "aAAbbbb"};
        input(i);
        output(numJewelsInStones("aA", "aAAbbbb"));
    }

    public int numJewelsInStones(String J, String S) {

        int[] target = new int[J.length()];
        for (int i = 0; i < J.length(); i++) {
            target[i] = (int) J.charAt(i);
        }

        Arrays.sort(target);

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (Arrays.binarySearch(target, S.charAt(i)) >= 0) {
                count++;
            }
        }

        return count;
    }
}
