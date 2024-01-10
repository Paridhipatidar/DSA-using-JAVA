class evendigit{
    public static void main(String args[]){
        int []nums={12,233,14,234,55,66};
        System.out.println(findnum(nums));
    }
    static int findnum(int[]nums){
        int count=0;
        for(int num:nums){
            if(even(num))
            count ++;
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigit=digits(num);
        /*if(numberofdigit%2==0){
            return true;
        }
        return false;*/
        return numberofdigit % 2 == 0;
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0)
        return 1;
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}