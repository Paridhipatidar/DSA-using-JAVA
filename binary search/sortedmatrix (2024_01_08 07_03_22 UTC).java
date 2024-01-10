import java.util.Arrays;
class sortedmatrix{
    public static void main(String args[]){
          int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
           System.out.println(Arrays.toString(search(arr,9)));  
    }
    static int []bsreach(int[][]matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target)
            return new int[]{row,mid};
            if(matrix[row][mid]<target)
            cstart=mid+1;
            else
            cend=mid-1;
        }
        return new int[]{-1,-1};
    }
    static int[] search(int [][]matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;
        if(row==1)
        return bsreach(matrix,0,0,target);
        int rstart=0,rend=row-1,cmid=col/2;
        while(rstart<rend-1){
            int mid=rstart+(rend-rstart)/2;
            if(matrix[mid][cmid]==target)
            return new int []{mid,cmid};
            if (matrix[mid][cmid]<target)
            rstart=mid;
            else
            rend=mid;
        }
        if(matrix[rstart][cmid]==target)
        return new int[]{rstart,cmid};

        if(matrix[rstart+1][cmid]==target)
        return new int[]{rstart+1,cmid};


        if(target<=matrix[rstart][cmid-1])
        return bsearch(matrix,rstart,0,cimd-1,target);

        if(target>=matrix[rstart][cmid+1]&&target<=matrix[rstart][col-1])
        return bsearch(matrix,rstart,cimd+1,col-1,target);

        if(target<=matrix[rstart+1][cmid-1])
        return bsearch(matrix,rstart+1,0,cimd-1,target);

        else
        return bsearch(matrix,rstart+1,cmid+1,col-1,target);
    }

}