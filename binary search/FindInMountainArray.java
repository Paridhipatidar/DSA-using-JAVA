/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
class FindInMountainArray {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();

        // Step 1: Find the peak index
        int peak = findPeak(mountainArr, n);

        // Step 2: Binary search on increasing side
        int index = binarySearch(mountainArr, target, 0, peak, true);
        if (index != -1) return index;

        // Step 3: Binary search on decreasing side
        return binarySearch(mountainArr, target, peak + 1, n - 1, false);
    }

    // Find the peak index of mountain array
    private int findPeak(MountainArray arr, int n) {
        int left = 0, right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1; // peak is on the right
            } else {
                right = mid; // peak is on the left or mid
            }
        }
        return left; // or right (both same)
    }

    // Binary search function
    private int binarySearch(MountainArray arr, int target, int left, int right, boolean ascending) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr.get(mid);

            if (value == target) return mid;

            if (ascending) {
                if (value < target) left = mid + 1;
                else right = mid - 1;
            } else { // descending order
                if (value > target) left = mid + 1;
                else right = mid - 1;
            }
        }
        return -1;
    }
}
