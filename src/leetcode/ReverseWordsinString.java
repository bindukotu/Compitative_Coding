package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ReverseWordsinString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
          ArrayList<String> al=new ArrayList<>();
        int i=0;
        int n=s.length();
        while(i<n)
        {
           while(i<n && s.charAt(i)==' ')
                  ++i;
               if(i<n)
               {
                   StringBuffer sb=new StringBuffer();
                   int j=i;
                   if(j<n && s.charAt(j)!=' ')
                   {
                     while(j<n && s.charAt(j)!=' ') {
                         sb = sb.append(s.charAt(j));
                         j++;
                     }
                   }
                   al.add(sb.toString());
                   i=j;
               }
        }
        Collections.reverse(al);
        System.out.print(String.join(" ",al));
        System.out.print("\"");
    }
}
