package sorting.leetcode;

/*
    242. Valid anagram
    https://leetcode.com/problems/valid-anagram/description/
    NOTE - This solution gives time limit exceeded error, need to optimize using other method.

    Input: s = "anagram", t = "nagaram"
    Output: true
    Input: s = "rat", t = "car"
    Output: false
*/

public class P012_Valid_anagram {
    public static void main(String[] args) {
        String s1 = "anagram", s2 = "rat", t1 = "nagaram", t2 = "car";
        System.out.println("Strings are valid anagram : " + isAnagram(s1, t1));
        System.out.println("Strings are valid anagram : " + isAnagram(s2, t2));
    }

    // SOLUTION USING SELECTION SORT - time complexity - O(n^2)
    public static boolean isAnagram(String s, String t) {
        s = selectionSort(s);
        t = selectionSort(t);
        return s.equals(t);
    }

    // Selection sort
    public static String selectionSort(String s) {
        // Convert string to character array and apply sorting algorithm
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            int lastCharIndex = charArray.length - i - 1;
            int maxCharIndex = findMaxCharIndex(charArray, lastCharIndex);
            swap(charArray, lastCharIndex, maxCharIndex);
        }
        return new String(charArray);
    }

    // Function to find index of character having the highest ASCII value
    public static int findMaxCharIndex(char[] chArr, int end) {
        int maxCharIndex = 0;
        for (int i = 0; i <= end; i++) {
            if (chArr[i] > chArr[maxCharIndex]) {
                maxCharIndex = i;
            }
        }
        return maxCharIndex;
    }

    // Function to swap 2 characters
    public static void swap(char[] chArr, int index1, int index2) {
        char temp = chArr[index1];
        chArr[index1] = chArr[index2];
        chArr[index2] = temp;
    }
}
