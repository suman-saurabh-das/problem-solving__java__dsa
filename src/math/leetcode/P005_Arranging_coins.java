package math.leetcode;

/*
    441. Arranging coins
    https://leetcode.com/problems/arranging-coins/description/

    Input: n = 5
    Output: 2
    Input: n = 8
    Output: 3
*/

public class P005_Arranging_coins {
    public static void main(String[] args) {
        int n1 = 5, n2 = 8;
        System.out.println("Maximum number of complete rows : " + arrangeCoins(n1));
        System.out.println("Maximum number of complete rows : " + arrangeCoins(n2));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static int arrangeCoins(int n) {
        // For every row we will add 1 coins, so in order to find the max complete rows,
        // we can subtract the maxCoins in a row from totalCoins until we have 0 or -ve number
        // If we have final output as -ve number that means the row is not full completely
        // If we have final output as 0 that means the row is full completely
        if (n == 0) {
            return 0;
        }
        int completeRows = 0, i = 1;
        while (n >= 0) {
            n = n - i;
            i = i + 1;
            completeRows++;
            if (n == 0) {
                return completeRows;
            }
            if (n < 0) {
                return completeRows - 1;
            }
        }
        return -1;
    }
}
