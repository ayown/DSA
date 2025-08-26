class Solution {
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;
        
        int i = 0, n = s.length(), sign = 1;
        long res = 0;

        // skip leading spaces
        while (i < n && s.charAt(i) == ' ') i++;
        
        // check sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }
        
        // build number
        while (i < n && Character.isDigit(s.charAt(i))) {
            res = res * 10 + (s.charAt(i) - '0');
            if (sign * res <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * res >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        
        return (int)(sign * res);
    }
}
