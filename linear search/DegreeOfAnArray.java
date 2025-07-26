class DegreeOfAnArray {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> count = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> lastIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count.put(num, count.getOrDefault(num, 0) + 1);
            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }
            lastIndex.put(num, i);
        }
        int degree = Collections.max(count.values());
        int minLength = nums.length;
        
        for (int num : count.keySet()) {
            if (count.get(num) == degree) {
                int length = lastIndex.get(num) - firstIndex.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }
        return minLength;
    }
}
