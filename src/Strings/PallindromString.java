package Strings;

import java.util.Scanner;

public class PallindromString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the String : ");
        String s=sc.nextLine();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(rev))
        {
            System.out.println(s+" is palindrom ");
        }
        else{
            System.out.println(s+" not palindrom");
        }
    }
}
