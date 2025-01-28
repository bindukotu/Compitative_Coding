package leetcode;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        System.out.println(checkPerfectNumber(n));
    }
    public static boolean checkPerfectNumber(int num) {
             int sum=0;
             int n=num/2;
             for(int i=1;i<=n;i++){
                 if(num%i==0)
                 {
                     sum+=i;
                 }
             }
             if(num==sum)
                 return true;
             else
                 return false;
    }
}
