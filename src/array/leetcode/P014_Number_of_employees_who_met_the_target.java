package array.leetcode;

/*
    2798. Number of employees who met the target
    https://leetcode.com/problems/number-of-employees-who-met-the-target/description/

    Input: hours = [0,1,2,3,4], target = 2
    Output: 3
    Input: hours = [5,1,4,2,2], target = 6
    Output: 0
 */

public class P014_Number_of_employees_who_met_the_target {
    public static void main(String[] args) {
        int[] hours1 = {0, 1, 2, 3, 4}, hours2 = {5, 1, 4, 2, 2};
        int target1 = 3, target2 = 6;
        System.out.println("Number of employees who met the target : " + numberOfEmployeesWhoMetTarget(hours1, target1));
        System.out.println("Number of employees who met the target : " + numberOfEmployeesWhoMetTarget(hours2, target2));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        // loop through the array and check for employees who worked more than target hours
        int employeesCount = 0;
        for (int i = 0; i < hours.length; i++) {
            if (hours[i] >= target) {
                employeesCount++;
            }
        }
        return employeesCount;
    }
}
