import java.util.Scanner;
class Takeinputtill0{
     public static void main(String args[]){
        int num=1, sum=0;
        Scanner sc= new Scanner(System.in); 
        while(num!=0){
        System.out.println("enter a no");
        num=sc.nextInt();
        sum=sum+num;
        }
         System.out.println("sum="+sum);
    }
}