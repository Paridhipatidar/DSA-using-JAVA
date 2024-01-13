
class perfectnum{
    public static void main(String args[]){
        long n=28 ,sum=0;
        int i=1;
        while(i<=n/2){
            if(n%i==0)
            sum=sum+i;
            i++;
        }
        if(sum==n)
        System.out.println(n+"perfect num");
        else
        System.out.println(n+"not perfect num");
    }
}