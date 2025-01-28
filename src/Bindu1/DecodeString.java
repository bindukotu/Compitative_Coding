package Bindu1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        DecodeString de=new DecodeString();
        System.out.println(de.decodeString(s));
    }
    public String decodeString(String s) {
        Deque<String> alp=new ArrayDeque<>();
        Deque<Integer> dig=new ArrayDeque<>();
        String res="";
        int num=0;
        for(char c:s.toCharArray()){
            if('0'>=c || c<='9'){
                num=num*10+c-'0';
            }
            else if(c=='['){
                alp.push(res);
                dig.push(num);
                num=0;
                res="";
            }
            else if(c==']'){
                StringBuilder sb=new StringBuilder();
                for(int i=0,n=dig.pop();i<n;i++){
                    sb.append(res);
                }
                res=alp.pop()+sb.toString();
            }
            else {
                res=res+String.valueOf(c);
            }

        }
        return res;

    }
}
