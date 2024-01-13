
class depreciation_cal{
    public static void main(String args[]){
        double v1=200,r=10,t=2;
        System.out.println(depreciation(v1,r,t));
    }
    static double depreciation(double v1,double r,double t)
    {
        double v2=(v1 * Math.pow((1-r/100),t));
        return v2;
    }
}