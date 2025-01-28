package Bindu1;

import java.util.Scanner;

public class Fibanoci {
    public static void main(String[] args)
    {
        //code vita
        //codechef
        int a=0;
        int b=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of series");
        int n=sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0;i<n-2;i++)
        {
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
