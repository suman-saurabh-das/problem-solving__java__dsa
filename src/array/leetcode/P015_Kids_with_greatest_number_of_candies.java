package array.leetcode;

/*
    1431. Kids with the greatest number of candies
    https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

    Input: candies = [2,3,5,1,3], extraCandies = 3
    Output: [true,true,true,false,true]
    Input: candies = [4,2,1,1,2], extraCandies = 1
    Output: [true,false,false,false,false]
    Input: candies = [12,1,12], extraCandies = 10
    Output: [true,false,true]
*/

import java.util.ArrayList;

public class P015_Kids_with_greatest_number_of_candies {
    public static void main(String[] args) {
        int[] candies1 = {2, 3, 5, 1, 3}, candies2 = {4, 2, 1, 1, 2}, candies3 = {12, 1, 12};
        int extraCandies1 = 3, extraCandies2 = 1, extraCandies3 = 1;
        System.out.println("Kids with greatest candies : " + kidsWithCandies(candies1, extraCandies1));
        System.out.println("Kids with greatest candies : " + kidsWithCandies(candies2, extraCandies2));
        System.out.println("Kids with greatest candies : " + kidsWithCandies(candies3, extraCandies3));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int minCandiesRequired = findMinimumCandiesRequired(candies);
        ArrayList<Boolean> listOfKids = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            // Check if the kid has greatest amount of candies after getting extra candies
            if (candies[i] + extraCandies >= minCandiesRequired) {
                listOfKids.add(true);
            } else {
                listOfKids.add(false);
            }
        }
        return listOfKids;
    }

    // Find the minimum amount of candy a kid must have
    public static int findMinimumCandiesRequired(int[] candies) {
        int minimumCandiesRequired = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > minimumCandiesRequired) {
                minimumCandiesRequired = candies[i];
            }
        }
        return minimumCandiesRequired;
    }
}
