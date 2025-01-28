package Seminar;

public class Sample1 {
    public static void main(String[] args){
       // System.out.println("HI");
        int n=1;
      /*  System.out.println(n++);//1
        System.out.println(n);//1+1
        System.out.println(++n);//2+1*/
      /*  int a=10,b=20,c=30;
        if(a<b)
            if(a>c)
                System.out.println(a);
        else//if(a>b)
                System.out.println(c);*/
       // public class ArraysPractice8 {
           // public static void main(String[] args) {
                int a[]={1,2,3,4,5};
                int b[]=new int[a.length];
                int index=0;
                for(int i=0;i<a.length;i++) {
                    b[index]=a[i];
                    index++;
                }
                for(int j=0;j<b.length;j++) {
                    System.out.println(b[j]);
                }
       //     }
     //   }
    }
}
//Data Types