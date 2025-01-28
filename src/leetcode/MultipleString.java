package leetcode;

import java.util.Scanner;

public class MultipleString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1=sc.nextLine();
        System.out.println("Enter String 2:");
        String s2=sc.nextLine();
        System.out.println("Multiple :"+multiply(s1,s2));
    }
    public static String multiply(String num1, String num2) {
        int[] n=new int[num1.length()+num2.length()];
        StringBuilder sb=new StringBuilder();
        for(int i=num2.length()-1;i>=0;i--)
        {
            for(int j=num1.length()-1;j>=0;j--)
            {
               int p1=i+j,p2=i+j+1;
               int m=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                 int sum=n[p2]+m;
                 n[p2]=sum%10;
                 n[p1]+=sum/10;
            }
        }
        for(int i:n)
            sb.append(i);
        System.out.println(sb.toString());
        return sb.reverse().toString();
//123456789  987654321
        //ans; 121932631112635269
    }
}
