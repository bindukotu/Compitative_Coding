package Bindu1;

import java.util.Scanner;

public class StringtoInteger15 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the String : ");
        String s=sc.nextLine();
      /*  char c= s.charAt(0);
        int n=(int) c-48;
        System.out.println(n);*/
        int num=0;
        for(int i=0;i<s.length();i++)
        {
            num=num*10+((int)s.charAt(i)-48);
        }
        System.out.println(num);
    }
}
