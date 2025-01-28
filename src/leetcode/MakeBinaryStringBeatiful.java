package leetcode;

import java.util.Scanner;

public class MakeBinaryStringBeatiful {//incomplete
    public static void main(String[] args) {
        System.out.println("Entre the String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(minChanges(s));
    }
    public static int minChanges(String s) {
        int count=0;
        for(int i=1;i<s.length();i+=2){
            if(s.charAt(i)!=s.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}
