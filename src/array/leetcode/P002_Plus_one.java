package array.leetcode;

/*
    66. Plus one
    https://leetcode.com/problems/plus-one/description/

    Input: digits = [1,2,3]
    Output: [1,2,4]
    Input: digits = [4,3,2,1]
    Output: [4,3,2,2]
    Input: digits = [9]
    Output: [1,0]
    Input: digits = [9,8,7,6,5,4,3,2,1,0]
    Output: [9,8,7,6,5,4,3,2,1,1]
*/

import java.util.Arrays;

public class P002_Plus_one {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {4, 3, 2, 1}, nums3 = {9}, nums4 = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println("Updated array : " + Arrays.toString(plusOne(nums1)));
        System.out.println("Updated array : " + Arrays.toString(plusOne(nums2)));
        System.out.println("Updated array : " + Arrays.toString(plusOne(nums3)));
        System.out.println("Updated array : " + Arrays.toString(plusOne(nums4)));
    }

    // SOLUTION 1 - USING LOOPS - time complexity - O(n)
    public static int[] plusOne(int[] digits) {
        // Looping in digits array from end to start
        // because we need to add 1 to the number and units digit will be at end of array
        for (int i = digits.length - 1; i >= 0; i--) {
            // If current digit is not 9 then add 1 and return array
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }
            // If current digit is 9 then replace it with 0 and check for next digit
            else {
                digits[i] = 0;
            }
        }
        // If all digits in array are 9 then create a new array having length 1 more than digits array
        // Replace first element with 1. (By default all values in array will be initialized with 0)
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    // SOLUTION 2 - USING 2 LOOPS - time complexity - O(n + m)
    // (Will not work for numbers which are greater than what long variable can hold)
    public static int[] plusOne2(int[] digits) {
        // Convert array to number
        long placeValue = 1;
        long number = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            number = number + digits[i] * placeValue;
            placeValue = placeValue * 10;
        }

        // Add 1 with the number
        number = number + 1;

        // Calculate the size of array for new number
        // Convert number to string using valueOf() then use length()
        int lengthOfNewArray = String.valueOf(number).length();

        // Convert number to array
        int[] digitsNew = new int[lengthOfNewArray];
        while (number > 0) {
            long lastDigit = number % 10;
            digitsNew[lengthOfNewArray - 1] = (int) lastDigit;
            number = number / 10;
            lengthOfNewArray--;
        }
        return digitsNew;
    }
}
