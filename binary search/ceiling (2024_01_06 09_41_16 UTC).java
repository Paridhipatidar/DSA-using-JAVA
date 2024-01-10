class ceiling{
    public static void main(String args[]){
         int arr[]={2,3,5,9,14,16,18};
         int target=19;
         System.out.println(ceilingb(arr,target));
    }
    static int ceilingb(int []arr,int key){    
         if(key>arr[arr.length-1])
           return -1;
       int lb=0,ub=arr.length-1,mid;
        while(lb<=ub){
             mid=lb+(ub-lb)/2;
            if(arr[mid]==key)
            return key;
            if(arr[mid]<key)
            lb=mid+1;
            else
            ub=mid-1;
        }
        return arr[lb%arr.length];
    }
}
    