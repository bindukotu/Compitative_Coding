package leetcode;

import java.util.Scanner;

public class MergeStringAlternately {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre String1");
        String s1=sc.nextLine();
        System.out.println("Entre String2");
        String s2=sc.nextLine();
        System.out.println(mergeAlternately(s1,s2));
    }
    public static String mergeAlternately(String word1, String word2) {
           StringBuilder sb=new StringBuilder();
           int n1=word1.length();
           int n2=word2.length();
           String s="";
           for(int i=0;i<n1 && i<n2 ;i++){
               sb.append(word1.charAt(i));
               sb.append(word2.charAt(i));
           }
           if(n1>n2)
           {
                s=word1.substring(n2);
                sb.append(s);
           }
           if(n1<n2){
               s=word2.substring(n1);
               sb.append(s);
           }
           return sb.toString();
    }
}
