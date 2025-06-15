class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int maxLen = 0;
        int zeros = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeros++;
            }
            // If we have more than k zeros, shrink window from left
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            // Update maximum length of valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}
