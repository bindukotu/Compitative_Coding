package Bindu1;

import java.util.Scanner;

public class CountingBits {
    public static void main(String[] args) {
        System.out.println("Entre the no :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=countBits(n);
        for(int i:a) {
            System.out.print(i+" ");
        }
    }
    public static int[] countBits(int n) {
       int[] a=new int[n+1];
       for(int i=0;i<=n;i++){
           a[i]=Integer.bitCount(i);
       }
       return a;
    }
}
