package Bindu1;
//Non Repeated value in arrray
import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatedValueinArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the size of array");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Entre the array values : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        String arr1=" ";
        int count=0;
       for(int i=0;i<size;i++)
       {
           for(int j=0;j<size;j++)
           {
               if(arr[i]==arr[j])
                   count++;
           }
           if(count==1)
           {
                arr1+=arr[i]+" ";
           }
           count=0;
       }
       System.out.println("Non Repeated values :  "+arr1);
    }
}
