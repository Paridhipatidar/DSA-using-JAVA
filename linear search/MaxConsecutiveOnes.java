class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int maxxCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
               count++;
               maxxCount=Math.max(maxxCount,count);
           }
            else{
                count=0;
            }
        }
        return maxxCount;
    }
}
