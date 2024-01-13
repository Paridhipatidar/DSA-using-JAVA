import java.util.Scanner;
class rs_to_usd{
     public static void main(String args[]){
        System.out.println("enter currency in rs");
        Scanner sc= new Scanner(System.in);
        float rs=sc.nextInt(); 
        double usd= rs/83.12;
        System.out.println("rs in usd="+usd);
     }
}