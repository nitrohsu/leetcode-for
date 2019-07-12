package com.nitrohsu.leetcodefor.algo;

import com.nitrohsu.leetcodefor.Solution;

/**
 * Runtime: 1 ms, faster than 11.04% of Java online submissions for Merge Sorted Array.
 * Memory Usage: 36.4 MB, less than 99.95% of Java online submissions for Merge Sorted Array.
 */
public class _088 extends Solution {
    public _088() {
        super(88, "MergeSortedArray");
    }

    @Override
    public void run() {

        int[] nums1 = new int[]{4, 5, 6, 0, 0, 0};
        int[] nums2 = new int[]{1, 2, 3};

        input(nums1);
        input(nums2);

        merge(nums1, 3, nums2, 3);

        output(nums1);
    }

    private void merge(int[] nums1, int m, int[] nums2, int n) {

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
        } else {
            for (int i = m - 1; i >= 0 && n > 0; i--) {

                if (nums2[n - 1] > nums1[i]) {
                    System.arraycopy(nums1, i + 1, nums1, i + 2, m - i - 1);
                    nums1[i + 1] = nums2[n - 1];

                    output(nums1);

                    m++;
                    n = n - 1;
                    merge(nums1, m, nums2, n);
                    break;
                } else if (i == 0) {
                    System.arraycopy(nums1, 0, nums1, 1, m);
                    nums1[0] = nums2[n - 1];

                    output(nums1);

                    m++;
                    n = n - 1;
                    merge(nums1, m, nums2, n);
                    break;
                }
            }
        }
    }
}
