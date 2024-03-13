package string.leetcode;

/*
    5. Longest palindromic substring
    https://leetcode.com/problems/longest-palindromic-substring/description/

    Input: s = "babad"
    Output: "bab"
    Input: s = "cbbd"
    Output: "bb"
*/

public class P007_Longest_palindromic_substring {
    public static void main(String[] args) {
        String s1 = "babad", s2 = "cbbd", s3 = "bb", s4 = "abb";
        System.out.println("Longest palindromic string : " + longestPalindrome(s1));
        System.out.println("Longest palindromic string : " + longestPalindrome(s2));
        System.out.println("Longest palindromic string : " + longestPalindrome(s3));
        System.out.println("Longest palindromic string : " + longestPalindrome(s4));
    }

    // SOLUTION USING NESTED LOOPS - time complexity - O(n^3)
    // Here time complexity is O(n^3) because we are using 2 while loops for finding each and every possible pair of substrings and 1 while loop to check of current substring is a palindrome
    public static String longestPalindrome(String s) {
        // Break the given string into substrings of different lengths (all unique possibilities)
        // e.g. babad -> 1 substring of max length 5
        // baba and abad -> 2 substring of max length 4
        // bab, aba, bad -> 3 substring of max length 3 and so on...
        // Now check which is the longest substring which is also a palindrome.
        int counter = 0;
        while (counter < s.length()) {
            int start = 0, end = s.length() - counter;
            while (end <= s.length()) {
                if (isStringPalindrome(s.substring(start, end))) {
                    return s.substring(start, end);
                }
                start++;
                end++;
            }
            counter++;
        }
        return s;
    }

    // Function to check if string is palindrome
    public static boolean isStringPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        boolean isPalindrome = true;
        while (start <= end) {
            if (str.charAt(start) == str.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return isPalindrome;
    }
}
