class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        Integer[] ar = new Integer[n];
        for (int i = 0; i < n; i++) ar[i] = nums[i];
        
        List<Integer> list=Arrays.asList(ar);
        Collections.reverse(list);
        Collections.reverse(list.subList(0,k));
        Collections.reverse(list.subList(k,n));

        for (int i = 0; i < n; i++) nums[i] = ar[i];
    }
}