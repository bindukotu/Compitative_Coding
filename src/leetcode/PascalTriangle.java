package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PascalTriangle p=new PascalTriangle();
        System.out.println(p.generate(n));
    }
    public List<List<Integer>> generate(int numRows) {
          List<List<Integer>> ll=new ArrayList<>();
          for(int i=1;i<=numRows;i++){
              List<Integer> l1=new ArrayList<>();
              int k=1;
              for(int j=1;j<=i;j++){
                  l1.add(k);
                  k=k*(i-j)/j;
              }
              ll.add(l1);
          }
          return ll;
    }
}
