package binary_search.leetcode;

/*
    278. First bad version
    https://leetcode.com/problems/first-bad-version/description/

    Input: n = 5, bad = 4
    Output: 4
    Input: n = 1, bad = 1
    Output: 1
*/

public class P003_First_bad_version {
    public static void main(String[] args) {
        // NOTE - This is an interactive problem hence it cannot be tested here fully
        System.out.println(firstBadVersion(5));
    }

    // Internal method
    public static boolean isBadVersion(int num) {
        int bad = 4;
        return num >= bad;
    }

    // SOLUTION USING BINARY SEARCH
    public static int firstBadVersion(int n) {
        // Applying binary search to find the first bad version
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // If version is bad, then check for versions before it
            if (isBadVersion(mid)) {
                end = mid - 1;
            }
            // If version is not bad, then check for versions after it
            else {
                start = mid + 1;
            }
        }
        // At the end the search space will be reduced to the first bad version
        // Then start will point to first bad version.
        return start;
    }
}
