package string.leetcode;

/*
    771. Jewels and stones
    https://leetcode.com/problems/jewels-and-stones/description/

    Input: jewels = "aA", stones = "aAAbbbb"
    Output: 3
    Input: jewels = "z", stones = "ZZ"
    Output: 0
*/

public class P004_Jewels_and_stones {
    public static void main(String[] args) {
        String jewels1 = "aA", stones1 = "aAAbbbb", jewels2 = "z", stones2 = "ZZ";
        System.out.println("Number of jewels : " + numJewelsInStones(jewels1, stones1));
        System.out.println("Number of jewels : " + numJewelsInStones(jewels2, stones2));
    }

    // SOLUTION USING LOOP - time complexity - O(n^2)
    // Here time complexity is O(n^2) because indexOf() internally uses a for loop
    public static int numJewelsInStones(String jewels, String stones) {
        // Loop over every character in stones string and try to find the character in string jewels
        int numOfJewels = 0;
        for (int i = 0; i < stones.length(); i++) {
            if (jewels.indexOf(stones.charAt(i)) != -1) {
                numOfJewels++;
            }
        }
        return numOfJewels;
    }
}
