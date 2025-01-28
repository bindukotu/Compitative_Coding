package leetcode;

import java.util.Scanner;

public class Numberof1Bit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre no :");
        int n=sc.nextInt();
        System.out.println(hammingWeight(n));
    }
    public static int hammingWeight(int n) {
         int count =0;
         while(n>0)
         {
             if(n%2==1)
                 count++;
             n=n/2;
         }
         return count;
    }
}
