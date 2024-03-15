package binary_search.leetcode;

/*
    704. Binary search

    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1
*/

public class P007_Binary_search {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target1 = 9, target2 = 2;
        System.out.println("Element is found at index : " + search(nums, target1));
        System.out.println("Element is found at index : " + search(nums, target2));
    }

    // SOLUTION USING BINARY SEARCH - time complexity - O(log(n))
    public static int search(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // If target is greater than middle element then search in right half
            if (target > nums[mid]) {
                start = mid + 1;
            }
            // If target is lesser than middle element then search in left half
            else if (target < nums[mid]) {
                end = mid - 1;
            }
            // If target is found, return index
            else {
                return mid;
            }
        }
        // If target is not found, return -1
        return -1;
    }
}
