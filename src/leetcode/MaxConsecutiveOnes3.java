package leetcode;

public class MaxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] num={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};//{1,1,1,0,0,0,1,1,1,1,0};
        int k=3;
        System.out.println(longestOnes(num,k));
    }
    public static int longestOnes(int[] nums, int k) {
        int len=nums.length,left=0,right=0;
        for(;right<len;right++){
            if(nums[right]==0)
                k--;
            if(k<0){
                if(nums[left]==0)
                    k++;
                left++;
            }
        }
        System.out.println("k "+k+" right "+right+" left "+left);
        return right-left;
    }
}
