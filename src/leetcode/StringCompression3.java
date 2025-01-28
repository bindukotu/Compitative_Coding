package leetcode;

import java.util.Scanner;

public class StringCompression3 {
    public static void main(String[] args) {
        System.out.println("Entre String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(compressedString(s));
    }
    public static String compressedString(String word) {
          String str="";
          int count=0;
          char c=word.charAt(0);
        int rem;
          for(int i=0;i<word.length();i++)
          {
              if(c==word.charAt(i)){
                  count++;
              }
              else{
                       rem=count/9;

                      while(rem>0) {
                          str = str + '9' + c;
                          rem--;
                      }
                      if(count%9>0)
                      {
                          int d=count%9;
                          str=str+d+c;
                      }
                    c=word.charAt(i);
                  count=1;
              }


          }
          rem=count/9;
        System.out.println(count);
        System.out.println(rem);
          while(rem>0) {
              str = str + '9' + c;
              rem--;
          }
          if(count%9>0){
              rem=count%9;
              str=str+rem+c;
          }
          return str;
    }
}
