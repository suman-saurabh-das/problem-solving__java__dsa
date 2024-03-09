package sorting.leetcode;

/*
    448. Find all numbers disappeared in an array
    https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [5,6]
    Input: nums = [1,1]
    Output: [2]
*/

import java.util.ArrayList;

public class P006_Find_all_numbers_disappeared_in_an_array {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1};
        int[] nums2 = {1, 1};
        ArrayList<Integer> disappearedNumbers1 = findDisappearedNumbers(nums1);
        ArrayList<Integer> disappearedNumbers2 = findDisappearedNumbers(nums2);
        System.out.println("Numbers disappeared in list : " + disappearedNumbers1);
        System.out.println("Numbers disappeared in list : " + disappearedNumbers2);
    }

    // SOLUTION USING CYCLIC SORT - time complexity - O(n)
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> disappearedNumbers = new ArrayList<>();
        cyclicSort(nums);
        // Looping through the array and adding numbers which disappeared
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                disappearedNumbers.add(index + 1);
            }
        }
        return disappearedNumbers;
    }

    // Cyclic sort
    public static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // Since array ranges from [1,n], correct index will be element - 1
            // If element is not at correct index then swap
            // else increment counter and check for next element
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
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
