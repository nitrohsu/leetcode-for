import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by N2Hsu on 6/10/2019.
 */
public class _412FizzBuzz {
    public static void main(String[] args) {
        System.err.println(new Solution().fizzBuzz(15));
    }

    static class Solution {
        public List<String> fizzBuzz(int n) {
            // TODO 取余运算效率还可以提升
            List<String> list = new ArrayList<>(n);
            for (int i = 1; i < n + 1; i++) {
                if (i % 5 == 0) {
                    if (i % 3 == 0) {
                        list.add("FizzBuzz");
                        Integer dl;
                    } else {
                        list.add("Buzz");
                    }
                } else if (i % 3 == 0) {
                    list.add("Fizz");
                } else {
                    list.add("" + i);
                }
            }

            return list;
        }
    }
}
