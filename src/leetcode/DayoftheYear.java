package leetcode;

import java.util.Scanner;

public class DayoftheYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the date : ");
        String s=sc.nextLine();
        System.out.println(dayOfYear(s));
    }
    public static int dayOfYear(String date) {
        int leepyear=0;
          int[] day={0,31,59,90,120,151,181,212,243,273,304,334};
          int year=(date.charAt(0)-'0')*1000+(date.charAt(1)-'0')*100+(date.charAt(2)-'0')*10+(date.charAt(3)-'0')*1;
          int month=(date.charAt(5)-'0')*10+(date.charAt(6)-'0')*1;
          int days=(date.charAt(8)-'0')*10+(date.charAt(9)-'0')*1;
          if(year%4==0 && year%100 != 0 || year%400== 0) {
              leepyear = 1;
          }
          else {
              leepyear = 0;
          }
        System.out.println("year"+year+" month : "+month+"  days   "+days+"leep year "+leepyear);
        if(leepyear==1 && month>2)
        days=   days+day[month-1]+leepyear;
        else
          days=  days+day[month-1];
        return days;
    }
}
