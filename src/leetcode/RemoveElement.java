package leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a={2};//{0,1,2,2,3,0,4,2};//{3,2,2,3};
        int val=3;
        System.out.println(removeElement(a,val));
    }
    public static int removeElement(int[] nums, int val) {
        int k=0;
        for(int x:nums){
            if(val!=x){
                nums[k++]=x;
            }
        }
        return k;
        //My logic
//       int l=0,r=nums.length-1;
//       while (l<r){
//           if(nums[l]==val && nums[r]!=val){
//               int temp=nums[l];
//               nums[l]=nums[r];
//               nums[r]=temp;
//               r--;
//               l++;
//           }
//           if(nums[l]!=val){
//               l++;
//           }
//           if(nums[r]==val)
//               r--;
//
//       }
//       return l;
    }
}
