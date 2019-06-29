package com.nitrohsu.leetcodefor;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        int index = 445;

        Solution solution = (Solution) Class.forName("com.nitrohsu.leetcodefor.algo." + String.format("_%03d", index)).newInstance();

        solution.before();

        solution.run();

        solution.after();
    }
}
