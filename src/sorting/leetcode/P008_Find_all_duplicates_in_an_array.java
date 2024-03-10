package sorting.leetcode;

/*
    442. Find all duplicates in an array
    https://leetcode.com/problems/find-all-duplicates-in-an-array/

    Input: nums = [4,3,2,7,8,2,3,1]
    Output: [2,3]
    Input: nums = [1,1,2]
    Output: [1]
    Input: nums = [1]
    Output: []
*/

import java.util.ArrayList;

public class P008_Find_all_duplicates_in_an_array {
    public static void main(String[] args) {
        int[] nums1 = {4, 3, 2, 7, 8, 2, 3, 1}, nums2 = {1, 1, 2}, nums3 = {1};
        ArrayList<Integer> duplicateNumbers1 = findDisappearedNumbers(nums1);
        ArrayList<Integer> duplicateNumbers2 = findDisappearedNumbers(nums2);
        ArrayList<Integer> duplicateNumbers3 = findDisappearedNumbers(nums3);
        System.out.println("Duplicate numbers in list : " + duplicateNumbers1);
        System.out.println("Duplicate numbers in list : " + duplicateNumbers2);
        System.out.println("Duplicate numbers in list : " + duplicateNumbers3);
    }

    // SOLUTION USING CYCLIC SORT - time complexity - O(n)
    public static ArrayList<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> duplicateNumbers = new ArrayList<>();
        cyclicSort(nums);
        // Looping through the array and adding numbers which are duplicate
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                duplicateNumbers.add(nums[index]);
            }
        }
        return duplicateNumbers;
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
