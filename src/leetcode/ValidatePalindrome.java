package leetcode;

import java.util.Scanner;

public class ValidatePalindrome {//completed
    public static boolean isPalindrome(String s) {
        String s1="";
        boolean bl=false;
        char[] ch=s.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<ch.length;i++) {
            if (Character.isLetterOrDigit(ch[i]))
                   sb.append(ch[i]);
        }
        s=sb.toString();
        s1=sb.reverse().toString();
        System.out.println(s);
        System.out.println(s1);
          if(s1.equalsIgnoreCase(s))
              bl=true;
        return bl;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("IsPalindrome");
        }
        else{
            System.out.println("not");
        }

    }
}
