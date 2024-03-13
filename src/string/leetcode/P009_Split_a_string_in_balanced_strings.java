package string.leetcode;

/*
    1221. Split a string in balanced strings
    https://leetcode.com/problems/split-a-string-in-balanced-strings/description/

    Input: s = "RLRRLLRLRL"
    Output: 4
    Input: s = "RLRRRLLRLL"
    Output: 2
    Input: s = "LLLLRRRR"
    Output: 1
*/

public class P009_Split_a_string_in_balanced_strings {
    public static void main(String[] args) {
        String s1 = "RLRRLLRLRL", s2 = "RLRRRLLRLL", s3 = "LLLLRRRR";
        System.out.println("Maximum number of balanced strings : " + balancedStringSplit(s1));
        System.out.println("Maximum number of balanced strings : " + balancedStringSplit(s2));
        System.out.println("Maximum number of balanced strings : " + balancedStringSplit(s3));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static int balancedStringSplit(String s) {
        int maxNumberOfBalancedStrings = 0;
        int rCount = 0, lCount = 0;
        // Loop through the characters and try to find how many balanced pairs of R-L can be formed
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                rCount++;
            } else {
                lCount++;
            }
            if (rCount == lCount) {
                maxNumberOfBalancedStrings++;
                rCount = 0;
                lCount = 0;
            }
        }
        return maxNumberOfBalancedStrings;
    }
}
