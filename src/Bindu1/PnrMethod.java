package Bindu1;
//formula n!/(n-r)!
public class PnrMethod {
    public int pnrCal(int n)
    {
        int temp=1;
        for(;n>0;n--)
        {
            temp=temp*n;
        }
        return temp;
    }
}
