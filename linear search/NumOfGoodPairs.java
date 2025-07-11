// Given an array of integers nums, return the number of good pairs.
// A pair (i, j) is called good if nums[i] == nums[j] and i < j.

class NumOfGoodPairs{
    public int numIdenticalPairs(int[] nums) {
        int[] freq = new int[101]; // nums[i] is between 1 and 100
        for (int num : nums) {
            freq[num]++;
        }
        int goodPairs = 0;
        for (int count : freq) {
            goodPairs += (count * (count - 1)) / 2;
        }
        return goodPairs;
    }
}
