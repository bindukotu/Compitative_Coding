package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the number : ");
        int num=sc.nextInt();
        System.out.println(fizzBuzz(num));
    }
    public static List<String> fizzBuzz(int n) {
        List<String> al=new ArrayList<>();
          for(int i=1;i<=n;i++){
              if(i%3==0 && i%5==0){
                  al.add("FizzBuzz");
              } else if (i%5==0) {
                  al.add("Buzz");
              } else if (i%3==0) {
                  al.add("Fizz");
              }
              else {
                  al.add(i+"");
              }
          }
          return al;
    }
}
