public int subarraySum(int[] nums, int k) {
    Map<Integer, Integer> map = new HashMap<>();
    map.put(0, 1); // prefix sum 0 has occurred once
    int sum = 0;   // running total
    int count = 0; // total subarrays found
    for (int num : nums) {
        sum += num; // update running sum
        // Check: have we seen (sum - k) before?
        // If yes, then there's a subarray that ends here and sums to k
        if (map.containsKey(sum - k)) {
            count += map.get(sum - k);
        }
        // Update how many times 'sum' has occurred
        map.put(sum, map.getOrDefault(sum, 0) + 1);
    }
    return count;
}
