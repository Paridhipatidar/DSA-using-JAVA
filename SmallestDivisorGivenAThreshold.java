class SmallestDivisorGivenAThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = 0;
        
        for (int num : nums) {
            right = Math.max(right, num);
        }
        
        int ans = right;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            int sum = 0;
            for (int num : nums) {
                sum += (num + mid - 1) / mid; // ceil division
            }
            
            if (sum <= threshold) {
                ans = mid;
                right = mid - 1; // try smaller divisor
            } else {
                left = mid + 1; // need larger divisor
            }
        }
        
        return ans;
    }
}
