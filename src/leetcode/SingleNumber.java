package leetcode;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums={4,1,2,1,2};
        int n=0;
        for(int i=0;i<nums.length;i++){
            n=n^nums[i];
        }
        System.out.println(n);
    }
}
