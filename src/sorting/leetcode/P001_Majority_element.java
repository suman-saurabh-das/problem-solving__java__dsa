package sorting.leetcode;

/*
    169. Majority element
    https://leetcode.com/problems/majority-element/description/

    Input: nums = [3,2,3]
    Output: 3
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
*/

public class P001_Majority_element {
    public static void main(String[] args) {
        int[] nums1 = {3, 2, 3};
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element is  : " + majorityElement(nums1));
        System.out.println("Majority element is  : " + majorityElement(nums2));
    }

    public static int majorityElement(int[] nums) {
        bubbleSort(nums);
        // Since element appears more than n/2 times,
        // we can always find the majority element at the mid-position after sorting the array
        return nums[nums.length / 2];
    }

    // SOLUTION USING SORTING - time complexity - O(n^2)
    public static void bubbleSort(int[] nums) {
        // External loop will run n-1 times
        // It will count the number of passes
        boolean isSwapped;
        for (int i = 0; i < nums.length; i++) {
            isSwapped = false;
            // Internal loop will run n-i times.
            // It will compare the elements and after complete iteration, the largest element will be at end.
            for (int j = 1; j < nums.length - i; j++) {
                // Swap if current element is smaller than previous element.
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    isSwapped = true;
                }
            }
            // Array is sorted, so break out of loop, no need to check further.
            if (!isSwapped) {
                break;
            }
        }
    }
}
