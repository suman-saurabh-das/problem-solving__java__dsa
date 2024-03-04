package sorting.leetcode;

/*
    217. Contains Duplicate
    https://leetcode.com/problems/contains-duplicate/description/
    NOTE - This solution gives time limit exceeded error, need to optimize using other method

    Input: nums = [1,2,3,1]
    Output: true
    Input: nums = [1,2,3,4]
    Output: false
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
*/

public class P002_Contains_duplicate {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1}, nums2 = {1, 2, 3, 4}, nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Array has duplicates " + containsDuplicate(nums1));
        System.out.println("Array has duplicates " + containsDuplicate(nums2));
        System.out.println("Array has duplicates " + containsDuplicate(nums3));
    }

    public static boolean containsDuplicate(int[] nums) {
        // Sorting the array
        bubbleSort(nums);
        // Comparing adjacent elements to see if there are any duplicates
        boolean hasDuplicates = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                hasDuplicates = true;
                break;
            }
        }
        return hasDuplicates;
    }

    // SOLUTION USING BUBBLE SORT - time complexity - O(n^2)
    public static void bubbleSort(int[] arr) {
        boolean isSwapped;  // flag to break out of loop if no swap occurs
        // External for loop, will be used to count the number of iterations (passes)
        // This loop will run (n-1) times
        for (int i = 0; i < arr.length - 1; i++) {
            // Internal for loop, which will be used to compare current and previous element
            // and swap them if current element is smaller than previous element
            // And this loop will run (n-i) times
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    // Optimise using hash-map
}
