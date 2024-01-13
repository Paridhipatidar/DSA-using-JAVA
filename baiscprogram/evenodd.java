import java.util.Scanner;
class evenodd{
    public static void main(String args[]){
        int n;
        System.out.println("enter a no to check");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        boolean ans=(checkeo(n));
        if(ans==true) 
        System.out.println("given num is even");
        else
        System.out.println("given num is not even");
    }
    static boolean checkeo(int num){
        if(num%2==0)
        return true;
        else
        return false;
    }
}