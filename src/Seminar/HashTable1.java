package Seminar;

import java.util.Hashtable;

public class HashTable1 {
    public static void main(String[] args){
        Hashtable<String,String> ht=new Hashtable<>();
        ht.put("a","12");
        ht.put("b",null);
        System.out.println(ht);
    }
}
