package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class WordPatteren {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        WordPatteren wp=new WordPatteren();
        System.out.println(wp.wordPattern(s,t));
    }
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> hm=new HashMap<>();
        HashMap<String,Character> hm1=new HashMap<>();
        String[] s1=s.split(" ");
        for(int i=0;i<pattern.length();i++){
             Character c=pattern.charAt(i);
             if(hm.containsKey(c) && !hm.get(c).equals(s1[i]))
                    return false;
            if(hm1.containsKey(s1[i]) && hm1.get(s1[i])!=c)
                    return false;
            hm.put(c,s1[i]);
            hm1.put(s1[i],c);
        }
        return true;
    }
}
