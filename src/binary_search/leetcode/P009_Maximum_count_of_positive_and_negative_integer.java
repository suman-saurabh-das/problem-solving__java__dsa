package binary_search.leetcode;

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

public class P009_Maximum_count_of_positive_and_negative_integer {
    public static void main(String[] args) {
        int[] nums1 = {-2, -1, -1, 1, 2, 3}, nums2 = {-3, -2, -1, 0, 0, 1, 2}, nums3 = {-2, -1, -1, 0, 0, 0};
        System.out.println("Maximum count is : " + maximumCount(nums1));
        System.out.println("Maximum count is : " + maximumCount(nums2));
        System.out.println("Maximum count is : " + maximumCount(nums3));
    }

    // SOLUTION USING BINARY SEARCH - time complexity - O(log(n))
    public static int maximumCount(int[] nums) {
        int numPositiveElements = nums.length - indexOfMinPositiveNum(nums);
        int numNegativeElements = indexOfMaxNegativeNum(nums) + 1;
        // Return the maximum between numPositiveElements and numNegativeElements
        return Math.max(numPositiveElements, numNegativeElements);
    }

    // Find the index of maximum -ve element
    public static int indexOfMaxNegativeNum(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < 0) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start - 1;
    }

    // Find the index of minimum +ve element
    public static int indexOfMinPositiveNum(int[] nums) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
