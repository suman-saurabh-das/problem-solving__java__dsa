package array.leetcode;

/*
    48. Rotate image
    https://leetcode.com/problems/rotate-image/description/
    NOTE - This solution allocates another 2D matrix (to get original position of elements)

    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[7,4,1],[8,5,2],[9,6,3]]
    Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
    Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
*/

public class P007_Rotate_image {
    public static void main(String[] args) {
        int[][] num1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] num2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotate(num1);
        rotate(num2);
        System.out.println("Rotating array 1");
        printArray(num1);
        System.out.println("Rotating array 2");
        printArray(num2);
    }

    // SOLUTION USING NESTED FOR LOOP - time complexity - O(n^2)
    public static void rotate(int[][] matrix) {
        // To rotate an array by 90 degrees, we can replace the index values
        // row will be replaced by col (r = c)
        // col will be replaced by modulus of n-1-r (c = |n-1-r|)
        // n is the number of elements in 1st row

        int n = matrix.length;
        int[][] refMatrix = new int[n][n];
        // Creating a copy of matrix so that we can get the values of elements from their original position
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                refMatrix[i][j] = matrix[i][j];
            }
        }
        // Changing position of elements in matrix
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int r = col, c = Math.abs(n - 1 - row);
                matrix[r][c] = refMatrix[row][col];
            }
        }
    }

    // Print the array
    public static void printArray(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Optimised using maths - Check solution P003_Rotate_image in math.leetcode package
    // Since, this solution allocates another 2D matrix (to get original position of elements)
}
