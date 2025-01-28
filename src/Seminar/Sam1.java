package Seminar;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;

public class Sam1 {


    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first String: ");
        String s1 = reader.readLine();
        System.out.println("Enter second String: ");
        String s2 = reader.readLine();
        List<Character> aList = getCharacters(s1, s2);
        String appended = new String();
        for(char c : aList) {
            appended = appended + c;
        }
        System.out.println("Appended String is: " + appended);
    }


    private static List<Character> getCharacters(String s1, String s2) {
        char[] s1ca = s1.toCharArray();
        char[] s2ca = s2.toCharArray();
        List<Character> aList = new ArrayList<>();
        for (int i = 0; i < s1.length() && i < s2.length(); i++) {
            aList.add(s1ca[i]);
            aList.add(s2ca[i]);
        }
        if(s1.length() > s2.length()) {
            for (int j = 0; j < s1.length() - s2.length(); j++) {
                aList.add(s1ca[j + s2.length()]);
            }
        }
        else if(s1.length() < s2.length()) {
            for (int j = 0; j < s2.length() - s1.length(); j++) {
                aList.add(s2ca[j + s1.length()]);
            }
        }
        return aList;
    }   }

