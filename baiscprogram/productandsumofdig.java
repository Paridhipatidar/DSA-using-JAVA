import java.util.Scanner;
class productandsumofdig{
       public static void main(String args[]){
        int p;
        System.out.println("enter a no");
        Scanner sc= new Scanner(System.in);
        p=sc.nextInt();
        int ans=product(p)-addition(p);
        System.out.println(ans);
    }
    static int product(int num){
        int pro=1;
        while(num>0){
        pro=pro*(num%10);
        num=num/10;
    }
    return pro; 
   }
   static int addition(int num){
        int sum=0;
        while(num>0){
        sum=sum+(num%10);
        num=num/10;
    }
    return sum; 
   }
}