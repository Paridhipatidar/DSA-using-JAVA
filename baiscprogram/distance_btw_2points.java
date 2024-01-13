import java.util.Scanner;
import java.lang.Math;
class distance_btw_2points{
    public static void main(String args[]){ 
        double d,dis,x1,y1,x2,y2;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the coordinates of point1");
      x1=sc.nextDouble();
      y1=sc.nextDouble();
       System.out.println("enter the coordinates of point2");
       x2=sc.nextDouble();
       y2=sc.nextDouble();
       double ans= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
       System.out.println(ans);
    }
}