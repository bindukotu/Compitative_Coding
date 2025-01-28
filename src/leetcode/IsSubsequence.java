package leetcode;

import java.util.Scanner;

public class IsSubsequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the subString :");
        String s=sc.nextLine();
        System.out.println("Entre the String :");
        String t=sc.nextLine();
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
       int i=0 , j=0;
       int m=s.length();
       int n=t.length();
       while(i<m && j<n){
           if(s.charAt(i)==t.charAt(j)){
               i++;
           }
           j++;
       }
       return i==m;
    }
}
