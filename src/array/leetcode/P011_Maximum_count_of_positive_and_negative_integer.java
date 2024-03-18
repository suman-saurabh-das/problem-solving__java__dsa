package array.leetcode;

/*
    2529. Maximum count of positive integer and negative integer
    https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

    Input: nums = [-2,-1,-1,1,2,3]
    Output: 3
    Input: nums = [-3,-2,-1,0,0,1,2]
    Output: 3
    Input: nums = [5,20,66,1314]
    Output: 4
*/

public class P011_Maximum_count_of_positive_and_negative_integer {
    public static void main(String[] args) {
        int[] nums1 = {-2, -1, -1, 1, 2, 3}, nums2 = {-3, -2, -1, 0, 0, 1, 2}, nums3 = {5, 20, 66, 1314};
        System.out.println("Maximum count is : " + maximumCount(nums1));
        System.out.println("Maximum count is : " + maximumCount(nums2));
        System.out.println("Maximum count is : " + maximumCount(nums3));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static int maximumCount(int[] nums) {
        int numPositiveElements = 0, numNegativeElements = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                numPositiveElements++;
            }
            if (nums[i] < 0) {
                numNegativeElements++;
            }
        }
        return Math.max(numPositiveElements, numNegativeElements);
    }
}
