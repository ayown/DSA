
          Kadane's Algorithm

          - Summary: This code implements Kadane's Algorithm to find the maximum sum of a contiguous subarray. It uses an integer array to store the input numbers and two integer variables: `current_sum` to track the sum of the current subarray and `max` to store the maximum sum encountered so far. The algorithm iterates through the array, updating `current_sum` by adding each element. If `current_sum` exceeds `max`, `max` is updated. If `current_sum` becomes negative, it's reset to 0, as a negative sum cannot contribute to a larger maximum sum. Finally, the algorithm returns `max`.

          - Time Complexity: O(n) because the algorithm iterates through the input array once.
          - Space Complexity: O(1) because it uses only a constant amount of extra space to store variables regardless of input size.
          