package string.leetcode;

/*
    28. Find the index of the first occurrence in a string
    https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

    Input: haystack = "sadbutsad", needle = "sad"
    Output: 0
    Input: haystack = "leetcode", needle = "leeto"
    Output: -1
*/

public class P012_Find_the_index_of_the_first_occurrence_in_a_string {
    public static void main(String[] args) {
        String haystack1 = "sadbutsad", needle1 = "sad", haystack2 = "leetcode", needle2 = "leeto";
        System.out.println("First occurrence at index : " + strStr(haystack1, needle1));
        System.out.println("First occurrence at index : " + strStr(haystack2, needle2));
    }

    // SOLUTION USING LOOP - time complexity - O(n^2)
    // Here time complexity is O(n^2) because substring() and equals() internally uses a loop.
    public static int strStr(String haystack, String needle) {
         int index = 0;
         while (index + needle.length() - 1 < haystack.length()) {
             if (haystack.substring(index, index + needle.length()).equals(needle)) {
                 return index;
             }
             index++;
         }
         return -1;
    }

    // SOLUTION USING INBUILT METHOD - indexOf() - time complexity - O(m*n)
    public static int strStr2(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}
