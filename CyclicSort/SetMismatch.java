class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
           if(nums[i]!=nums[correct]){
            int temp=nums[i];
            nums[i]=nums[correct];
            nums[correct]=temp;
           }
           else i++;
        }
        int aNew[] = new int[2];
        for(int j=0; j<nums.length;j++){
           if(nums[j]!=j+1){
            aNew[0]=nums[j];
            aNew[1]=j+1;
           }
        }
        return aNew;
    }
}
