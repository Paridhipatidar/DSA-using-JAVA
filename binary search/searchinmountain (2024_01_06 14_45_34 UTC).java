class searchinmountain{
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,3,2};
        int target=3;
        System.out.println(ans(arr,target));
    }
    static int ans (int []arr,int target){
        int peak=peakinmou(arr);
        int firsttry=orderagnosticbs(arr,target,0,peak);
        if(firsttry!=-1)
        return firsttry;
        return orderagnosticbs(arr,target,peak+1,arr.length-1);
    }
    static int peakinmou(int []arr){
        int start=0, end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
            end=mid;
            else
            start = mid+1;
        }
        return start;
    }
    static int orderagnosticbs(int []arr,int key,int start,int end){
       boolean isasc=arr[start]<arr[end];
        while(start<=end){
             int mid=start+(end-start)/2;
            if(arr[mid]==key)
            return mid;
            if(isasc){
               if(arr[mid]<key)
            start=mid+1;
               else
            end=mid-1;
            }
            else{
                if(arr[mid]>key)
            start=mid+1;
                else
            end=mid-1;
            }
        }
        return -1;
    }
}