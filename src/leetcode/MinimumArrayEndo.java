package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class MinimumArrayEndo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the n value :");
        int n=sc.nextInt();
        System.out.println("Enter the x value : ");
        int x=sc.nextInt();
        System.out.println(minEnd(n,x));

    }
        public static long minEnd(int n, int x) {
            ArrayList<Long> al=new ArrayList<Long>();
            long x1=(long)x;
            al.add(x1);
            long val=x;
            for(int i=0;i<n-1;i++){
                val+=1;
                while ((x1&val)!=x1){
                    val++;
                }
               al.add(val);
            }
            System.out.println(al);
            return al.get(n-1);
        }

}
