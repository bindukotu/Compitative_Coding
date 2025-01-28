package inheretance1;

public class Benfits {
    int cal(int sal,String g)
    {
        int re=0;
        System.out.println("benfits");
        System.out.println("ben "+g);
        if(g.equalsIgnoreCase("d"))
        {
            System.out.println("d else");
            re=(int)(sal*(0.01));
        }
        else if (g.equalsIgnoreCase("c")) {
            System.out.println("c else");
            re=(int)(sal*(2.5/100));
        }
        else if (g.equalsIgnoreCase("b")) {
            System.out.println("b else");
            re=(int)(sal*(5.0/100));
        }
        else if (g.equalsIgnoreCase("a")) {
            System.out.println("a else");
            re=(int)(sal*(10.0/100));
        }
        else{
            System.out.println("Final else");
            re=10;
        }
        return re;
    }

}
