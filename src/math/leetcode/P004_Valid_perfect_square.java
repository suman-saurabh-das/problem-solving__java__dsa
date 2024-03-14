package math.leetcode;

/*
    367. Valid perfect square
    https://leetcode.com/problems/valid-perfect-square/description/
    NOTE - This solution gives time limit exceeded error, optimised using binary search.
    Optimised solution - P005_Valid_perfect_square in binary_search.leetcode package.

    Input: num = 16
    Output: true
    Input: num = 14
    Output: false
 */

public class P004_Valid_perfect_square {
    public static void main(String[] args) {
        int num1 = 16, num2 = 14;
        System.out.println("Number is perfect square : " + isPerfectSquare(num1));
        System.out.println("Number is perfect square : " + isPerfectSquare(num2));
//        System.out.println("Number is perfect square : " + isPerfectSquare(2147483647));
    }

    // SOLUTION USING Loop - time complexity - O(n)
    public static boolean isPerfectSquare(int num) {
        // A number will be perfect square if count * count is equal to num
        long count = 1;
        while (count * count <= num) {
            if (count * count == num) {
                return true;
            } else {
                count++;
            }
        }
        return false;
    }
}
