package Bindu1;
//Length of Last Word
import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the String : ");
        String s = sc.nextLine();
        String[] s1=s.split(" ");
        int num=s1[s1.length-1].length();
        System.out.println(num);
     }
}
