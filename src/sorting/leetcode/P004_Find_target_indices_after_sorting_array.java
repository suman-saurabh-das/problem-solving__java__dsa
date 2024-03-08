package sorting.leetcode;

/*
    2089. Find target indices after sorting array
    https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

    Input: nums = [1,2,5,2,3], target = 2
    Output: [1,2]
    Input: nums = [1,2,5,2,3], target = 3
    Output: [3]
    Input: nums = [1,2,5,2,3], target = 5
    Output: [4]
*/

import java.util.ArrayList;

public class P004_Find_target_indices_after_sorting_array {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 2, 3};
        int target1 = 2, target2 = 3, target3 = 5;
        ArrayList<Integer> list1 = targetIndices(num, target1);
        ArrayList<Integer> list2 = targetIndices(num, target2);
        ArrayList<Integer> list3 = targetIndices(num, target3);
        System.out.println("Target indices are : " + list1);
        System.out.println("Target indices are : " + list2);
        System.out.println("Target indices are : " + list3);
    }

    public static ArrayList<Integer> targetIndices(int[] nums, int target) {
//        bubbleSort(nums);
//        selectionSort(nums);
        insertionSort(nums);
        ArrayList<Integer> indices = new ArrayList<>();
        // Finding the duplicates and adding them to the list
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                indices.add(i);
            }
        }
        return indices;
    }

    // SOLUTION USING BUBBLE SORT - time complexity - O(n^2)
    public static void bubbleSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                // Swap if element at index j is smaller than (j-1) index.
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
    }

    // SOLUTION USING SELECTION SORT - time complexity - O(n^2)
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int lastElementIndex = arr.length - i - 1;
            int maxElementIndex = findMaxElementIndex(arr, 0, lastElementIndex);
            swap(arr, maxElementIndex, lastElementIndex);
        }
    }

    // SOLUTION USING INSERTION SORT - time complexity - O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                // Swap if element at index j is smaller than j-1
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    // Function to find index of max element
    public static int findMaxElementIndex(int[] arr, int start, int end) {
        int maxElementIndex = 0;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[maxElementIndex]) {
                maxElementIndex = i;
            }
        }
        return maxElementIndex;
    }

    // Function to swap array elements using index
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
