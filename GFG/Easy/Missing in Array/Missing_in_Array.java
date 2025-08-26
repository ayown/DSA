class Solution {
    int missingNum(int arr[]) {
        int n = arr.length + 1;
        long total = (long) n * (n + 1) / 2;  // use long
        long sum = 0;
        for (int x : arr) sum += x;  // sum in long
        return (int)(total - sum);
    }
}
