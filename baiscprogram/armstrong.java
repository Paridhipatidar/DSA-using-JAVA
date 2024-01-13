class armstrong{
    public static void main(String args[]){
    int num=153,sum=0,x=num;
    while(num>0){
        int n=num%10;
        sum=sum+(n*n*n);
        num=num/10;
    }
    if(sum==x)
    System.out.println("armstrong");
    else 
    System.out.println("not armstrong");
    }
}