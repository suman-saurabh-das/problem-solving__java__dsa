package sorting.leetcode;

/*
    41. First missing positive
    https://leetcode.com/problems/first-missing-positive/description/

    Input: nums = [1,2,0]
    Output: 3
    Input: nums = [3,4,-1,1]
    Output: 2
    Input: nums = [7,8,9,11,12]
    Output: 1
*/

public class P010_First_missing_positive {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 0}, nums2 = {3, 4, -1, 1}, nums3 = {7, 8, 9, 11, 12};
        System.out.println("First missing positive integer is : " + firstMissingPositive(nums1));
        System.out.println("First missing positive integer is : " + firstMissingPositive(nums2));
        System.out.println("First missing positive integer is : " + firstMissingPositive(nums3));
    }

    // SOLUTION USING CYCLIC SORT - time complexity - O(n)
    public static int firstMissingPositive(int[] nums) {
        cyclicSort(nums);
        // Looping through the array to find the smallest positive missing integer
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }
        // If all elements are present in the array from [1,n] then return length + 1
        return nums.length + 1;
    }

    // Cyclic sort
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Since we need to find the smallest positive integer, range will be [1,n]
            // 0 is neither positive nor negative
            int correctIndex = arr[i] - 1;
            // We will ignore all the negative numbers as well as 0
            // And if any element is greater than the length of array we will not sort it
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctIndex]) {
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
