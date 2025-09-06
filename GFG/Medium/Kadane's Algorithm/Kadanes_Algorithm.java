class Solution {
    int maxSubarraySum(int[] arr) {
        // Code here
        int current_sum =  0;
        int max = Integer.MIN_VALUE;
        
        for(int i =0; i<arr.length; i++){
            current_sum += arr[i];
            
            if(current_sum > max){
                max = current_sum;
            }
            
            if(current_sum <0){
                current_sum = 0 ;
            }
        }
        
        return max;
    }
}
