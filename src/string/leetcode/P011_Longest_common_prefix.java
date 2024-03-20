package string.leetcode;

/*
    14. Longest common prefix
    https://leetcode.com/problems/longest-common-prefix/description/

    Input: strs = ["flower","flow","flight"]
    Output: "fl"
    Input: strs = ["dog","racecar","car"]
    Output: ""
*/

public class P011_Longest_common_prefix {
    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"}, strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest common prefix : " + longestCommonPrefix(strs1));
        System.out.println("Longest common prefix : " + longestCommonPrefix(strs2));
    }

    // SOLUTION USING NESTED LOOPS - time complexity - O(n^2)
    public static String longestCommonPrefix(String[] strs) {
        // Finding string with minimum length
        int minIndex = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minIndex) {
                minIndex = strs[i].length();
            }
        }

        // Creating an object of String builder to create the string containing common prefixes
        StringBuilder commonString = new StringBuilder();
        int index = 0;
        while (index < minIndex) {
            boolean isSame = true;
            for (int i = 1; i < strs.length; i++) {
                // Check if character at same indexes are same for all strings
                if (strs[i - 1].charAt(index) != strs[i].charAt(index)) {
                    isSame = false;
                }
            }
            // If characters at same index are same, then append it to result
            if (isSame) {
                commonString.append(strs[0].charAt(index));
            } else {
                break;
            }
            index++;
        }
        return commonString.toString();
    }
}
