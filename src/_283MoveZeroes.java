/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _283MoveZeroes {

    public static void main(String[] args) {

        int[] array = new int[]{0, 1, 0, 3, 12};

        new Solution().moveZeroes(array);

        for (int i = 0; i < array.length; i++) {
            System.err.println(array[i]);
        }
    }

    static class Solution {

        public void moveZeroes(int[] nums) {

            int count=0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    nums[count++] = nums[i];
                }
            }

            for (int j = count; j < nums.length; j++) {
                nums[j]=0;
            }
        }
    }
}
