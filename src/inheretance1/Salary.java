package inheretance1;

public class Salary extends Benfits{
    int sal;
    String gra;
    Salary(int sal,String gra)
    {
        this.sal=sal;
        this.gra=gra;
    }
    void dis(){
        int val=cal(sal,gra);
        System.out.println("Val :"+cal(sal,gra));
        int s=sal+val;
        System.out.println("Salary "+sal+" And Benfits : "+val);
        System.out.println("Total Salary "+s);
    }
}
