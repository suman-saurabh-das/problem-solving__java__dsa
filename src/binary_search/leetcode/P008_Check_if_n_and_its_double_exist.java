package binary_search.leetcode;

/*
    1346. Check if n and its double exist
    https://leetcode.com/problems/check-if-n-and-its-double-exist/description/

    Input: arr = [10,2,5,3]
    Output: true
    Input: arr = [3,1,7,11]
    Output: false
*/

public class P008_Check_if_n_and_its_double_exist {
    public static void main(String[] args) {
        int[] arr1 = {10, 2, 5, 3}, arr2 = {3, 1, 7, 11}, arr3 = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println("Double of n exists : " + checkIfExist(arr1));
        System.out.println("Double of n exists : " + checkIfExist(arr2));
        System.out.println("Double of n exists : " + checkIfExist(arr3));
    }

    // SOLUTION USING SELECTION SORT + BINARY SEARCH - time complexity - O(n^2) + O(nlog(n))
    public static boolean checkIfExist(int[] arr) {
        // Sort the array
        selectionSort(arr);
        // Apply binary search to see if there exists an element such that,
        // arr[i] = 2 * arr[j] and i != j
        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr, arr[i] * 2, i)) {
                return true;
            }
        }
        return false;
    }

    // Binary search
    public static boolean binarySearch(int[] arr, int target, int i) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Applying the check mid != i to ensure that the same element is not found
            // e.g. in case of 0, 0 * 2 will be zero hence it will check if index is different
            if (target == arr[mid] && mid != i) {
                return true;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    // Selection sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastElementIndex = arr.length - 1 - i;
            int largestElementIndex = findLargestElementIndex(arr, lastElementIndex);
            swap(arr, largestElementIndex, lastElementIndex);
        }
    }

    // Finding the index of largest element
    public static int findLargestElementIndex(int[] arr, int end) {
        int largestElementIndex = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[largestElementIndex]) {
                largestElementIndex = i;
            }
        }
        return largestElementIndex;
    }

    // Swapping 2 elements in array
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
