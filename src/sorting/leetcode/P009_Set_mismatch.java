package sorting.leetcode;

/*
    645. Set Mismatch
    https://leetcode.com/problems/set-mismatch/

    Input: nums = [1,2,2,4]
    Output: [2,3]
    Input: nums = [1,1]
    Output: [1,2]
*/

import java.util.Arrays;

public class P009_Set_mismatch {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 4}, nums2 = {1, 1};
        System.out.println("Repeated number and Lost number : " + Arrays.toString(findErrorNums(nums1)));
        System.out.println("Repeated number and Lost number : " + Arrays.toString(findErrorNums(nums2)));
    }

    // SOLUTION USING CYCLIC SORT - time complexity - O(n)
    public static int[] findErrorNums(int[] nums) {
        cyclicSort(nums);
        // Looping through array and finding the number repeated and number lost
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[]{nums[index], index + 1};
            }
        }
        return new int[]{-1, -1};
    }

    // Cyclic sort
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Since range is from [0,1] hence correctIndex will be element-1
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    // Function to swap array elements using index
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
