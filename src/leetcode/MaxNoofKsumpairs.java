package leetcode;

import java.util.Arrays;

public class MaxNoofKsumpairs {
    public static void main(String[] args) {
           int[] num={3,1,3,4,3};//{1,2,3,4};
           int k=5;
        System.out.println(maxOperations(num,k));
    }
    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count=0;
        int left=0,right=nums.length-1;
        while (left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                 count++;
                 left++;
                 right--;
            }
            else if (sum>k){
                right--;
            }
            else {
                left++;
            }
        }
        return count;
    }
}
