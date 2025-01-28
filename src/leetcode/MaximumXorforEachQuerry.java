package leetcode;

public class MaximumXorforEachQuerry {
    public static void main(String[] args) {
         int[] a={2,3,4,7};
         int max=3;
        int[] b=getMaximumXor(a,max);
        for(int c:b)
        {
            System.out.print(c);
        }
    }
    public static int[] getMaximumXor(int[] nums, int maximumBit) {
        int n = nums.length;
        int maxNum = (1 << maximumBit) - 1;
        int currXor = 0;
        for (int num : nums) {
            currXor ^= num;
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = maxNum ^ currXor;
            currXor ^= nums[n - 1 - i];
        }

        return answer;
    }
    }

