import java.util.Scanner;
class greetings{
    public static void main(String args[]){
    System.out.println("enter your name");
    Scanner s= new Scanner(System.in);
    String str= s.nextLine();
    System.out.println("Hello Dear!"+str);
    }
}