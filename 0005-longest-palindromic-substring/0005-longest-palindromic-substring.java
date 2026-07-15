class Solution {
    public String longestPalindrome(String s) {
        String longest = "";
        
        for (int i = 0; i < s.length(); i++) {
            // Odd length palindromes (e.g., "aba")
            String odd = expand(s, i, i);
            if (odd.length() > longest.length()) {
                longest = odd;
            }
            
            // Even length palindromes (e.g., "bb")
            String even = expand(s, i, i + 1);
            if (even.length() > longest.length()) {
                longest = even;
            }
        }
        
        return longest;
    }
    
    private String expand(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}