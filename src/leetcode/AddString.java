package leetcode;

import java.math.BigInteger;
import java.util.Scanner;

public class AddString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the String 1:");
        String s1=sc.nextLine();
        System.out.println("Entre the String 2:");
        String s2=sc.nextLine();
        System.out.println(addStrings(s1,s2));
    }
    public static String addStrings(String num1, String num2) {
        //ans : 18582873146362455
        //num1 :18582506933032752 num2 : 366213329703
       StringBuilder sb=new StringBuilder();
       int rem=0;
       int val;
       int i=num1.length()-1;
       int j=num2.length()-1;
       while (i>=0 && j>=0)
       {
           int n1=num1.charAt(i)-'0';
           int n2=num2.charAt(j)-'0';
           val=rem+n1+n2;
           sb.append(val%10);
           rem=val/10;
           j--;
           i--;
       }
        while (i>=0)
        {
            int n1=num1.charAt(i)-'0';
            val=rem+n1;
            sb.append(val%10);
            rem=val/10;
            i--;
        }
        while ( j>=0)
        {
            int n2=num2.charAt(j)-'0';
            val=rem+n2;
            sb.append(val%10);
            rem=val/10;
            j--;
        }
        if(rem>0)
           sb.append(rem);
       return sb.reverse().toString();
    }
}
