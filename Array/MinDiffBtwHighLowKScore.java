class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
          Arrays.sort(nums);
         int min=0;
         int max=k-1;
         int minDiff=Integer.MAX_VALUE;
         for(int i=0;i<nums.length-k+1;i++){
           if(nums[max]-nums[min]<minDiff){
              minDiff=nums[max]-nums[min];
           }
           min++;
           max++;
         }
         return minDiff;
    }
}
