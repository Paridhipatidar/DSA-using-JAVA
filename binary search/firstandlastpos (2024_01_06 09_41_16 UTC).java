class firstandlastpos{
         public static void main(String args[]){
         int arr[]={5,7,7,7,7,8,8,10};
         int target=7;
         int []ans=searchrange(arr,target);
         System.out.println(ans);
         }
      static int[] searchrange(int [] nums,int target){
        int []ans={-1,-1};
         ans[0]=search(nums,target,true);
         if(ans[0]!=-1)
         ans[1]=search(nums,target,false);
        return ans;
      }
      static int search(int[]nums,int target,boolean findstartindex){
        int ans=-1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                ans=mid;
                if(findstartindex)
                end=mid-1;
                else
                start=mid+1;
            }
            if(nums[mid]<target)
            start=mid+1;
            else
            end=mid-1;
        }
        return ans;
    }
  }
