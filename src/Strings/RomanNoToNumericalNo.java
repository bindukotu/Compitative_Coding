package Strings;
//Roman no To Numerical no
import java.util.Scanner;

public class RomanNoToNumericalNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the Roman No : ");
        String s = sc.nextLine();
        s=s.toUpperCase();
        char[] ch=s.toCharArray();
        int[] num=new int[ch.length];
        int value=0;
        for(int i=0;i<ch.length;i++)
        {
            switch(ch[i])
            {
                case 'I':num[i]=1;
                          break;
                case 'V':num[i]=5;
                    break;
                case 'X':num[i]=10;
                    break;
                case 'L':num[i]=50;
                    break;
                case 'C':num[i]=100;
                    break;
                case 'D':num[i]=500;
                    break;
                case 'M':num[i]=1000;
                    break;

            }
        }
        if(num.length==0)
        {
            System.out.println("Value is : "+num[0]);
        }
        for(int i=0;i<num.length;i++){
            if(i<num.length-1) {
                if (num[i] < num[i + 1]) {
                    value = value - num[i];
                } else {
                    value = value + num[i];
                }
            }
            else{
                value=value+num[i];
            }

        }
        System.out.println("value is :"+value);

     }//main

    }//class
