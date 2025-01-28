package leetcode;

import java.util.*;

public class FindifArraycanbeSorted {
    public static void main(String[] args) {
         int[] n={3,16,8,4,2};
        //  int[] n={8,4,2,30,15};
        System.out.println(canSortArray(n));
    }
    public static boolean canSortArray(int[] nums) {
        int len=nums.length;
        int m1=0,i=0;
        while(i<len){
            int cnt=Integer.bitCount(nums[i]);
            int j=i+1;
            int min=nums[i],max=nums[i];
            while (j<len && Integer.bitCount(nums[j])==cnt){
                min=Math.min(min,nums[j]);
                max=Math.max(max,nums[j]);
                j++;
            }
            if(m1>min){
                return false;
            }
            m1=max;
            i=j;
        }

        return true;
    }
}
