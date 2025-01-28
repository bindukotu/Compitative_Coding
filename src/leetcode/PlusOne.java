package leetcode;

import java.util.Scanner;

public class PlusOne {//completed
    public static int[] plusOne(int[] digits) {
        int sum=1;
        StringBuffer s=new StringBuffer();
      if(digits==null)
          return digits;
        for(int i=digits.length-1;i>=0;i--)
        {
            System.out.println("before"+digits[i]);
            int k=digits[i]+sum;
            digits[i]=(k)%10;
            sum=k/10;
            System.out.println("After"+digits[i]);
            s.append(digits[i]);
        }
        System.out.println("sum"+sum);
        if(sum!=0) {
            digits[0] = digits[0] + sum;
            System.out.println(digits[0]);
            s.append(digits[0]);
        }
        System.out.println(s);
        int[] k=new int[s.length()];
        for (int i=s.length()-1,j=0;i>=0;i--,j++){
            k[j]=s.charAt(i)-'0';
            System.out.print(k[j]);
        }
        return k;
    }
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         int[] n={9};

         System.out.println("Values");
         int[] k=plusOne(n);
         for(int i=0;i<k.length;i++){
             System.out.print(k[i]);
         }
     }
}
