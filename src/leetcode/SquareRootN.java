package leetcode;

import java.util.Scanner;

public class SquareRootN {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(mySqrt(num));
    }
    public static int mySqrt(int x) {
          if(x<=1)
              return x;
          long i=1l;
          for(;i*i<=x;i++);
          return (int)i-1;
    }
}
