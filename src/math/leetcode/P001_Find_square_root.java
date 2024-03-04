package math.leetcode;

/*
    69. Sqrt(x)
    https://leetcode.com/problems/sqrtx/description/

    Input: x = 4
    Output: 2
    Input: x = 8
    Output: 2
*/

public class P001_Find_square_root {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(2147395599));
    }

    // SOLUTION USING MATH - time complexity - O(n)
    public static int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        long result = 1;
        while (result * result <= x) {
            result++;
        }
        if (result * result == x) {
            return (int) result;
        }
        return (int) result - 1;
    }
}
