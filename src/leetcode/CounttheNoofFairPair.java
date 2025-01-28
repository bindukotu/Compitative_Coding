package leetcode;

import java.util.Arrays;

public class CounttheNoofFairPair {
    public static void main(String[] args) {
       int[] n={0,1,7,4,4,5};//{0,1,7,4,4,5},
       int lower=3;
       int upper=6;
        System.out.println(countFairPairs(n,lower,upper));
    }
    public static long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long ans = 0;
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            int j = search(nums, lower - nums[i], i + 1);
            int k = search(nums, upper - nums[i] + 1, i + 1);
            ans += k - j;
        }
        return ans;

//        long count=0l;
//        int len=nums.length;
//        System.out.println("(i,j)");
//          for(int i=0;i<len;i++){
//              for(int j=len-1;j>i;j--){
//                  int k=nums[i]+nums[j];
//                  if(lower<=k && k<=upper){
//                      System.out.print("("+i+","+j+")  ");
//                      count++;
//                  }
//              }
//          }
//          return count;
    }
    private static int search(int[] nums, int x, int left) {
        int right = nums.length;
        while (left < right) {
            int mid = (left + right) >> 1;
            if (nums[mid] >= x) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
