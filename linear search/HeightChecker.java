class HeightChecker {
    public int heightChecker(int[] heights) {
        int[] arr=new int[heights.length];
    for(int i=0;i<heights.length;i++){
        arr[i]=heights[i];
    }
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<heights.length;i++){
         if(arr[i]!=heights[i])
            count++;
        }
        return count;
    }
}
