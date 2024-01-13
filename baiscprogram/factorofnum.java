import java.util.Scanner;
class factorofnum{
    public static void main(String args[]){
        int num;
        System.out.println("enter a no");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("Factors of "+num +" are: ");
        for(int i=1;i<=num;i++){
            if(num%i==0)
            System.out.print(i+",");
        }
    }
}