class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for (int num : nums) {
            low = Math.max(low, num);  // max element
            high += num;               // total sum
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canSplit(nums, k, mid)) {
                high = mid; // possible, try smaller max sum
            } else {
                low = mid + 1; // not possible, need bigger max sum
            }
        }
        return low;
    }

    private boolean canSplit(int[] nums, int k, int maxSumAllowed) {
        int count = 1;
        int currentSum = 0;

        for (int num : nums) {
            if (currentSum + num > maxSumAllowed) {
                count++;             // start new subarray
                currentSum = num;
                if (count > k) return false;
            } else {
                currentSum += num;
            }
        }
        return true;
    }
}
