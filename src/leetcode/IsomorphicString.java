package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String t=sc.nextLine();
        IsomorphicString iso=new IsomorphicString();
        System.out.println(iso.isIsomorphic(s,t));
    }
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> hm=new HashMap<>();
        HashMap<Character,Character> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++) {
            Character c1 = s.charAt(i);
            Character ct = t.charAt(i);
            if(hm.containsKey(c1) && hm.get(c1)!=ct)
                return false;
             if(hm1.containsKey(ct) && hm1.get(ct)!=c1)
                return false;
             hm.put(c1,ct);
             hm1.put(ct,c1);
        }
        return true;
    }
}
