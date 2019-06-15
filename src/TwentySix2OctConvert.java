/**
 * 在Excel2003中，用A表示第一列，B表示第二列...Z表示第26列，AA表示第27列，AB表示第28列...依次列推。
 * 请写出一个函数，输入用字母表示的列号编码，输出它是第几列。
 * Created by N2Hsu on 6/15/2019.
 */
public class TwentySix2OctConvert {
    public static void main(String[] args) {
        System.out.println(new Solution().hexOctConvert("AA"));
    }

    static class Solution {
        public int hexOctConvert(String str) {

            int m = 0;
            int sum = 0;
            for (char c : str.toCharArray()) {
                sum += (c - 65 + 1) * (int) Math.pow(26, m);
                m++;
            }
            return sum;
        }
    }
}
