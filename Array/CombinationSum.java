class Solution {
         public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int start, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current)); // found a valid combination
            return;
        }

        if (target < 0) {
            return; // exceed target, stop exploring this path
        }

        for (int i = start; i < candidates.length; i++) {
            current.add(candidates[i]); // choose
            backtrack(candidates, i, target - candidates[i], current, result); // not i+1, because we can reuse the same number
            current.remove(current.size() - 1); // un-choose
        }
    }
}
