/*
Write a function to find the longest common prefix string amongst an array of
strings.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        int i = 0;
        boolean isValid = true;
        while (isValid) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; ++j) {
                if (strs[j].charAt(i) != c) {
                    isValid = false;
                    --i;
                    break;
                }
                if (i == strs[j].length() - 1) {
                    isValid = false;
                }
            }
            ++i;
        }
        return strs[0].substring(0, i + 1);
    }

}
