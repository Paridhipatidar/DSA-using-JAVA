class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(tempList)); // Found valid combination
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            // If current number is greater than remaining target, no need to proceed
            if (candidates[i] > remain) break;

            tempList.add(candidates[i]);
            backtrack(result, tempList, candidates, remain - candidates[i], i + 1); // i + 1: move forward to avoid reuse
            tempList.remove(tempList.size() - 1); // Backtrack
        }
    }
}
