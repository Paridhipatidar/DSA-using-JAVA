// Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
// Return the largest lucky integer in the array. If there is no lucky integer return -1.
class FindLucky{
    public int findLucky(int[] arr) {
        // Frequency map
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        // Count frequency
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        int result = -1;
        // Find largest lucky integer
        for (int key : freqMap.keySet()) {
            if (key == freqMap.get(key)) {
                result = Math.max(result, key);
            }
        }
        return result;
    }
}
