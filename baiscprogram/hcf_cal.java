
class hcf_cal{
    public static void main(String args[]){
       int num1=84,num2=48,hcf=1;
       for(int i=1;i<=num1||i<=num2;i++){
        if(num1%i==0&&num2%i==0)
        hcf=i;
       }
       System.out.println("hcf="+hcf);
    }
}