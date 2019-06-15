import java.util.HashMap;
import java.util.Map;

/**
 * Created by N2Hsu on 6/15/2019.
 */
public class TwoNumberSumIndex {
    public static void main(String[] args) {

        int[] array = new int[]{0, 0, 2, 1, 2, 3, 12};

        array = new Solution().twoNumberSumIndex(array, 4);

        for (int i = 0; array != null && i < array.length; i++) {
            System.err.println(array[i]);
        }
    }

    static class Solution {

        public int[] twoNumberSumIndex(int[] array, int sum) {

            Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            for (int i = 0; i < array.length; i++) {
                map.put(array[i], i);
            }

            Integer index;
            for (int i = 0; i < array.length; i++) {
                if ((index = map.get(sum - array[i])) != null) {
                    return new int[]{i, index};
                }
            }
            return null;
        }
    }
}
