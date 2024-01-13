import java.util.Scanner;
class fibonacciseries{
    public static void main(String args[]){
       System.out.println("enter a num");
       int n;
       Scanner sc= new Scanner(System.in);
       n=sc.nextInt(); //0 1 1 2 3 5
       int x=0,y=1,sum=0;
       for(int i=0;i<=n;i++){
        System.out.println(sum);
        x=y;
        y=sum;
        sum=x+y;
       }
    }
}