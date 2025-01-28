package leetcode;

import java.util.Scanner;

public class GrearestCommanDivisorbyString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre str1");
        String str1=sc.nextLine();
        System.out.println("Entre str2");
        String str2=sc.nextLine();
        System.out.println(gcdOfStrings(str1,str2));
    }
    public static String gcdOfStrings(String str1, String str2) {
         String s="";
         if((str1+str2).equals(str2+str1)){
             int len1=str1.length();
             int len2=str2.length();
             s=str1.substring(0,gcd(len1,len2));
         }
         return s;
    }
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        else
            return gcd(b,a%b);
    }
}
