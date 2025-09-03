class MinSwapsToGroupAll1sTogether2 {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        // Step 1: count total 1's
        int totalOnes = 0;
        for (int num : nums) {
            totalOnes += num;
        }
        if (totalOnes == 0 || totalOnes == n) return 0; // already grouped
        // Step 2: sliding window on nums + nums
        int[] arr = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            arr[i] = nums[i % n];
        }
        int currOnes = 0, maxOnes = 0;
        int left = 0;
        for (int right = 0; right < 2 * n; right++) {
            currOnes += arr[right];
            if (right - left + 1 > totalOnes) {
                currOnes -= arr[left];
                left++;
            }   
            if (right - left + 1 == totalOnes) {
                maxOnes = Math.max(maxOnes, currOnes);
            }
        }
        // Step 3: answer = totalOnes - maxOnes
        return totalOnes - maxOnes;
    }
}
