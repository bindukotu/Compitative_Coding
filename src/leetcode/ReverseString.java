package leetcode;

public class ReverseString {
    public static void main(String[] args){
        char[] s={'h','e','l','l','o'};
      // char[] s = {'H','c','j','n','b','h'};
       int n=s.length;
       System.out.println(n);
        for(int i=0,j=n-1;i!=j&&i<j;i++,j--)
        {
            char c=s[i];
            s[i]=s[j];
            s[j]=c;
        }
//        if(n%2==0)
//        {
//            System.out.println("if");
//            char c=s[n/2-1];
//            s[n/2-1]=s[n/2];
//            s[n/2]=c;
//        }
        System.out.print("[");
        for (int i=0;i<s.length-1;i++)
            System.out.print("\""+s[i]+"\""+",");
        System.out.print("\""+s[s.length-1]+"\""+"]");
    }
}
