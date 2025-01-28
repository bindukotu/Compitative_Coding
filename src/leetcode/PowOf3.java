package leetcode;

import java.util.Scanner;

public class PowOf3 {
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                int i=0;
        boolean bl=true;
       /* while (bl){
            if(n%3==0 && n%2!=0 && n>0)
            {
                i++;
                n=n/3;
                System.out.println("True");
            }
            else  if(n==1) {
                System.out.println("True");
                break;
            }
            else {
                   System.out.println("False");
                    bl = false;
                   i=-1;
            }

        }
        System.out.println(i);*/
        if(n%3==0 && n%2!=0 && n>0)
            bl=true;
        else if(n==1)
            bl=true;
        else
            bl=false;
        System.out.println(bl);
    }
}
