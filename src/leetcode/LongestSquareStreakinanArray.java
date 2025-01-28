package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSquareStreakinanArray {
    public static void main(String[] args) {
    int[] n={2,3,5,6,7};//{4,3,6,16,8,2};
        System.out.println(longestSquareStreak(n));
    }
    public static int longestSquareStreak(int[] nums) {
        int n=0;
        int max=-1;
        Set<Long> set=new HashSet<Long>();
        for (int i=0;i<nums.length;i++)
        {
            set.add(nums[i]*1l);
        }
        for(int num:nums)
        {
            n=0;
            while(set.contains(num*1l*num*1l)){
                n++;
                num=num*num;
                max=Math.max(max,n);
            }
        }
       return max;
    }
}
