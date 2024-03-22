package string.leetcode;

/*
    125. Valid palindrome
    https://leetcode.com/problems/valid-palindrome/description/

    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Input: s = "race a car"
    Output: false
    Input: s = " "
    Output: true
*/

public class P014_Valid_palindrome {
    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama", s2 = "race a car", s3 = " ";
        System.out.println("String is a valid palindrome : " + isPalindrome(s1));
        System.out.println("String is a valid palindrome : " + isPalindrome(s2));
        System.out.println("String is a valid palindrome : " + isPalindrome(s3));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static boolean isPalindrome(String s) {
        String alphanumericString = createAlpahanumericString(s);
        return isStringPalindrome(alphanumericString);
    }

    // Check if string is palindrome
    public static boolean isStringPalindrome(String s) {
        int start = 0, end = s.length() - 1;
        while (start <= end) {
            // Compare the characters at start and end
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    // Create an alphanumeric string
    public static String createAlpahanumericString(String s) {
        StringBuilder str = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            char currentChar = s.charAt(index);
            // If character is lowercase, append it to str
            if (currentChar >= 'a' && currentChar <= 'z') {
                str.append(currentChar);
            }
            // If character is uppercase, then convert to lowercase, append it to str
            if (currentChar >= 'A' && currentChar <= 'Z') {
                str.append(Character.toLowerCase(currentChar));
            }
            // If character is number, append it to str
            if (currentChar >= '0' && currentChar <= '9') {
                str.append(currentChar);
            }
            index++;
        }
        return str.toString();
    }
}
