package leetcode;

import java.util.Scanner;
import java.util.StringTokenizer;

public class CircularSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(isCircularSentence(s));
    }
    public static boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1))
              return false;
        String[] s=sentence.split(" ");
        for (int i=0;i<=s.length-2;i++){
            if(s[i].charAt(s[i].length()-1)!=s[i+1].charAt(0))
                return false;
        }
         return true;
    }
}
