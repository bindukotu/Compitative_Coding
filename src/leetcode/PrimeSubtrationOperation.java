package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PrimeSubtrationOperation {
    public boolean primeSubOperation(int[] nums) {
//        List<Integer> p = new ArrayList<>();
//        for (int i = 2; i <= 1000; ++i) {
//            boolean ok = true;
//            for (int j : p) {
//                if (i % j == 0) {
//                    ok = false;
//                    break;
//                }
//            }
//            if (ok) {
//                p.add(i);
//            }
//        }
       int[] p ={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199,211,223,227,229,233,239,241,251,257,263,269,271,277,281,283,293,307,311,313,317,331,337,347,349,353,359,367,373,379,383,389,397,401,409,419,421,431,433,439,443,449,457,461,463,467,479,487,491,499,503,509,521,523,541,547,557,563,569,571,577,587,593,599,601,607,613,617,619,631,641,643,647,653,659,661,673,677,683,691,701,709,719,727,733,739,743,751,757,761,769,773,787,797,809,811,821,823,827,829,839,853,857,859,863,877,881,883,887,907,911,919,929,937,941,947,953,967,971,977,983,991,997};
        int n = nums.length;
        for (int i = n - 2; i >= 0; --i) {
            if (nums[i] < nums[i + 1]) {
                continue;
            }
            int j = search(p, nums[i] - nums[i + 1]);
            if (j == p.length || p[j] >= nums[i]) {
                return false;
            }
            nums[i] -= p[j];
        }
        return true;
    }

    private int search(int[] nums, int x) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] > x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        int[] nums={5,8,3};//{5,8,3};{4,9,6,10};
        PrimeSubtrationOperation ps=new PrimeSubtrationOperation();
        System.out.println(ps.primeSubOperation(nums));
    }
}
