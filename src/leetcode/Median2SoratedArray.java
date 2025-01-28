package leetcode;

import java.util.Arrays;

public class Median2SoratedArray {
    public double findMedian(int[] a,int[] b)
    {
          int[] c=new int[a.length+b.length];
          double mg;
          for(int i=0;i<a.length;i++)
          {
              c[i]=a[i];
          }
        for(int i=a.length,j=0;j<b.length;j++,i++)
        {
            c[i]=b[j];
        }
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
        if(c.length%2==0)
        {
            int l=c.length/2;
          //  System.out.println("length "+l);
           // System.out.println("c[l]  "+c[l]+"c[l-1] "+c[l-1]+"  "+(c[l-1]+c[l]));
            mg=(c[l-1]+c[l])/2.0;
        }
        else
        {
            int l=Math.abs(c.length/2);
            int k=5/2;
            System.out.println(Math.ceil(2.5)+"k "+k);
            mg=c[l]/1.0;
        }
        return mg;
    }
    public static void main(String[] args)
    {
        Median2SoratedArray ma=new Median2SoratedArray();
        int[] a={1,3};
        int[] b={2};
        double d=ma.findMedian(a,b);
        System.out.println("Value "+d);
    }
}
