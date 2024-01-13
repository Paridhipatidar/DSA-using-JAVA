import java.util.Scanner;
class factorial{
    public static void main(String args[]){
        int num;
        System.out.println("enter a no");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        for(int i=num;i>0;i--){
          System.out.print(i+"*");
        }
    }
}
    