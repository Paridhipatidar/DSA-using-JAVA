import java.util.Scanner;
class simpleinterest{
    public static void main(String args[]){
        int p,r,t;
        System.out.println("enter principle,rate and time");
        Scanner sc= new Scanner(System.in);
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        int si=(p*r*t)/100;
        System.out.println("simple interest ="+si);
    }
}