import java.util.Scanner;
class electricitybill_cal{
    public static void main(String args[]){
        int unit;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter units of electricity");
        unit=sc.nextInt();
        int ans=cal(unit);
        System.out.println("your electricity bill is:"+ans);
    }
    static int cal(int unit){
        if(unit<=100)
        return unit*10;
        else if(unit<=200)
        return 1000+((unit-100)*15);
        else if(unit<=300)
        return 2500+((unit-200)*20);
        else if(unit>300)
        return 4500+((unit-300)*25);
        else
        return -1;
    }
}