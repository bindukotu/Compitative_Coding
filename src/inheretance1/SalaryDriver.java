package inheretance1;

import java.util.Scanner;

public class SalaryDriver {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        String gr=sc.next();
        System.out.println(gr);
        Salary s=new Salary(sal,gr);
        s.dis();
    }
}
