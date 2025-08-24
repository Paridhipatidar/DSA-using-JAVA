class FindSmallestLetterGreater {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] > nums[high]) {
                // Minimum must be in right half
                low = mid + 1;
            } else if (nums[mid] < nums[high]) {
                // Minimum could be at mid or left half
                high = mid;
            } else {
                // nums[mid] == nums[high], shrink range
                high--;
            }
        }

        return nums[low]; // or nums[high], since low == high
    }
}
