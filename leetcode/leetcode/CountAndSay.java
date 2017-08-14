/*
The count-and-say sequence is the sequence of integers with the first five
terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
 */
public class CountAndSay {

    public String countAndSay(int n) {
        String result = "1";
        for (int i = 2; i <= n; ++i) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0, count = 1; j < result.length(); ++j) {
                if (j > 0) {
                    if (result.charAt(j) == result.charAt(j - 1)) {
                        count++;
                    } else {
                        sb.append(String.valueOf(count) + result.charAt(j - 1));
                        count = 1;
                    }
                }
                if (j == result.length() - 1) {
                    sb.append(String.valueOf(count) + result.charAt(j));
                }
            }
            result = sb.toString();
        }
        return result;
    }

}
