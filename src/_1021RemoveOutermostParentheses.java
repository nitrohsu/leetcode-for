/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _1021RemoveOutermostParentheses {

    public static void main(String[] args) {

        System.err.println(new Solution().removeOuterParentheses("(()())(())"));
    }

    static class Solution {
        public String removeOuterParentheses(String S) {

            if (S.length() == 0) {
                return "";
            }
            StringBuilder builder = new StringBuilder(S.length());
            boolean flag = false;
            int re = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) == '(') {
                    if (!flag) {
                        flag = true;
                    } else {
                        builder.append(S.charAt(i));
                    }
                    re++;
                } else if (S.charAt(i) == ')') {
                    if (flag) {
                        re--;
                        if (re == 0) {
                            flag = false;
                        } else {
                            builder.append(S.charAt(i));
                        }
                    }
                }
            }

            return builder.toString();
        }
    }
}
