package leetcode;

public class ProductofArrayexceptSelf {
    public static void main(String[] args) {
        int[] n={-1,1,0,-3,3};//{1,2,3,4};
        int[] a=productExceptSelf(n);
        for (int i:a)
            System.out.print(i+" ");

    }
    public static int[] productExceptSelf(int[] nums) {
        int len=nums.length;
        int[] res=new int[len];
        int[] left=new int[len];
        int[] right=new int[len];
        left[0]=1;
        right[len-1]=1;
        for(int i=1;i<len;i++){
            left[i]=left[i-1]*nums[i-1];
        }
        for(int j=len-2;j>=0;j--){
            right[j]=right[j+1]*nums[j+1];
        }
        for (int i=0;i<len;i++)
        {
            res[i]=left[i]*right[i];
        }
        return res;
    }
}
