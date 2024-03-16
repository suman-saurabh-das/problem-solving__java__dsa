package array.leetcode;

/*
    1346. Check if n and its double exist
    https://leetcode.com/problems/check-if-n-and-its-double-exist/description/

    Input: arr = [10,2,5,3]
    Output: true
    Input: arr = [3,1,7,11]
    Output: false
*/

public class P010_Check_if_n_and_its_double_exist {
    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3}, arr2 = {3, 1, 7, 11}, arr3 = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println("Double of n exists : " + checkIfExist(arr1));
        System.out.println("Double of n exists : " + checkIfExist(arr2));
        System.out.println("Double of n exists : " + checkIfExist(arr3));
    }

    // SOLUTION USING NESTED LOOPS - time complexity - O(n^2)
    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == 2 * arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
