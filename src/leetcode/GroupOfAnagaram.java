package leetcode;

import java.util.*;

public class GroupOfAnagaram {
    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        GroupOfAnagaram ga=new GroupOfAnagaram();
        System.out.println(ga.groupAnagrams(str));
        //Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li1=new ArrayList<>();
        Map<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            System.out.println("ch : "+ch.toString());
            String s=String.valueOf(ch);
            System.out.println(s);
            List<String> li=new ArrayList();
            if(mp.containsKey(s)){
             li= mp.get(s);
                System.out.println("list : "+li);
                System.out.println("add : "+strs[i]);
             li.add(strs[i]);
            }
            else{
                li.add(strs[i]);
                mp.put(s,li);
            }
        }
        for (Map.Entry<String,List<String>> m:mp.entrySet()){
            li1.add(m.getValue());
        }
        return li1;
    }
}
