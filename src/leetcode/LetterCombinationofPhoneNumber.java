package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombinationofPhoneNumber {
    public static void main(String[] args) {
        System.out.println("Entre the String :");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(letterCombinations(s));
    }
    public static List<String> letterCombinations(String digits) {
           String[] s1={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
           int len=digits.length();
            ArrayList<String> al=new ArrayList<>();
            if(digits.equals("")) {
                al.add("");
                return al;
            }

                int len1=s1[digits.charAt(0)-'0'].length();
                String s=s1[digits.charAt(0)-'0'];
                for(int i=0;i<len1;i++)
                {
                    al.add(String.valueOf(s.charAt(i)));
                }
           if(len==1)
             {
                return al;
              }
            for(int i=1;i<len;i++){
                al=addList1(al,s1[digits.charAt(i)-'0']);
            }
            return al;

    }
    public static ArrayList<String> addList1(ArrayList<String> a1,String s2){
           ArrayList<String> a3=new ArrayList<>();
           for(int i=0;i<a1.size();i++){
               for (int j=0;j<s2.length();j++){
                   a3.add(a1.get(i)+s2.charAt(j));
               }
           }
           return a3;
    }
}
