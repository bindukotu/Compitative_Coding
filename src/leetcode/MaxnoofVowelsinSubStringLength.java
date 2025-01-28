package leetcode;

public class MaxnoofVowelsinSubStringLength {
    public static void main(String[] args) {
        String s="aeiou";
        int k=2;
        System.out.println(maxVowels(s,k));
    }
    public static int maxVowels(String s, int k) {
           int max=0;
            char c;
            for(int i=0;i<k;i++) {
                c=s.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    max++;
                }
            }
            int count=max;
            for(int i=k;i<s.length();i++){
                c=s.charAt(i-k);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count--;
                }
                c=s.charAt(i);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    count++;
                }
                max=Math.max(max,count);
            }
            return max;
    }
}
