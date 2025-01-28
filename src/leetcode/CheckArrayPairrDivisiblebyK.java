package leetcode;

public class CheckArrayPairrDivisiblebyK {//incomplete
    public static void main(String[] args) {
        int[] a={-10,10};//{1,2,3,4,5,10,6,7,8,9};//{3,8,7,2};
        int k=2;
        System.out.println(canArrange(a,k));
    }
    public static boolean canArrange(int[] arr, int k) {
                int[] remainderCount = new int[k];

                // Count remainders of each element in the array
                for (int num : arr) {
                    int remainder = ((num % k) + k) % k; // Handling negative remainders
                    System.out.println(remainder);
                    remainderCount[remainder]++;
                    System.out.println(remainderCount[remainder]);
                }
                for (int a:remainderCount)
        System.out.println(a);
                // Check pairs
                for (int i = 1; i <= k / 2; i++) {
                    if (remainderCount[i] != remainderCount[k - i]) {
                        return false;
                    }
                }

                // Special case for remainders of 0
                if (remainderCount[0] % 2 != 0) {
                    return false;
                }

                return true;
//            }
//        }

//       boolean flag=false;
//       int size=arr.length/2;
//      for(int i=0,j=arr.length-1;i<size;i++,j--){
//          if((arr[i]+arr[j])/k>0)
//          {
//                  System.out.println(arr[i]+" "+arr[j]);
//                  flag=true;
//             }
//      }
//      for(int i=0;i<size;i++)
//      {
//          for (int j=i+1;j<size;j++)
//          {
//              if((arr[i]+arr[j])/k>0)
//              {
//                  System.out.println(arr[i]+" "+arr[j]);
//                  flag=true;
//              }
//          }
//      }
     //  return flag;
    }
}
