package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GreatestNoofCandies {
    public static void main(String[] args) {
          int[] candies={12,1,12};
         // int[] candies={4,2,1,1,2};
        //   int[] candies={2,3,5,1,3};
             int extraCandies=10;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> li=new ArrayList<>();
           int max=candies[0];
           for (int i=1;i<candies.length;i++)
           {
               if(max<candies[i])
                   max=candies[i];
           }
           for(int i=0;i<candies.length;i++)
           {
               if(candies[i]+extraCandies>=max)
                   li.add(true);
               else
                   li.add(false);
           }
        return li;
    }
}
