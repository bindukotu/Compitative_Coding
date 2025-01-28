package Bindu1;

import java.util.Scanner;

public class AmstrongNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        isAmstrong(n);
    }

    public static void isAmstrong(int n) {
        int org=n;
        int count=0,temp=0;
        while(n>0)
        {
            count++;
            n=n/10;
        }
        n=org;
        while(n>0)
        {
            int re=n%10;
            temp=(int)(temp+Math.pow(re,count));
            n=n/10;
        }
        if(temp==org)
            System.out.println("Amstrong");
        else
            System.out.println("not");

    }
}
