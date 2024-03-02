package binary_search.leetcode;

/*
    69. Sqrt(x)
    https://leetcode.com/problems/sqrtx/description/

    Input: x = 4
    Output: 2
    Input: x = 8
    Output: 2
*/

public class P002_Find_square_root {
    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(2147395599));
        System.out.println(mySqrt2(2147395599));
    }

    // SOLUTION USING BINARY SEARCH - time complexity - O(log(n))
    // Gives out of memory error for x = 2147395599 if we use int,
    // so we use long then convert it into int
    public static int mySqrt(int x) {
        // Return 0 if x = 0 and 1 if x = 1
        if (x == 0 || x == 1) {
            return x;
        }
        // Binary search in array to find the square root of x rounded off to nearest integer
        long start = 1, end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid > x) {
                end = mid - 1;
            } else if (mid * mid < x) {
                start = mid + 1;
            } else {
                // If perfect square of number is present
                return (int) mid;
            }
        }
        // If perfect square of number is not present, we return the rounded off value
        return (int) end;
    }

    // SOLUTION USING WHILE LOOP - time complexity - O(n)
    public static int mySqrt2(int x) {
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
