package leetcode;
import java.util.*;
public class RemoveSubFolderinFileSys {
    public static void main(String[] args) {
        String[] s={"/a","/a/b","/c/d","/c/d/e","/c/f"};
       // List<String> li=removeSubfolders(s);
        char[] c=s[3].toCharArray();
        System.out.println(c);
        Arrays.sort(c);
        System.out.println(c);

    }
//    public static List<String> removeSubfolders(String[] folder) {
//        List<String> li= new ArrayList<>();
//
//        return li;
//    }
}
