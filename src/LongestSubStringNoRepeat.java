import java.util.*;

/**
 * Created by N2Hsu on 6/6/2019.
 */
public class LongestSubStringNoRepeat {

    public static void main(String[] args) {

        System.err.println(new Solution().lengthOfLongestSubstring("pwwkew"));
    }

    static class Solution {
        public int lengthOfLongestSubstring(String s) {

            List<Character> set = new LinkedList<>();

            for (int i = 0; i < s.length(); i++) {

                Character c = s.charAt(i);
                if (set.contains(c)) {

                } else {
                    set.add(s.charAt(i));
                }
            }
            for (char c : set) {
                System.err.print(c);
            }
            System.err.println();

            return set.size();
        }
    }
}
