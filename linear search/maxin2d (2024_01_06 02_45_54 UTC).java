
class maxin2d{
    public static void main(String[] args){
      int [][]arr={{1,2,3},{4,5,6,7},{8,9,10,11,15}};
      int ans =max(arr);
      System.out.println(ans);
    }
    static int max(int arr[][]){
        int ans=arr[0][0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
           if(arr[i][j]>ans)
           ans=arr[i][j];
            }
        }
        return ans;
    }
}
