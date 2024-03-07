package sorting.leetcode;

/*
    1637. Widest vertical area between two points containing no points
    https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/
    NOTE - This solution gives time limit exceeded error, need to optimize using other method

    Input: points = [[8,7],[9,9],[7,4],[9,7]]
    Output: 1
    Input: points = [[3,1],[9,0],[1,0],[1,4],[5,3],[8,8]]
    Output: 3
*/

public class P003_Widest_vertical_area_between_two_points_containing_no_points {
    public static void main(String[] args) {
        int[][] points1 = {{8, 7}, {9, 9}, {7, 4}, {9, 7}};
        int[][] points2 = {{3, 1}, {9, 0}, {1, 0}, {5, 3}, {8, 8}};
        System.out.println("Max width : " + maxWidthOfVerticalArea(points1));
        System.out.println("Max width : " + maxWidthOfVerticalArea(points2));
    }

    // SOLUTION USING BUBBLE SORT - time complexity - O(n^2)
    public static int maxWidthOfVerticalArea(int[][] points) {
        // We need to find the max width between 2 consecutive points in x-coordinate
        // Create an array from the points given so that we have the x-coordinates
        int[] pointsAlongXAxis = new int[points.length];
        for (int i = 0; i < points.length; i++) {
            pointsAlongXAxis[i] = points[i][0];
        }
        // Now sort the array containing the x-coordinates
        bubbleSort(pointsAlongXAxis);
        // Maximum difference between 2 consecutive points will be the widest
        int maxDifference = 0;
        for (int i = 0; i < pointsAlongXAxis.length - 1; i++) {
            int difference = pointsAlongXAxis[i + 1] - pointsAlongXAxis[i];
            maxDifference = difference > maxDifference ? difference : maxDifference;
        }
        return maxDifference;
    }

    // Bubble sort
    public static void bubbleSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if previous element is greater than current element
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true;
                }
            }
            // If no swapping occurs that means array is sorted, so break out of loop
            if (!isSwapped) {
                break;
            }
        }
    }
}
