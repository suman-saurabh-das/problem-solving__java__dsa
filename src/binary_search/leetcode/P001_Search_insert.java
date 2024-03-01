package binary_search.leetcode;

/*
    35. Search insert position
    https://leetcode.com/problems/search-insert-position/description/

    Input: nums = [1,3,5,6], target = 5
    Output: 2
    Input: nums = [1,3,5,6], target = 2
    Output: 1
    Input: nums = [1,3,5,6], target = 7
    Output: 4
*/

public class P001_Search_insert {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target1 = 5, target2 = 2, target3 = 7;
        System.out.println("Position is : " + searchInsert(nums, target1));
        System.out.println("Position is : " + searchInsert(nums, target2));
        System.out.println("Position is : " + searchInsert(nums, target3));
    }

    // SOLUTION USING BINARY-SEARCH - time complexity - O(log(n))
    public static int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        // At loop breaking condition, we return start
        // because it will be the position where element should be inserted.
        return start;
    }
}
