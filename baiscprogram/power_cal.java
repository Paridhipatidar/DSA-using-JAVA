
class power_cal{
/*public static void main(String[] args) {
double base = 2;
double exponent = 3;
double result = Math.pow(base, exponent);
System.out.println(base + "^" + exponent + " is " + result);
}*/
 static int power(int Num, int Power)
    {
        if (Power== 0)
            return 1;
        else
            return Num * power(Num,Power-1);
    }
    public static void main(String[] args)
    {
        int Num = 2;
        int Power = 3;
        int result=power(Num,Power);
        System.out.println(Num+ "^"+Power+" is "+result);
    }
    /* static int power(int N, int P)
    {
        int pow = 1;
        for (int i = 1; i <= P; i++)
            pow *= N;
        return pow;
    }*/
}