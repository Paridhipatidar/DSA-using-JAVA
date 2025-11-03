class ReverseANum{
        public static void main(String args[]){
    //  System.out.println(rev1(87654325));
     rev2(12345678);
     System.out.println(sum);
    }
  static String rev1(int n){
    if(n==0)
    return "";
    String c=Integer.toString(n%10);
    return c+ rev1(n/10);
  } 
  static int sum=0;
  static void rev2(int num){
    if(num==0) return;
     int rem=num%10;
     sum=sum*10+rem;
     rev2(num/10);
  }
  static int rev3(int num){
    int digits=(int)(Math.log10(num))+1;
    return helper(num,digits);
  }
  static int helper(int num,int digits){
    if(num%10==num){
        return num;
    }
    int rem=num%10;
    return rem*(int)(Math.pow(10,digits-1))+helper(num/10,digits-1);
  }
}
