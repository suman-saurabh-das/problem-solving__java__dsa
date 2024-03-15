package binary_search.leetcode;

/*
    441. Arranging coins
    https://leetcode.com/problems/arranging-coins/description/

    Input: n = 5
    Output: 2
    Input: n = 8
    Output: 3
*/

public class P006_Arranging_coins {
    public static void main(String[] args) {
        int n1 = 5, n2 = 8;
        System.out.println("Maximum number of complete rows : " + arrangeCoins(n1));
        System.out.println("Maximum number of complete rows : " + arrangeCoins(n2));
    }

    // SOLUTION USING BINARY SEARCH - time complexity - O(log(n))
    public static int arrangeCoins(int n) {
        // For i = 1, we have total 1 coin
        // For i = 2, we have total 3 coins
        // For i = 3, we have total 6 coins
        // ...
        // For i = n, we have total n*(n+1)/2 coins
        // So using binary search we try to find the minimum row (i) which has total coins
        // equal to or less than n
        long start = 1, end = n, ans = 1;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sumOfCoins = mid * (mid + 1) / 2;
            // Here we have found the possible answer,
            // but we still check if a value less than this is possible
            if (sumOfCoins <= n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) ans;
    }
}
