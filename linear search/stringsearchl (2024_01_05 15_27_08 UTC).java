
import java.util.Scanner;
class stringsearchl{
    public static void main(String args[]){
        String name="paridhi";
        char target='a';
        int ans=search(name,target);
        if(ans!=-1)
        System.out.println("char found at"+ans);
    }
   static int search(String str,char target){
        if(str.length()==0)
        return -1;
        for(int i=0;i<str.length();i++){
        if (target==str.charAt(i))
        return i;}
        return -1;
    }
}