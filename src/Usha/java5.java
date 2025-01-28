package Usha;

import java.util.Scanner;

public class java5 {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i;
        for(i=1;i<n;i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("\"FizzBuzz\", ");
            else if (i % 3 == 0)
                System.out.print("\"Fizz\", ");
            else if (i % 5 == 0)
                System.out.print("\"Buzz\", ");
            else
                System.out.print("\"" + i + "\", ");
        }
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print("\"FizzBuzz\" ");
            else if (i % 3 == 0)
                System.out.print("\"Fizz\" ");
            else if (i % 5 == 0)
                System.out.print("\"Buzz\" ");
            else
                System.out.print("\"" + i + "\" ");

    }

}

