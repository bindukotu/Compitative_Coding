package Bindu1;

import java.util.Scanner;

public class NthTribonacci {
    public static void main(String[] args) {
        System.out.println("Entre the no :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(tribonacci(n));
    }
    public static int tribonacci(int n) {
       int t1=1,t0=0;
       int t2=1,t3=0;
       if(n==0)
           return 0;
       if (n==1 || n==2)
           return 1;
       for(int i=3;i<=n;i++){
           t3=t1+t2+t0;
           t0=t1;
           t1=t2;
           t2=t3;
       }
       return t3;
    }
}
