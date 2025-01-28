package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UniquenoofOccerence {
    public static void main(String[] args) {
        int[] n={1,2};//{-3,0,1,-3,1,1,1,-3,10,0};//{1,2,2,1,1,3};
        UniquenoofOccerence u=new UniquenoofOccerence();
        System.out.println(u.uniqueOccurrences(n));
    }
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
          hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> se=new HashSet<>();
       for(Integer k: hm.keySet()){
           se.add(hm.get(k));
       }
       return hm.size()==se.size();
    }
}
