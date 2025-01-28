package Bindu1;

import java.net.StandardSocketOptions;
import java.util.Scanner;

//caluclate the ncr formula n!/(r!*(n-r)!)
public class NCRDrive {
    public static void main(String[] args)
    {
        NCRPrg nc=new NCRPrg();
        System.out.println("Enter the no n value must >0 :");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Enter the no R value must < :"+n);
        int r=sc.nextInt();
        double d=nc.ncr1(n)/(nc.ncr1(r)*nc.ncr1(n-r));
        System.out.println(d);
    }
}
