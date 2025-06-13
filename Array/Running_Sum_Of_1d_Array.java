class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] newa = new int[n];
        newa[0] = nums[0];
        for (int i = 1; i < n; i++) {
            newa[i] = newa[i - 1] + nums[i];
        }
        return newa;
    }
}
