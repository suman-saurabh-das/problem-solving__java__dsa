package array.leetcode;

/*
    11. Container with most water
    https://leetcode.com/problems/container-with-most-water/description/

    Input: height = [1,8,6,2,5,4,8,3,7]
    Output: 49
    Input: height = [1,1]
    Output: 1
*/

public class P006_Container_with_most_water {
    public static void main(String[] args) {
        int[] nums1 = {1, 8, 6, 2, 5, 4, 8, 3, 7}, nums2 = {1, 1};
        System.out.println("Maximum amount of water : " + maxArea(nums1));
        System.out.println("Maximum amount of water : " + maxArea(nums2));
    }

    // USING 2 POINTER - time complexity - O(n)
    public static int maxArea(int[] height) {
        int start = 0, end = height.length - 1;
        int length, width, maxArea = 0;
        // Using 2 pointer approach
        while (start < end) {
            // Check the max height that can be of container
            // Calculate area considering height of wall at start position
            if (height[start] < height[end]) {
                length = height[start];
                width = end - start;
                start++;
            }
            // Calculate area considering height of wall at end position
            else if (height[end] < height[start]) {
                length = height[end];
                width = end - start;
                end--;
            }
            // Calculate area if both walls have equal height
            else {
                length = height[start];
                width = end - start;
                start++;
            }
            maxArea = length * width > maxArea ? length * width : maxArea;
        }
        return maxArea;
    }
}
