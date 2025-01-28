package leetcode;

import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre String1");
        String s=sc.next();
        System.out.println("Entre String2");
        String s2=sc.next();
        System.out.println(rotateString(s,s2));
    }
    public static boolean rotateString(String s, String goal) {
          String str=s+s;
        if(s.length()!=goal.length())
            return false;
          boolean flg=str.contentEquals(goal);
          return flg;
    }
}
