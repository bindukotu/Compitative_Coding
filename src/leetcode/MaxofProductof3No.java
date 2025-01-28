package leetcode;

public class MaxofProductof3No {
    public static void main(String[] args) {
        MaxofProductof3No max3=new MaxofProductof3No();
        int[] n={-100,-2,-3,1};//{-100,-98,-1,2,3,4};//{1,2,3};
        System.out.println(max3.maximumProduct(n));
    }
    public int maximumProduct(int[] nums) {
        int len=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            int j=i+1,k=i+2;
            if(k>len-1)
                k=k-len;
            if(j>len-1)
                j=j-len;
            System.out.println("j  :"+j);
            System.out.println("k   :"+k);
            int mal=nums[i]*nums[j]*nums[k];
            max=Math.max(max,mal);
        }
        return max;
    }
}
