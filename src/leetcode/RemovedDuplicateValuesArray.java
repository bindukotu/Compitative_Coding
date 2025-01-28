package leetcode;

import java.util.Arrays;

public class RemovedDuplicateValuesArray {
    public static void main(String[] args){
        int[] nums={0,0,1,1,1,2,2,3,3,4};
         int k=removeDuplicte(nums);
         for(int i=0;i<k;i++)
             System.out.print(nums[i]);
    }
    public static int removeDuplicte(int[] nums){
        int k=1;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            //System.out.print(nums[i]+"  "+nums[i-1]);
            if (nums[i]!=nums[i-1]){
              nums[k]=nums[i];
                k++;
            }
        }
//        System.out.println();
//        System.out.println("Removed");
//        for(int i=0;i<nums.length;i++)
//            System.out.print(nums[i]+" ");
//        System.out.println();
//        System.out.println(" K "+k);
       return k;
    }
}
