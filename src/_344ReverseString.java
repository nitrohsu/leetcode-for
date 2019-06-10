/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _344ReverseString {
    public static void main(String[] args) {

        char[] target = "Hello".toCharArray();
        new Solution().reverseString(target);
        for (char c : target) {
            System.err.print(c);
        }
    }

    static class Solution {
        public void reverseString(char[] s) {

            char tmp = 0;
            for (int i = 0; i < s.length / 2; i++) {
                tmp = s[i];
                s[i] = s[s.length - 1 - i];
                s[s.length - 1 - i] = tmp;
            }
        }
    }
}
