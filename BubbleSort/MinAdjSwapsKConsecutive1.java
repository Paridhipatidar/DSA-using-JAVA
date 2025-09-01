class MinAdjSwapsKConsecutive1 {
    public int minMoves(int[] nums, int k) {
        List<Integer> positions = new ArrayList<>();
        
        // Step 1: Collect indices of ones
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                positions.add(i);
            }
        }
        
        int n = positions.size();
        int[] adjusted = new int[n];
        
        // Adjust positions by subtracting index
        for (int i = 0; i < n; i++) {
            adjusted[i] = positions.get(i) - i;
        }
        
        // Step 2: Prefix sums of adjusted positions
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + adjusted[i];
        }
        
        long result = Long.MAX_VALUE;
        
        // Step 3: Sliding window of size k
        for (int i = 0; i + k <= n; i++) {
            int mid = i + k / 2;
            int median = adjusted[mid];
            
            long leftCost = (long) median * (mid - i) - (prefix[mid] - prefix[i]);
            long rightCost = (prefix[i + k] - prefix[mid + 1]) - (long) median * (i + k - mid - 1);
            
            result = Math.min(result, leftCost + rightCost);
        }
        
        return (int) result;
    }
}
