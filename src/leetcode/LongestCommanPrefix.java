package leetcode;
/*
Example 1:
Input: strs = ["flower","flow","flight"]
Output: "fl"

Example 2:
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

strs =
["aa","ab"]


*/

public class LongestCommanPrefix {//completed
    public static void main(String[] args){
       // String[] s={"aa","ab"};
        String[] s={"dog","racecar","car"};
        //String[] s={"flower","flow","flight"};
        String s1="";
        /*
        int n = strs.length;
        for (int i = 0; i < strs[0].length(); ++i) {
            for (int j = 1; j < n; ++j) {
                if (strs[j].length() <= i || strs[j].charAt(i) != strs[0].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        */
        int n=s.length;
        for(int i=0;i<s[0].length();++i)
        {
            for(int j=1;j<n;++j)
                if(s[j].length()<=i||s[0].charAt(i)!=s[j].charAt(i)){
                    s1=s[0].substring(0,i);
                    break;
                }
        }
        System.out.println(s1);
    }
}
