package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RankTransformofanArray {//not completed
    public static void main(String[] args) {
        int[] n={40,10,20,30};
        int[] k=arrayRankTransform(n);
    }
    public static int[] arrayRankTransform(int[] arr) {
       // Set<Integer> hs=new HashSet<>();
        int[] hs=new int[arr.length];
             for(int i=0;i< arr.length;i++)
                 hs[i]=arr[i];
             Arrays.sort(hs);
             for(int i=0;i<arr.length;i++){

                 for(int j=0;j<arr.length;j++){
                    // if()
                 }
             }
           return arr;
    }
}
