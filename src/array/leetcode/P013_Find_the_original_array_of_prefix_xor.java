package array.leetcode;

/*
    2433. Find the original array of prefix xor
    https://leetcode.com/problems/find-the-original-array-of-prefix-xor/description/

    Input: pref = [5,2,0,3,1]
    Output: [5,7,2,3,2]
    Input: pref = [13]
    Output: [13]
*/

import java.util.Arrays;

public class P013_Find_the_original_array_of_prefix_xor {
    public static void main(String[] args) {
        int[] pref1 = {5, 2, 0, 3, 1}, pref2 = {13};
        System.out.println("Original array : " + Arrays.toString(findArray(pref1)));
        System.out.println("Original array : " + Arrays.toString(findArray(pref2)));
    }

    public static int[] findArray(int[] pref) {
        int[] prefArr = new int[pref.length];
        // XOR of first element will be the element itself.
        prefArr[0] = pref[0];
        // We know that if a ^ b = c, then a ^ c = b and b ^ c = a, so
        // to get 7, we need to perform 5 ^ 2
        // to get 2, we need to perform 2 ^ 0
        // to get 3, we need to perform 0 ^ 3
        // to get 2, we need to perform 3 ^ 1
        // i.e. we are performing the XOR operation of the (i-1)th element with ith element
        for (int i = 1; i < pref.length; i++) {
            prefArr[i] = pref[i - 1] ^ pref[i];
        }
        return prefArr;
    }
}
