package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _412 extends Solution {
    public _412() {
        super(412, "FizzBuzz");
    }

    @Override
    public void run() {

        input(15);
        List<String> list = fizzBuzz(15);
        output(list);
    }

    public List<String> fizzBuzz(int n) {
        // TODO 如果是2幂等取余运算效率还可以提升
        List<String> list = new ArrayList<>(n);
        for (int i = 1; i < n + 1; i++) {
            if (i % 5 == 0) {
                if (i % 3 == 0) {
                    list.add("FizzBuzz");
                    Integer dl;
                } else {
                    list.add("Buzz");
                }
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else {
                list.add("" + i);
            }
        }

        return list;
    }
}
