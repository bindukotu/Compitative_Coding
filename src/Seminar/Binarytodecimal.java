package Seminar;

import java.util.Scanner;

public class Binarytodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int mul=1,size=s.length()-1;
        int sum=0;
        for(int i=0;i<=size;i++)
        {
            int k=s.charAt(size-i)-'0';
            sum+=k*mul;
            mul=mul*2;
        }
        System.out.println(sum);
    }
}
