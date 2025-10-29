package org.example.leetcode.medium;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            // Odd-length palindrome (centered at one char)
            String p1 = expandAroundCenter(s, i, i);
            // Even-length palindrome (centered between two chars)
            String p2 = expandAroundCenter(s, i, i + 1);

            // Keep the longest one
            String longer = p1.length() > p2.length() ? p1 : p2;
            if (longer.length() > result.length()) {
                result = longer;
            }
        }

        return result;
    }

    private String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        // left and right went one step too far
        return s.substring(left + 1, right);
    }
}
