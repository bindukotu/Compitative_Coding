package leetcode;

import java.util.Scanner;

/*
Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1
Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16
Example 3:

Input: n = 3
Output: false

* */
public class Powof2 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the no");
          int n=sc.nextInt();
         int i=0;
         boolean bl=true;
         while (bl){
             if(n%2==0 && n%3!=0)
             {
                 i++;
                 n=n/2;
                 System.out.println("True");
             }
             else  if(n==1) {
                 System.out.println("True");
                 break;
             }
             else {
                 System.out.println("False");
                 bl = false;
             }
            System.out.println(i);
         }

    }

}
