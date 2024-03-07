package array.leetcode;

/*
    2824. Count pairs whose sum is less than target
    https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/

    Input: nums = [-1,1,2,3,1], target = 2
    Output: 3
    Input: nums = [-6,2,5,-2,-7,-1,3], target = -2
    Output: 10
*/

import java.util.ArrayList;
import java.util.Arrays;

public class P008_Count_pairs_whose_sum_is_less_than_target {
    public static void main(String[] args) {
        int target1 = 2, target2 = -2;
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(-1, 1, 2, 3, 1));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(-6, 2, 5, -2, -7, -1, 3));
        System.out.println("Number of pairs : " + countPairs(nums1, target1));
        System.out.println("Number of pairs : " + countPairs(nums2, target2));
    }

    // SOLUTION USING NESTED FOR LOOP - time complexity - O(n^2)
    public static int countPairs(ArrayList<Integer> nums, int target) {
        int numberOfPairs = 0;
        // Using nested for loops
        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target && j > i) {
                    numberOfPairs++;
                }
            }
        }
        return numberOfPairs;
    }
}
