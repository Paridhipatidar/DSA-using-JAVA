class desorder{
    public static void main(String args[]){
         int arr[]={7,5,4,3,2,1};
         int target=4;
         System.out.println("present at" + binary(arr,target));
    }
    static int binary(int []arr,int key){
       int lb=0,ub=arr.length-1,mid;
        while(lb<=ub){
             mid=lb+ub/2; //this may exceed the range of int show error
             //mid=lb+(ub-lb)/2;
            if(arr[mid]==key)
            return mid;
            if(arr[mid]<key)
            ub=mid-1;
            else
            lb=mid+1;
        }
        return -1;
    }
}
