import java.util.Scanner;
class largenumfrominput{
     public static void main(String args[]){
        int num=1, sum=0,temp=1;
        Scanner sc= new Scanner(System.in); 
        while(num!=0){
        int n=num;
        System.out.println("enter a no");
        num=sc.nextInt();
          if(num>n){
            temp=num;
        }
    }
         System.out.println("largest no:"+temp);
    }
}