package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {//completed
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the s1");
        String s1=sc.nextLine();
        System.out.println("Entre the s2");
        String s2=sc.nextLine();
        System.out.println(isAnagram(s1,s2));
    }
    public static boolean isAnagram(String s, String t){
        boolean bl=false;
           s=s.replace(" ","");
           t=t.replace(" ","");
           s=s.toLowerCase();
           t=t.toLowerCase();
           char[] s1=s.toCharArray();
           char[] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        int i=Arrays.compare(s1,t1);
        if(i==0)
            bl=true;
        return bl;
    }
}
