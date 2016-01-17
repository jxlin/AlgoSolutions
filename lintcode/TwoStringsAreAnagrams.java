/*
 * Write a method anagram(s,t) to decide if two 
 * strings are anagrams or not.

Example
Given s="abcd", t="dcab", return true.

Challenge
O(n) time, O(1) extra space
 */
public class TwoStringsAreAnagrams {

    /**
     * @param s: The first string
     * @param t: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] count = new int[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            count[s.charAt(i)]++;
            count[t.charAt(i)]--;
        }
        for (c : count) {
            if (c != 0) {
                return false;
            }
        }
        return true;
    }

    public boolean anagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] array1 = s.toCharArray();
        char[] array2 = t.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; ++i) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

}
