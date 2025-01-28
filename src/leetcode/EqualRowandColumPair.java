package leetcode;

import java.util.HashMap;
import java.util.Set;

public class EqualRowandColumPair {
    public static void main(String[] args) {
        int[][] num={{11,1},{1,11}};

                //{{3,1,2,2},{1,4,4,4},{2,4,2,2},{2,5,2,2}};
//{{11,1},{1,11}};//{{3,1,2,2},{1,4,4,5},{2,4,2,2},{2,4,2,2}};//{{3,2,1},{1,7,6},{2,7,7}};
        EqualRowandColumPair e=new EqualRowandColumPair();
        System.out.println(e.equalPairs(num));
    }
    public int equalPairs(int[][] grid) {
         int count=0;
         int n= grid.length;
         for(int i=0;i<n;i++){
             for(int j=0;j<n;j++){
                 int val=1;
                 for(int k=0;k<n;k++){
                     if(grid[i][k]!=grid[k][j]) {
                         val = 0;
                         break;
                     }
                 }
                 count+=val;
             }
         }
         return count;
    }
}
