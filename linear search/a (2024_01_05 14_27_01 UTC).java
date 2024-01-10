import java.util.Scanner;
public class a {
    public static void main(String args[]){
       int [] nums={23,25,34,67,89};
       int key=25;
       int ans=search(nums,key);
       System.out.println(ans);
    }
}
 int search(int[] arr,int key){
    for(int i=0;i<arr.length;i++){
        if (arr[i]==key)
        System.out.println("found at inder"+i);
        else 
        return -1;
    }
}