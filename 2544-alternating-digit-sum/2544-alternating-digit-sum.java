class Solution {
    public int alternateDigitSum(int n) {
        
        int res = 0;
        StringBuffer s = new StringBuffer(String.valueOf(n));

        for (int i = 0; i < s.length(); i++) {
            int dig = s.charAt(i) - '0';

            if (i % 2 == 0) {
                res += dig;
            } else {
                res -= dig;
            }
        }

        return res;
    }
}
