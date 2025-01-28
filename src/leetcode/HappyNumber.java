package leetcode;

import java.util.Scanner;

public class HappyNumber {//completed
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
          while(n!=1 && n!=4)
          {
              n=happy(n);
          }
          if(n==1)
              System.out.println("Happy");
          else if (n==4)
              System.out.println("not");
          }
          public static int happy(int n)
          {
              int y=0;
              while(n>0)
              {
                  y+=(n%10)*(n%10);
                  n=n/10;
              }
              return y;
          }

}
