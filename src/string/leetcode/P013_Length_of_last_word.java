package string.leetcode;

/*
    58. Length of last word
    https://leetcode.com/problems/length-of-last-word/description/

    Input: s = "Hello World"
    Output: 5
    Input: s = "   fly me   to   the moon  "
    Output: 4
    Input: s = "luffy is still joyboy"
    Output: 6
*/

public class P013_Length_of_last_word {
    public static void main(String[] args) {
        String s1 = "Hello World", s2 = "   fly me   to   the moon  ", s3 = "luffy is still joyboy";
        System.out.println("Length of last word is : " + lengthOfLastWord(s1));
        System.out.println("Length of last word is : " + lengthOfLastWord(s2));
        System.out.println("Length of last word is : " + lengthOfLastWord(s3));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static int lengthOfLastWord(String s) {
        int index = s.length() - 1, length = 0;
        // Check if the last character is a space
        boolean lastCharacterIsSpace = s.charAt(index) == ' ';
        while (index >= 0) {
            // If last character is not a space then increment length
            if (s.charAt(index) != ' ') {
                length++;
                lastCharacterIsSpace = false;
            }
            // If we encounter space after any character, then break
            if (s.charAt(index) == ' ' && !lastCharacterIsSpace) {
                break;
            }
            index--;
        }
        return length;
    }
}
