class Solution {
    public int getSecondLargest(int[] arr) {
        int n = arr.length;
        if (n < 2) return -1;
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > first) {
                second = first;
                first = x;
            } else if (x > second && x < first) {
                second = x;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
