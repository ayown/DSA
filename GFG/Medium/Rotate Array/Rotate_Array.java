// User function Template for Java

class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
        d %= n;
        Integer[] ar = new Integer[n];
        for (int i = 0; i < n; i++) ar[i] = arr[i];
        
        List<Integer> list=Arrays.asList(ar);
        Collections.reverse(list.subList(0,d));
        Collections.reverse(list.subList(d,n));
        Collections.reverse(list);

        for (int i = 0; i < n; i++) arr[i] = ar[i];
    }
}