class orderagnostics{
    public static void main(String args[]){
       int []arr={4,3,2,0,-1};
       int target=2;
       System.out.println(orderagnosticbs(arr,target));
    }
    static int orderagnosticbs(int []arr,int key){
       int lb=0,ub=arr.length-1,mid;
       boolean isasc=arr[lb]<arr[ub];
        while(lb<=ub){
             mid=lb+(ub-lb)/2;
            if(arr[mid]==key)
            return mid;
            if(isasc){
               if(arr[mid]<key)
            lb=mid+1;
               else
            ub=mid-1;
            }
            else{
                if(arr[mid]>key)
            lb=mid+1;
                else
            ub=mid-1;
            }
        }
        return -1;
    }
}
