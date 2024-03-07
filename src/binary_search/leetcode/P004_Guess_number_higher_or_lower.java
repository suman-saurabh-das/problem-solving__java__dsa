package binary_search.leetcode;

/*
    374. Guess number higher or lower
    https://leetcode.com/problems/guess-number-higher-or-lower/description/

    Input: n = 10, pick = 6
    Output: 6
    Input: n = 1, pick = 1
    Output: 1
    Input: n = 2, pick = 1
    Output: 1
*/

public class P004_Guess_number_higher_or_lower {
    public static void main(String[] args) {
        // NOTE - This is an interactive problem hence it cannot be tested here fully
        System.out.println("Number to be guessed is : " + guessNumber(10));
    }

    // SOLUTION USING BINARY SEARCH - time complexity - O(log(n))
    public static int guessNumber(int n) {
        int start = 0, end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // If mid is lower than the picked number
            if (guess(mid) == 1) {
                start = mid + 1;
            }
            // If mid is higher than the picked number
            else if (guess(mid) == -1) {
                end = mid - 1;
            }
            // If mid is equal to picked number
            else {
                return mid;
            }
        }
        return -1;
    }

    // Internal method
    public static int guess(int num) {
        int pick = 6;
        if (num > pick) {
            return -1;
        } else if (num < pick) {
            return 1;
        } else {
            return 0;
        }
    }
}
