package string.leetcode;

/*
    2011. Final value of variable after performing operations
    https://leetcode.com/problems/final-value-of-variable-after-performing-operations/submissions/1200581057/

    Input: operations = ["--X","X++","X++"]
    Output: 1
    Input: operations = ["++X","++X","X++"]
    Output: 3
    Input: operations = ["X++","++X","--X","X--"]
    Output: 0
*/

public class P002_Final_value_of_variable_after_performing_operations {
    public static void main(String[] args) {
        String[] operations1 = {"--X", "X++", "X++"}, operations2 = {"++X", "++X", "X++"};
        String[] operations3 = {"X++", "++X", "--X", "X--"};
        System.out.println("Final value of variable : " + finalValueAfterOperations(operations1));
        System.out.println("Final value of variable : " + finalValueAfterOperations(operations2));
        System.out.println("Final value of variable : " + finalValueAfterOperations(operations3));
    }

    // SOLUTION USING LOOP - time complexity - O(n)
    public static int finalValueAfterOperations(String[] operations) {
        int value = 0;
        // Loop through array and check if the operation increments or decrements
        for (int i = 0; i < operations.length; i++) {
            // .equals() method is used to check if 2 strings are equal
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                value++;
            } else {
                value--;
            }
        }
        return value;
    }
}
