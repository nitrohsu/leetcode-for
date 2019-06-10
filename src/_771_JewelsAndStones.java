import java.util.*;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _771_JewelsAndStones {

    public static void main(String[] args) {

        System.err.println(new Solution().numJewelsInStones("aA", "aAAbbbb"));
    }

    static class Solution {
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
}
