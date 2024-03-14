package binary_search.leetcode;

/*
    367. Valid perfect square
    https://leetcode.com/problems/valid-perfect-square/description/

    Input: num = 16
    Output: true
    Input: num = 14
    Output: false
 */

public class P005_Valid_perfect_square {
    public static void main(String[] args) {
        int num1 = 16, num2 = 14, num3 = 2147483647;
        System.out.println("Number is perfect square : " + isPerfectSquare(num1));
        System.out.println("Number is perfect square : " + isPerfectSquare(num2));
        System.out.println("Number is perfect square : " + isPerfectSquare(num3));
    }

    // SOLUTION USING BINARY SEARCH - time complexity - O(log(n))
    public static boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        // We are taking end as num/2 because square root of any perfect square
        // will be less than or equal to number/2;
        long start = 1, end = num / 2;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            if (mid * mid < num) {
                start = mid + 1;
            } else if (mid * mid > num) {
                end = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
