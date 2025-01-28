package leetcode;

import java.util.Scanner;

public class ConvertTemp {//complete
    public static double[] convertTemperature(double celsius) {
        double[] d=new double[2];
        d[0]=celsius + 273.15;
        d[1]=celsius * 1.80 + 32.00;
        return d;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double c=sc.nextDouble();
        double[] d=convertTemperature(c);
        System.out.println(d[0]);
        System.out.println(d[1]);
    }
}
