/*
Given two non-negative integers num1 and num2 represented as string, return the
sum of num1 and num2.

 Notice

The length of both num1 and num2 is < 5100.
Both num1 and num2 contains only digits 0-9.
Both num1 and num2 does not contain any leading zero.
You must not use any built-in BigInteger library or convert the inputs to
integer directly.
Example
Given num1 = "123", num2 = "45"
return "168"
 */
public class BigIntegerAddition {

    /*
     * @param num1: a non-negative integers
     * @param num2: a non-negative integers
     * @return: return sum of num1 and num2
     */
    public String addStrings(String num1, String num2) {
        String result = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carrier = 0;
        while (i >= 0 || j >= 0) {
            int sum = carrier;
            if (i >= 0) {
                sum += num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += num2.charAt(j) - '0';
                j--;
            }
            result = (sum % 10) + result;
            carrier /= 10;
        }
        if (carrier > 0) {
            result = carrier + result;
        }
        return result;
    }

}
