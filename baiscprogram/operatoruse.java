//4.Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
class operatoruse{
    public static void main(String args[]){
        System.out.println("enter two nums");
        Scanner sc= new Scanner(System.in);
        int a,b;
        a=sc.nextInt(); b=sc.nextInt();
         System.out.println("1.Enter a for add,2.m for multiply,3.d for divide,4.s for subtraction");
        char c=sc.next().charAt(0);
        //System.out.println(p(a,b,c));
    }
    static int p(int a,int b,int c){
        if(c=='a')
        return a+b;
        if(c=='m')
        return a*b;
        if(c=='s')
        return a-b;
        if(c=='d')
        return a/b;
        else
        return -1;
    }
}