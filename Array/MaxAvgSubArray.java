class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // Step 1: Calculate the sum of the first 'k' elements
        double maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }
        double windowSum = maxSum;
        // Step 2: Slide the window from index k to end
        for (int i = k; i < nums.length; i++) {
            // Subtract the element going out and add the new element coming in
            windowSum = windowSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, windowSum);
        }
        // Step 3: Return the maximum average
        return maxSum / k;
    }
}
