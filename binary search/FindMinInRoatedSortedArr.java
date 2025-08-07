class FindMinInRoatedSortedArr {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the mid element is greater than the end, min must be in right half
            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                // Otherwise, min is in left half including mid
                end = mid;
            }
        }

        // At the end, start == end and pointing to the smallest element
        return nums[start];
    }
}
