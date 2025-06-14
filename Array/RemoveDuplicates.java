class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1; // Start from index 1, because the first element is always unique

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Place the unique element at index k
                k++;
            }
        }

        return k;
    }
}
