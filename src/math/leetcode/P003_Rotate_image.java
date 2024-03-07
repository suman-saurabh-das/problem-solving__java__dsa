package math.leetcode;

/*
    48. Rotate image
    https://leetcode.com/problems/rotate-image/description/

    Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[7,4,1],[8,5,2],[9,6,3]]
    Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
    Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
*/

public class P003_Rotate_image {
    public static void main(String[] args) {
        int[][] num1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] num2 = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        System.out.println("Rotating array 1");
        rotate(num1);
        printArray(num1);
        System.out.println("Rotating array 2");
        rotate(num2);
        printArray(num2);
    }

    // SOLUTION USING NESTED FOR LOOP - time complexity - O(n^2)
    public static void rotate(int[][] matrix) {
        // To Rotate an array in-place by 90degree in clockwise direction,
        // Transpose the array
        // Reverse the elements in each row along center line
        transpose(matrix);
        reverse(matrix);
    }

    // Transpose
    public static void transpose(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            // Running the loop from (r+1)th element to last element in that row
            for (int c = r + 1; c < arr[r].length; c++) {
                // After transpose, the element at (r,c) becomes (c,r)
                int temp = arr[r][c];
                arr[r][c] = arr[c][r];
                arr[c][r] = temp;
            }
        }
    }

    // Reverse along x-axis
    public static void reverse(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            // Reverse elements in array using 2 pointers
            int start = 0, end = arr[r].length - 1;
            while (start <= end) {
                int temp = arr[r][start];
                arr[r][start] = arr[r][end];
                arr[r][end] = temp;
                start++;
                end--;
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
}
