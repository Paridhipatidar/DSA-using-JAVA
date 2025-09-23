class FindAllDuplicatesInArray {
    public List<Integer> findDuplicates(int[] nums) {
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
        List<Integer> aNew=new ArrayList<Integer>();
        for(int j=0; j<nums.length;j++){
           if(nums[j]!=j+1){
            aNew.add(nums[j]);
           }
        }
        return aNew;
    }
}
