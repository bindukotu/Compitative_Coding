package leetcode;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestElementinArray {
    public static void main(String[] args) {
        int[] num={3,2,1,5,6,4};
        int k=2;
        System.out.println(" f :"+findKthLargest(num,k));
    }
    public static int findKthLargest(int[] nums, int k) {
               int val=0;
        PriorityQueue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
        //Iterator<Integer> it=q.iterator();
        int l=q.size()-k;

        while(!q.isEmpty())
        {
            if(q.size()==k)
                val=q.poll();
            else
                System.out.print(q.poll()+" ");
        }
        return val;

    }
}
