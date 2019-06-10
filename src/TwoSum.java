import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class TwoSum {
    static class Solution {
        public int[] twoSum(int[] nums, int target) {

            int left = -1;
            int right = -1;
            int length = nums.length;
            for (int i = 0; i < length; i++) {
                int rest = target - nums[i];
                for (int j = i + 1; j < length; j++) {
                    if (rest == nums[j]) {
                        left = i;
                        right = j;
                        break;
                    }
                }
                if (left != -1 && right != -1) {
                    return new int[]{left, right};
                }
            }

            return new int[0];
        }

        public int[] twoSum2(int[] nums, int target) {

            int length = nums.length;
            HashMap<Integer, Integer> restMap = new HashMap<>();
            for (int i = 0; i < length; i++) {
                if (restMap.containsKey(nums[i])) {
                    return new int[]{restMap.get(nums[i]), i};
                }
                int rest = target - nums[i];
                restMap.put(rest, i);
            }

            return new int[0];
        }
    }


    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }

        String[] parts = input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }

        String result = "";
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static String integerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    public static void main(String[] args) throws IOException {
        int[] nums = {3, 2, 4};

        int[] ret = new Solution().twoSum2(nums, 6);

        String out = integerArrayToString(ret);

        System.out.print(out);
    }
}