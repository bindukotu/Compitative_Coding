package Bindu1;

public class LCM {
    public static void main(String[] args)
    {
         int a=15,b=25;
         int sum=(a>b)?a:b;
         while (true){
             if(sum%a==0 && sum%b==0)
                 break;
             sum++;
         }

         System.out.println(sum);
    }
}
