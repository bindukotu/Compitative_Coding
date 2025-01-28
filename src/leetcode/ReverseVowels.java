package leetcode;

import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the String :");
        String s=sc.nextLine();
        System.out.println(reverseVowels(s));
    }
    public static String reverseVowels(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=0,j=s.length()-1;
        while(i<j){
            char c1=sb.charAt(i);
            char c2=sb.charAt(j);
            int ci=0;
            int cj=0;
            while (true && i<j)
            {
                if(c1=='a'|| c1=='e'|| c1=='i'|| c1=='o'|| c1=='u'|| c1=='A'|| c1=='E'|| c1=='I'|| c1=='O'|| c1=='U'){
                    ci=1;
                    break;
                }
                i++;
                c1=sb.charAt(i);
            }
            while (true && i<j)
            {
                if(c2=='a'|| c2=='e'|| c2=='i'|| c2=='o'|| c2=='u'|| c2=='A'|| c2=='E'|| c2=='I'|| c2=='O'|| c2=='U'){
                    cj=1;
                    break;
                }
                j--;
                c2=sb.charAt(j);
            }
            if(cj==1 && ci==1){
               sb.setCharAt(i,c2);
               sb.setCharAt(j,c1);
            }
            i++;
            j--;
        }
        return sb.toString();
    }
}
