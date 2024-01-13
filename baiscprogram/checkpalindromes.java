import java.util.Scanner;
class checkpalindromes{
    public static void main(String args[]){
        System.out.println("enter a string to check");
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        int i=0,j=str.length()-1,flag=0;
        while(i<j&&flag==0){
            if(str.charAt(i)!=str.charAt(j)){
            flag=1;
            } 
            i=i+1;
            j=j-1;
        }
        if(flag==0)
        System.out.println("is palindrome");
        else
        System.out.println("not palindrome");
    }
}