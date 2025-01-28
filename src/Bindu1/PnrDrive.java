package Bindu1;

import java.util.Scanner;

public class PnrDrive {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N value must >0");
        int n=sc.nextInt();
        System.out.println("Enter the R value must >"+n);
        int r=sc.nextInt();
        PnrMethod pnr=new PnrMethod();
       // System.out.println(pnr.pnrCal(n));
        double d=pnr.pnrCal(n)/ pnr.pnrCal(n-r);
        System.out.println("npr value is : "+d);
    }
}

