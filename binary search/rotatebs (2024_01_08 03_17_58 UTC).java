class rotatebs{
    public static void main(String args[]){
        int []arr={5,6,7,0,1,2,3,4};
        int target=2;
        System.out.println(findpivot(arr));
        System.out.println(bsearch(arr,target));
    }
    static int bsearch(int []nums,int target){
        int pivot=findpivot(nums);
        if(pivot==-1)
        return binary(nums,target,0,nums.length-1);
        //if pivot is found,you have two asc sorted arrays
        if(nums[pivot]==target)
        return pivot;
        if(target>=nums[0])
        return binary(nums,target,0,pivot-1);
        return binary(nums,target,pivot+1,nums.length-1);
    }
    static int findpivot(int []arr){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1])
            return mid;
            if(mid>start && arr[mid]<arr[mid-1])
            return mid-1;
            if(arr[mid]<=arr[start])
            end=mid-1;
            else 
            start=mid+1;
        }
        return -1;
    }
    static int binary(int []arr,int key,int lb,int ub){
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]==key)
            return mid;
            if(arr[mid]<key)
            lb=mid+1;
            else
            ub=mid-1;
        }
        return -1;
    }
}