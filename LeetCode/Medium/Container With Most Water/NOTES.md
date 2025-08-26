
          # Container With Most Water

          **Summary:** The code utilizes an integer array to store the heights of containers. It employs a two-pointer approach, with pointers at the beginning and end of the array.  In each iteration, it calculates the area formed by the containers at the pointers and updates the maximum area found so far. The pointer pointing to the shorter container is moved inward to potentially find a larger area. This process continues until the pointers cross.

          - Time Complexity: O(n) because the while loop iterates at most n times, where n is the length of the height array. Each iteration performs constant time operations.
          - Space Complexity: O(1) because the algorithm uses a constant amount of extra space regardless of the input size. The variables l, r, max, and h occupy constant space.
          