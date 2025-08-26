class MaxProductOf3Num {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        
        // Bubble Sort Implementation
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        
        // Now array is sorted
        int prod1 = nums[n-1] * nums[n-2] * nums[n-3]; // last 3 elements
        int prod2 = nums[0] * nums[1] * nums[n-1];     // first 2 smallest + largest
        
        return Math.max(prod1, prod2);
    }
}
