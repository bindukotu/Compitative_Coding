package leetcode;

import java.util.*;

public class FindTheDiff2Arrays {
    public static void main(String[] args) {
        int[] num1={1,2,3,3};//{1,2,3};
        int[] num2={1,1,2,2};//{2,4,6};
        List<List<Integer>> ll=findDifference(num1,num2);
        for(List l:ll){
            System.out.println("main");
            System.out.println(l);
        }
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ll=new ArrayList<>();
        HashMap<Integer,Integer> h1=new HashMap<>();
        HashMap<Integer,Integer> h2=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            h1.put(nums1[i],1);
            h2.put(nums2[i],1);
        }
       for (int i=0;i<nums1.length;i++){
           int k=nums1[i];
           if(h1.containsKey(k) && h2.containsKey(k)){
               h1.remove(k);
               h2.remove(k);
           }
       }
          List<Integer> l1=h1.keySet().stream().toList();
          ll.add(l1);
        List<Integer> l2=h2.keySet().stream().toList();
        ll.add(l2);
        return ll;
    }
}
