package array.leetcode;

/*
    1920. Build array from permutation
    https://leetcode.com/problems/build-array-from-permutation/description/

    Input: nums = [0,2,1,5,3,4]
    Output: [0,1,2,4,5,3]
    Input: nums = [5,0,1,2,3,4]
    Output: [4,5,0,1,2,3]
*/

import java.util.Arrays;

public class P004_Build_array_from_permutation {
    public static void main(String[] args) {
        int[] nums1 = {0, 2, 1, 5, 3, 4}, nums2 = {5, 0, 1, 2, 3, 4};
        System.out.println("Array from permutation : " + Arrays.toString(buildArray(nums1)));
        System.out.println("Array from permutation : " + Arrays.toString(buildArray(nums2)));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static int[] buildArray(int[] nums) {
        // Create a new array of same length (ans)
        int[] ans = new int[nums.length];
        // Loop through nums and insert values in new array based on ans[i] = nums[nums[i]]
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}
