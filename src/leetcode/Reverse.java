package leetcode;

public class Reverse {

        public int reverse(int x) {
            int org=x;
            long sum=0;
            if(org<0)
                x=x*(-1);
            while(x>0)
            {
                System.out.println("x%10  "+x%10);
                sum=(sum*10)+(x%10);
                x=x/10;
                System.out.println(sum);
            }
            if(org<0)
                sum=sum*(-1);
            // System.out.println(sum);
            //1 2 3 4 5 6 7 8 9
            return (int)sum;
        }
    }

