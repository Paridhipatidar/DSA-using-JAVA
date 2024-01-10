class basicb{
    public static void main(String args[]){
         int arr[]={1,2,3,4,5,6};
         int target=5;
         System.out.println(arr.length);
         System.out.println(binary(arr,target));
    }
    static int binary(int []arr,int key){
       int lb=0,ub=arr.length-1,mid;
        while(lb<=ub){
            // mid=lb+ub/2; //this may exceed the range of int show error
             mid=lb+(ub-lb)/2;
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