package Bindu1;

public class NCRPrg {
    public int ncr1(int n)
    {
        int temp=1;
        for(int i=1;i<=n;i++)
        {
            temp=temp*i;
        }
        return temp;
    }
}
