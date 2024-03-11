package array.leetcode;

/*
    1512. Number of good pairs
    https://leetcode.com/problems/number-of-good-pairs/description/

    Input: nums = [1,2,3,1,1,3]
    Output: 4
    Input: nums = [1,1,1,1]
    Output: 6
    Input: nums = [1,2,3]
    Output: 0
*/

public class P005_Number_of_good_pairs {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3}, nums2 = {1, 1, 1, 1}, nums3 = {1, 2, 3};
        System.out.println("Number of good pairs : " + numIdenticalPairs(nums1));
        System.out.println("Number of good pairs : " + numIdenticalPairs(nums2));
        System.out.println("Number of good pairs : " + numIdenticalPairs(nums3));
    }

    // SOLUTION USING NESTED LOOPS - time complexity - O(n^2)
    public static int numIdenticalPairs(int[] nums) {
        int goodPairCount = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                // Check if good pair exists (nums[i] == nums[j] && i < j)
                // If it exists increment goodPairCount by 1
                if (nums[i] == nums[j]) {
                    goodPairCount++;
                }
            }
        }
        return goodPairCount;
    }

    // Optimise solution using hash-map
}
