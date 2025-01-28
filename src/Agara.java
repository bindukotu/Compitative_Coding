import java.util.Scanner;

public class Agara {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre String one : ");
        String s1=sc.nextLine();
        System.out.println("Entre String Two : ");
        String s2=sc.nextLine();
        int count=0;
        char c;
        if(s1.length()==s2.length()){
            s1=s1.toLowerCase();
            s2=s2.toLowerCase();
            char[] ch1=s1.toCharArray();
            char[] ch2=s2.toCharArray();
            for(int i=0;i<ch1.length;i++)
            {
                for(int j=0;j<ch2.length;j++)
                {
                    if(ch1[i]==ch2[j]) {
                        count++;
                       // c=ch1[i];
                    }
                }
            }
            if(count==ch1.length)
            {
                System.out.println(s1+" is Angaram");
            }
            else{
                System.out.println(s1+"is not Angaram");
            }
        }
        else{
            System.out.println("not Angaram");
        }
    }
}
