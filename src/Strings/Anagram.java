package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the String : ");
        String s1=sc.nextLine();
        System.out.println("Entre the String : ");
        String s2=sc.nextLine();
        s1=s1.replace(" ","");
        s2=s2.replace(" ","");
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        char[] c1=s1.toCharArray();
        char[] c2=s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int n= Arrays.compare(c1,c2);
       System.out.println(n);
      if(n==0){
           System.out.println(s1+" , "+s2+"  is Anagram");
       }
      else{
          System.out.println("Not Anagram");
      }
    }
}
