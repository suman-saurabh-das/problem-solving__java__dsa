package string.leetcode;

import java.util.Arrays;

/*
    344. Reverse string
    https://leetcode.com/problems/reverse-string/description/

    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
    Input: s = ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]
*/

public class P015_Reverse_string {
    public static void main(String[] args) {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'}, s2 = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverseString(s1);
        reverseString(s2);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static void reverseString(char[] s) {
        int start = 0, end = s.length - 1;
        // Using 2 pointers, swap the characters ar start and end
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}
