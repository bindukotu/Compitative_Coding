package Seminar;

import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        int mul=1;
        int org=num;
        boolean flag=true;
        while(num>0){
            num=num/10;
            count++;
            mul*=10;
        }
        mul/=10;
        // System.out.println("count  :  "+count);
        //System.out.println("mul : "+mul);
        num=org;
        for(int i=0;i<count;i++){
            int rem=num%10;
            num=(rem*mul)+(num/10);
              System.out.println(num);
            flag=isPrime(num);
            System.out.println(flag);
            if(flag==false) {
                break;
            }
        }
        if(flag)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean isPrime(int num){
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
           // System.out.println(i);
            if (num % i == 0) return false;
        }
        return true;
    }
}
