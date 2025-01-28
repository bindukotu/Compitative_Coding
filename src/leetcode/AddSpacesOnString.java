package leetcode;

import java.util.Scanner;

public class AddSpacesOnString {
    public static void main(String[] args) {
        AddSpacesOnString as=new AddSpacesOnString();
        //Scanner sc=new Scanner(System.in);
        String s="icodeinpython";
        int[] arr={1,5,7,9};
        System.out.println(as.addSpaces(s,arr));
    }
    public String addSpaces(String s, int[] spaces) {
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<spaces.length;i++){
            sb.insert(spaces[i]+i," ");
//            if(i==0)
//              sb.append(s.substring(0,spaces[i]));
//            else
//                sb.append(s.substring(spaces[i-1],spaces[i]));
//            sb.append(" ");
        }
        return sb.toString();
    }
}
