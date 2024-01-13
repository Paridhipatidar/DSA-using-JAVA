import java.util.Scanner;
class largestnoin2no{
    public static void main(String args[]){
       System.out.println("enter two nums");
       int a,b;
       Scanner sc= new Scanner(System.in);
       a=sc.nextInt(); b=sc.nextInt();
       if(a>b)
       System.out.println(a+"is greater");
       else
       System.out.println(b+"is greater");
    }
}