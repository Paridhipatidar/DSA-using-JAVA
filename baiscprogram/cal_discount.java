import java.util.Scanner;
class cal_discount{
    public static void main(String args[]){
        double dis,amount,marketprice,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter market price and discount percent ");
        marketprice=sc.nextDouble();
        dis=sc.nextDouble();
        s=(dis*marketprice)/100;
        amount=marketprice-s;
         System.out.println("amount after discount"+amount);
    }
}

