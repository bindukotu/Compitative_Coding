package leetcode;

public class MovesZereos {
    public static void main(String[] args) {
       int[] n={2,1};//{1,0};{0};{0,1,0,3,12};{2,1}
        moveZeroes(n);
        for(int i:n){
            System.out.print(i+" ");
        }
    }
    public static void moveZeroes(int[] nums) {

        int index=0;
                for(int i=0;i<nums.length;i++)
                {
                    if(nums[i]!=0){
                        nums[index]=nums[i];
                        index++;
                    }
                }
                for(int i=index;i<nums.length;i++){
                    nums[i]=0;
                }
//          int i=0;
//          int len=nums.length-1;
//          int j=len;
//          while(i<j){
//                if(nums[i]==0 && nums[j]!=0)
//                {
//                    int temp=nums[i];
//                    nums[i]=nums[j];
//                    nums[j]=temp;
//                    i++;
//                    j--;
//                }
//              if(nums[i]!=0)
//                  i++;
//
//              if(nums[j]==0)
//                  j--;
//          }
//          len=j;
//          for( i=0;i<=len;i++){
//              for (j=i;j<=len;j++){
//                  if(nums[j]<nums[i]){
//                      int t=nums[i];
//                      nums[i]=nums[j];
//                      nums[j]=t;
//                  }
//              }
//          }
    }
}
