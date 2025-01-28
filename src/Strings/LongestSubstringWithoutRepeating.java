package Strings;
import java.util.*;
public class LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        String ls="";
        if (s == null || s.length() == 0) {
            return 0;
        }

        // HashMap to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();

        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window

        // Iterate through the string with the right pointer
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If the character is already in the map and the index is within the window
            if (map.containsKey(currentChar) && map.get(currentChar) >= left) {
                // Move the left pointer to the right of the last occurrence of the current character
                left = map.get(currentChar) + 1;
            }

            // Update the character's last seen index in the map
            map.put(currentChar, right);

            // Update the maxLength if the current window size is larger
         //   System.out.println("maxLength 1 "+maxLength);
            maxLength = Math.max(maxLength, right - left + 1);
          //  System.out.println("maxLength 2 "+maxLength);
           // System.out.println("right - left + 1 : "+(right - left + 1));
            ls=s.substring(maxLength);
            // ls=s.substring(maxLength, right - left + 1);
            System.out.println(ls);
           // System.out.println("HI : char "+currentChar+" maxlength "+maxLength+" right : "+right+" left "+left);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + lengthOfLongestSubstring(str));
    }
}
