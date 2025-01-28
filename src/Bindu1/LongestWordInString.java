package Bindu1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LongestWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the String : ");
        String s = sc.nextLine();
      //  String d=" ";
       /* StringTokenizer st=new StringTokenizer(s,d);
        String s1=" ";
        int l=0;
        while(st.hasMoreTokens())
        {
            String s3=st.nextToken();
            if(s1.length()<=s3.length())
            {
                s1=s3;
                l=s3.length();
            }
        }
        System.out.println(s1+"  "+l);*/
        String[] st=s.split(" ");
        String s1=" ";
        int l=0;
        for(int i=0;i<st.length;i++){
              if(s1.length()<=st[i].length())
              {
                  l=st[i].length();
              }
        }
        System.out.println(l);
     }
    }
