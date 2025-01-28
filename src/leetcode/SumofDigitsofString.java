package leetcode;

import java.util.Scanner;

//sum of digits of String after Convertion
public class SumofDigitsofString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the String");
        String s=sc.nextLine();
        System.out.println("Entre the value");
        int k=sc.nextInt();
        System.out.println(getLucky(s,k));
    }
    public static int getLucky(String s, int k){
        int val=0,a=s.length();
        //Covert the String to number and add numbers at one time
        for(int i=0;i<a;i++){
            int ch=(s.charAt(i)-'0')-48;
            if(ch>9 && ch<20){
                val=val+1+ch%10;
            }
            else if(ch>=20 && ch<27){
                val=val+2+ch%10;
            }
            else{
                val=val+ch;
            }
        }
         for(int i=2;i<=k;i++)
         {
             int n=0;
             while(val>0){
                 n=n+val%10;
                 val=val/10;
             }
             val=n;
         }
        return val;
    }
}
