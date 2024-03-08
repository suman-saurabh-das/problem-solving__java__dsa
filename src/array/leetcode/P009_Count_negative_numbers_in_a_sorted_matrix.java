package array.leetcode;

/*
    1351. Count negative numbers in a sorted matrix
    https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

    Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    Output: 8
    Input: grid = [[3,2],[1,0]]
    Output: 0
*/

public class P009_Count_negative_numbers_in_a_sorted_matrix {
    public static void main(String[] args) {
        int[][] grid1 = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        int[][] grid2 = {{3, 2}, {1, 0}};
        System.out.println("Count of negative numbers : " + countNegatives(grid1));
        System.out.println("Count of negative numbers : " + countNegatives(grid2));
    }

    // SOLUTION USING NESTED FOR LOOP - time complexity - O(n^2)
    public static int countNegatives(int[][] grid) {
        int countOfNegativeNumbers = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) {
                    countOfNegativeNumbers++;
                }
            }
        }
        return countOfNegativeNumbers;
    }
}
