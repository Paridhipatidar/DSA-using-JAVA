import java.util.Scanner;
class commissionper_cal{
	public static void main(String arg[])	
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter amount:");
	double amount=sc.nextDouble();
    System.out.print("Commission amount:");
    double commission=sc.nextDouble();
    double commissionPercentage=(commission/amount)*100;  
    System.out.println("commissionPercentage:"+commissionPercentage);
	}
}