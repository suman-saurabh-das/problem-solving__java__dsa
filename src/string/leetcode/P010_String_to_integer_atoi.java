package string.leetcode;

/*
    8. String to integer (atoi)
    https://leetcode.com/problems/string-to-integer-atoi/description/

    Input: s = "42"
    Output: 42
    Input: s = "   -42"
    Output: -42
    Input: s = "4193 with words"
    Output: 4193
*/

public class P010_String_to_integer_atoi {
    public static void main(String[] args) {
        String s1 = "   42", s2 = "-+12", s3 = "", s4 = " ", s5="-5-", s6 = "4193 with words";
        System.out.println("Integer is : " + myAtoi(s1));
        System.out.println("Integer is : " + myAtoi(s2));
        System.out.println("Integer is : " + myAtoi(s3));
        System.out.println("Integer is : " + myAtoi(s4));
        System.out.println("Integer is : " + myAtoi(s5));
        System.out.println("Integer is : " + myAtoi(s6));
    }

    public static int myAtoi(String s) {
        boolean isNegative = false;
        // Removing the leading white space.
        s = s.stripLeading();
        // Checking if it is an empty string.
        if (s.isEmpty()) {
            return 0;
        }
        // Checking if first character is - or +
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            if (s.charAt(0) == '-') {
                isNegative = true;
            }
            s = s.substring(1);
        }
        int length = 0;
        long num = 0;
        // Looping until length is less than given string length.
        while (length < s.length()) {
            if (s.charAt(length) < '0' || s.charAt(length) > '9') {
                break;
            }
            // Converting string to number (taking one character at a time.
            num = (s.charAt(length) - '0') + num * 10;
            length++;
            // If the num is more than what int can hold, then we clamp it.
            if (num > Integer.MAX_VALUE) {
                if (isNegative)
                    return Integer.MIN_VALUE;
                else
                    return Integer.MAX_VALUE;
            }
        }
        // If number is negative then multiply it with -1 and return.
        if (isNegative) {
            num = num * -1;
        }
        return (int) num;
    }
}
