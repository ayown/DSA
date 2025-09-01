
Remove Duplicates from Sorted Array

- Summary: The code utilizes an integer array to store input numbers. It employs a two-pointer approach: 'i' acts as a slow runner that keeps track of the unique elements, and 'j' acts as a fast runner that iterates through the array. If nums[i] and nums[j] are different, it means nums[j] is a unique element, which is then placed at nums[i+1], and 'i' is incremented. This process continues until 'j' reaches the end of the array. Finally, i+1 represents the length of the array with duplicates removed.

  - Time Complexity: O(n) because the code iterates through the input array once, where n is the length of the input array.
  - Space Complexity: O(1) because the algorithm uses a constant amount of extra space, irrespective of the input size. It modifies the input array in-place.
          
