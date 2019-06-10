/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _709ToLowerCase {

    public static void main(String[] args) {

        System.err.println(new Solution().toLowerCase("aAAbbbb"));
    }

    static class Solution {
        public String toLowerCase(String str) {

            char[] ret = new char[str.length()];

            char tmp = 0;
            for (int i = 0; i < str.length(); i++) {

                tmp = str.charAt(i);
                if (tmp > 64 && tmp < 91) {
                    ret[i] = (char) (tmp + 32);
                } else {
                    ret[i] = tmp;
                }
            }

            return new String(ret);
        }
    }
}
