package sorting.leetcode;

/*
    268. Missing number
    https://leetcode.com/problems/missing-number/description/

    Input: nums = [3,0,1]
    Output: 2
    Input: nums = [0,1]
    Output: 2
    Input: nums = [9,6,4,2,3,5,7,0,1]
    Output: 8
*/

public class P005_Missing_number {
    public static void main(String[] args) {
        int[] nums1 = {0, 3, 1}, nums2 = {0, 1}, nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println("Missing number is : " + missingNumber(nums1));
        System.out.println("Missing number is : " + missingNumber(nums2));
        System.out.println("Missing number is : " + missingNumber(nums3));
    }

    // SOLUTION USING CYCLIC SORT - time complexity - O(n)
    public static int missingNumber(int[] arr) {
        // Sorting the array
        cyclicSort(arr);
        // Looping through the array to find the index of duplicate element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }
        // If no number is duplicate, return the length of array
        // (as it would be the next element in array)
        return arr.length;
    }

    // Cyclic sort
    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // Correct index of element should be the element itself since range is [0,n]
            int correctIndex = arr[i];
            // Check if element is within array index bounds and if it is at correct position
            // If it is within array bounds, and it is not at correct position then swap
            // else increment counter and check next element
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]) {
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
