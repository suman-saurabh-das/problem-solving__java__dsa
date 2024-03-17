package sorting.leetcode;

/*
    88. Merge sorted array
    https://leetcode.com/problems/merge-sorted-array/description/

    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    Output: [1]
*/

import java.util.Arrays;

public class P011_Merge_sorted_array {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0}, nums2 = {2, 5, 6}, nums3 = {1}, nums4 = {}, nums5 = {0}, nums6 = {1};
        int m1 = 3, n1 = 3, m2 = 1, n2 = 0, m3 = 0, n3 = 1;
        merge(nums1, m1, nums2, n1);
        merge(nums3, m2, nums4, n2);
        merge(nums5, m3, nums6, n3);
        System.out.println("Merged sorted array : " + Arrays.toString(nums1));
        System.out.println("Merged sorted array : " + Arrays.toString(nums3));
        System.out.println("Merged sorted array : " + Arrays.toString(nums5));
    }

    // Merging the 2 arrays and then sorting them
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        // bubbleSort(nums1);
        // selectionSort(nums1);
        insertionSort(nums1);
    }

    // SOLUTION USING BUBBLE SORT - time complexity - O(n^2)
    public static void bubbleSort(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;
            for (int j = 1; j < arr.length - i; j++) {
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
            int lastElementIndex = arr.length - 1 - i;
            int maxElementIndex = findMaxElementIndex(arr, lastElementIndex);
            swap(arr, lastElementIndex, maxElementIndex);
        }
    }

    // SOLUTION USING INSERTION SORT - time complexity - O(n^2)
    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }

            }
        }
    }

    // Swap 2 elements in array using index
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Find index of maximum element
    public static int findMaxElementIndex(int[] arr, int end) {
        int maxElementIndex = 0;
        for (int i = 0; i <= end; i++) {
            if (arr[i] > arr[maxElementIndex]) {
                maxElementIndex = i;
            }

        }
        return maxElementIndex;
    }
}
