package Bindu1;

import java.util.HashMap;

public class LongestSubString1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String input = "abcabcbb";
        String result = LongestSubstring(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }

    public static String LongestSubstring(String s) {
        HashMap<Integer,Character> charIndex = new HashMap();
        int maxLength = 0;
        int start = 0; // Start index of the current substring
        String longestSubstring = "";

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);
            charIndex.put(end, currentChar);
            // If the character is already in the map and its index is within the current substring
            if (charIndex.containsKey(currentChar) && charIndex.get(currentChar) >= start) {
                // Update start to the next position after the last occurrence
                start = charIndex.get(currentChar) + 1;
            }

            // Update or add the character's latest index
            charIndex.put(end, currentChar);

            // Calculate the current length of the substring
            int currentLength = end - start + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
                longestSubstring = s.substring(start, end + 1);
            }
        }

        return longestSubstring;
    }
}
