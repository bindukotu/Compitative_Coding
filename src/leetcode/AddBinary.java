package leetcode;

import java.util.Scanner;
//completed
public class AddBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the S1");
        String s1=sc.nextLine();
        System.out.println("Entre the S2");
        String s2=sc.nextLine();
         System.out.println(addBinary(s1,s2));

    }

    public static String addBinary(String a, String b){
        String s="";
        int c=0;

        StringBuffer sb=new StringBuffer();
          int i=a.length()-1;
          int j=b.length()-1;
          while (i>=0 || j>=0 || c==1)
          {
              int sum=0;
              if(i>=0)
              {
                  sum+=a.charAt(i)-'0';
                  System.out.println("i sum : "+sum);
                  i--;
              }
              if(j>=0)
              {
                  sum +=b.charAt(j)-'0';
                  System.out.println("j sum : "+sum);
                  j--;
              }
              sum+=c;
              System.out.println("sum :"+sum+"  mod "+sum%10);
              sb.append(sum%2);
              c=sum/2;
          }
          s=sb.reverse().toString();
        return s;
    }
    }

