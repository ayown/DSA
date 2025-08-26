class Solution {
    public int romanToDecimal(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int val1 = value(s.charAt(i));
            if (i + 1 < n) {
                int val2 = value(s.charAt(i + 1));
                if (val1 >= val2) ans += val1;
                else {
                    ans += (val2 - val1);
                    i++;
                }
            } else ans += val1;
        }
        return ans;
    }

    private int value(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return -1;
    }
}
