
# Second Largest

**Summary:** The function uses an integer array to store input numbers. It initializes two integer variables, `first` and `second`, to the minimum possible integer value. The algorithm iterates through the array, updating `first` and `second` to track the largest and second largest numbers encountered so far.  If fewer than two elements exist, -1 is returned; otherwise, the second largest number (`second`) is returned, or -1 if no second largest exists.

- Time Complexity: O(n) because the algorithm iterates through the input array once. The number of operations is directly proportional to the size of the input array.
- Space Complexity: O(1) because the algorithm uses a fixed number of variables regardless of the input array size.  The space used does not grow with the input size.
          
