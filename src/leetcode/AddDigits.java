package leetcode;

import java.util.Scanner;

public class AddDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("entre the number : ");
        int num=sc.nextInt();
        System.out.println(addDigits(num));
    }
    public static int addDigits(int num) {
        int sum=0;
        while(num>9){
              while(num>0)
              {
                  sum+=num%10;
                  num=num/10;
              }
              num=sum;
              sum=0;
        }
        return num;
    }
}
