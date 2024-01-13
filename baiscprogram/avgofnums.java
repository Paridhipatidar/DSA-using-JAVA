import java.util.Scanner;
class avgofnums{
    public static void main(String args[]){
        int num,sum=0;
        System.out.println("enter num of inputs");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        System.out.println("enter nums");
        for(int i=0;i<num;i++){
            int n=sc.nextInt();
             sum=sum+n;
        }
        int avg=sum/num;
        System.out.println("average of nums: "+avg);
    }
}