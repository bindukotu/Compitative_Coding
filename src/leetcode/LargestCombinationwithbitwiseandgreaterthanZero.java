package leetcode;

public class LargestCombinationwithbitwiseandgreaterthanZero {//complete
    public static void main(String[] args) {
           int[] a={16,17,71,62,12,24,14};
        System.out.println(largestCombination(a));

    }
    public static int largestCombination(int[] candidates) {
        int maxCombinationSize = 0;
        for (int bit = 0; bit < 30; bit++) {
            int count = 0;
            for (int num : candidates) {
                if ((num & (1 << bit)) != 0) {
                    count++;
                }
            }
            maxCombinationSize = Math.max(maxCombinationSize, count);
        }
        return maxCombinationSize;
    }
}
