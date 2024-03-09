package sorting.leetcode;

/*
    287. Find the duplicate number
    https://leetcode.com/problems/find-the-duplicate-number/

    Input: nums = [1,3,4,2,2]
    Output: 2
    Input: nums = [3,1,3,4,2]
    Output: 3
    Input: nums = [3,3,3,3,3]
    Output: 3
*/

public class P007_Find_the_duplicate_number {
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 4, 2, 2}, nums2 = {3, 1, 3, 4, 2}, nums3 = {3, 3, 3, 3, 3};
        System.out.println("Duplicate element is : " + findDuplicate(nums1));
        System.out.println("Duplicate element is : " + findDuplicate(nums2));
        System.out.println("Duplicate element is : " + findDuplicate(nums3));
    }

    // SOLUTION USING CYCLIC SORT - time complexity - O(n)
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            // Check if current element is at correct index
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                // If element is not at correct index then swap
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                }
                // If element is at correct index, and it is duplicate return it
                else {
                    return nums[i];
                }
            }
            // If it is then move ahead
            else {
                i++;
            }
        }
        return -1;
    }

    // Function to swap array elements using index
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
