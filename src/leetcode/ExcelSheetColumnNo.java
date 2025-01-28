package leetcode;

import java.util.Scanner;

public class ExcelSheetColumnNo {//completed
    public static void main(String[] args) {
        System.out.println("Entre the Excel column no :");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Value :"+titleToNumber(s));
    }
    public static int titleToNumber(String columnTitle) {
       int n=0;
        int size=columnTitle.length()-1;
        for(int i=size;i>=0;i--) {
            int a=columnTitle.charAt(i)-'A'+1;
            System.out.println("a: "+a);
            n += (Math.pow(26,size-i))*a;
        }
       return n;
    }
    //0
}
