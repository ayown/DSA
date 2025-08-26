class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        
        int original = x, rev = 0;
        while (x != 0) {
            int d = x % 10;
            if (rev > (Integer.MAX_VALUE - d) / 10) return false; // overflow guard
            rev = rev * 10 + d;
            x /= 10;
        }
        return rev == original;
    }
}
