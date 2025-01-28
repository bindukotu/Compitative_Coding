package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the String : ");
        String s=sc.nextLine();
        char[] ch=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev=rev+ch[i];
        }
            System.out.println(s+ "    reverse :  "+rev);

    }
}
