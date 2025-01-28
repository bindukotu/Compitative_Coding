package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveStarsFormString {
    public static void main(String[] args) {
        System.out.println("enter the String :");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(removeStars(s));
    }
    public static String removeStars(String s) {
     StringBuilder sb=new StringBuilder();
     for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='*'){
            sb.deleteCharAt(sb.length()-1);
        }
        else {
            sb.append(s.charAt(i));
        }
     }
     return sb.toString();
    }
}
