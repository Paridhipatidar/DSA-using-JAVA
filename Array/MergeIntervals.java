import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        // Step 1: Sort intervals based on start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        // Step 2: List to store merged intervals
        List<int[]> result = new ArrayList<>();
        // Step 3: Iterate and merge
        for (int[] interval : intervals) {
            // If result is empty or no overlap, add directly
            if (result.isEmpty() || result.get(result.size() - 1)[1] < interval[0]) {
                result.add(interval);
            } else {
                // Merge with last interval
                result.get(result.size() - 1)[1] = Math.max(result.get(result.size() - 1)[1], interval[1]);
            }
        }
        // Step 4: Convert list to array
        return result.toArray(new int[result.size()][]);
    }
}
