package Seminar;

public class Sample {
    int a;
    static int b;
    public void f1()
    {
        System.out.println("I Am from f1 instance Merthod");
        System.out.println("a Value"+a);
        System.out.println("b Value"+b);
    }
    public void f2()
    {
        f1();
        System.out.println("I AM from f2 instance Method");
        f3();
    }
    public static void f3()
    {
        System.out.println("I AM from f3 instance Method");
        System.out.println("b value :"+b);
    }
    static {
        System.out.println("I Am from static block above main method");
        for (byte b=0;b<10;b++)
        {
            System.out.println("Hi Hello");
        }
        b=1000;
        System.out.println("b value:"+b);
    }
    {
        System.out.println("I AM from Instance block above main method");
        System.out.println("a value ;"+a);
        System.out.println("b value ;"+b);
    }
    public static void main(String[] args)
    {
        System.out.println("I Am from Main Method");
        f3();
        Sample s1=new Sample();
        System.err.println(s1);
        s1.f2();
        Sample s2=new Sample();
        System.out.println(s2);
        System.out.println("End of Method");
    }
    {
        System.out.println("instance block bellow main method");
    }
    static {
        System.out.println("Static block bellow main method");
    }
}
