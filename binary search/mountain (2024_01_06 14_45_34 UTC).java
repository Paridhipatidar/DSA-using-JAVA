class mountain{
    public static void main(String args[]){
        int []arr={1,2,3,6,4,0};
        System.out.println(peakinmou(arr));
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
        return start;//or end can be return both point to same
    }
}