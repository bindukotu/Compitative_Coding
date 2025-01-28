package Strings;

import java.util.Scanner;

public class FirstNonRepeatChar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the String : ");
        String s=sc.nextLine();
        char fc=' ';
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
           // System.out.println(s.indexOf(i)+" "+s.lastIndexOf(i)+" "+s.charAt(i));
            if(s.indexOf(c)==s.lastIndexOf(c))
            {
                fc=s.charAt(i);
                index=0;
                break;
            }
            else {
                index++;
            }
        }
        if(index!=0)
        {
            System.out.println(" Give String is Empty or all charaters are reapted");
        }
        else {
            System.out.println("First Non-Repeating Charater :"+fc);
        }
    }
}
