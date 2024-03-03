package arrays.leetcode;

/*
    1. Two sum
    https://leetcode.com/problems/two-sum/description/

    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Input: nums = [3,3], target = 6
    Output: [0,1]
*/

import java.util.Arrays;

public class P001_Two_sum {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15}, nums2 = {3, 2, 4}, nums3 = {3, 3};
        int target1 = 9, target2 = 6, target3 = 6;
        System.out.println("Elements are at index : " + Arrays.toString(twoSum(nums1, target1)));
        System.out.println("Elements are at index : " + Arrays.toString(twoSum(nums2, target2)));
        System.out.println("Elements are at index : " + Arrays.toString(twoSum(nums3, target3)));
    }

    // Brute force approach - Using nested for loops - time complexity - O(n^2)
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length; j++) {
                // (j > i) is used to ensure that we do not use same element twice.
                if (nums[i] + nums[j] == target && j > i) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    // Optimise using hash-map
    // Optimise using sorting followed by binary-search
}
