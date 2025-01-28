package leetcode;

public class CanPlaceFlowers {
    public static void main(String[] args) {
           int[] a={1,0,0,0,1};
           int n=2;
        System.out.println(canPlaceFlowers(a,n));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
       int len=flowerbed.length;
       int i=0;
       while (i<len && n>0){
           int l=i==0?0:flowerbed[i-1];
           int r=i==len-1?0:flowerbed[i+1];
           if(l+flowerbed[i]+r==0){
               flowerbed[i]=1;
               n--;
           }
           i++;
       }
       return n<=0;
    }
}
