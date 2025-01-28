package leetcode;

import java.util.Scanner;
import java.util.StringTokenizer;

public class MakeFancyString {
    public static void main(String[] args) {
        System.out.println("Entre String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(makeFancyString(s));
    }
    public static String makeFancyString(String s) {
         StringBuilder sb=new StringBuilder();
         for(char c:s.toCharArray()){
             int n=sb.length();
             System.out.println(n);
             if(n<2||c!=sb.charAt(n-1)||c!=sb.charAt(n-2))
                 sb.append(c);
         }
//        System.out.println(sb.length());
//         int count=0;
//         for(int i=0;i<sb.length()-1;i++)
//          {
//              if(sb.charAt(i)==sb.charAt(i+1))
//                  count++;
//              if(sb.charAt(i)==sb.charAt(i+1) && count>1) {
//                  sb.deleteCharAt(i+1);
//                  count=0;
//              }
//
//          }
//         if(sb.charAt(sb.length()-1)==sb.charAt(sb.length()-2))
//             sb.deleteCharAt(sb.length()-1);

           return sb.toString();
    }
}
