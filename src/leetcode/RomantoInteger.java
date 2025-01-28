package leetcode;

import java.util.Scanner;
/*Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/

public class RomantoInteger {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the value");
        String s=sc.nextLine();
        int sum=0;
        for(int i=0;i<s.length()-1;i++) {
            if (roman(s.charAt(i)) < roman(s.charAt(i + 1)))
                sum = sum - roman(s.charAt(i));
            else
                sum += roman(s.charAt(i));
        }
        sum+=roman(s.charAt(s.length()-1));
        System.out.println("No "+sum);
    }
    public static int roman(char c)
    {
        int no=0;
        if(c=='M')
            no= 1000;
        else if(c=='D')
            no= 500;
        else if(c=='C')
            no= 100;
        else if(c=='L')
            no= 50;
        else if(c=='X')
            no= 10;
        else if(c=='V')
            no= 5;
        else if(c=='I')
            no= 1;
        else
            no= 0;
        return no;
    }
}
