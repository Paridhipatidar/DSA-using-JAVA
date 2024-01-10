class maxwealth{
    public static void main(String args[]){
        int arr[][]={{1,2},{3,2},{4,7}};
        int ans=maximumwealth(arr);
        System.out.println(ans);
    }
    static int maximumwealth(int [][]arr){
        int max=0;
        for(int r=0;r<arr.length;r++){
            int rowsum=0;
            for(int c=0;c<arr[r].length;c++)
                 rowsum=rowsum+arr[r][c];
        if(rowsum>max)
             max=rowsum;
        }
        return max;
    }
}