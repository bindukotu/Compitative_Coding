package leetcode;

public class IncreaseTripletSubsequence {
    public static void main(String[] args) {
       int[] nums={2,4,-2,-3};

//{20,100,10,12,5,13};//{5,4,3,2,1};//{2,1,5,0,4,6};//{1,2,3,4,5,6};
        System.out.println(increasingTriplet(nums));
    }
    public static boolean increasingTriplet(int[] nums) {
        int len=nums.length;
        int[] lmin=new int[len];
        int[] rmax=new int[len];
        lmin[0]=Integer.MAX_VALUE;
        rmax[len-1]=Integer.MIN_VALUE;
        for(int i=1;i<len;i++){
            lmin[i]=Math.min(lmin[i-1],nums[i-1]);
        }
        for (int i=len-2;i>=0;--i)
        {
            rmax[i]=Math.max(rmax[i+1],nums[i+1]);
        }
        for(int i=0;i<len;i++){
            if(lmin[i]<nums[i] && nums[i]<rmax[i]){
                return true;
            }
        }
        return false;
    }
}
