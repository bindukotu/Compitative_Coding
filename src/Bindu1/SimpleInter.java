package Bindu1;

import java.util.Scanner;

public class SimpleInter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();
        double r1=1+((r*1.0)/100);
        System.out.println("SI:"+(p*t*r)/100);
        System.out.println("C.I: "+(p*Math.pow(r1,t)));
    }
}
