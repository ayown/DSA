
          Rotate Array

          - Summary: The code uses an integer array and a List of Integer objects to rotate an array.  It first handles the case where d is larger than the array length by using modulo operation. Then, it reverses three sub-arrays using Collections.reverse(): the first d elements, the remaining elements, and finally the whole array. This cleverly achieves a counter-clockwise rotation in O(n) time.

          - Time Complexity: O(n) because the code iterates through the array three times using Collections.reverse, each taking linear time.  The other operations (modulo, array creation) are constant or linear time.
          - Space Complexity: O(n) due to the creation of a new Integer array 'ar' and the List 'list', both of which store a copy of the input array. Note that in-place rotation algorithms exist with O(1) space complexity but this one does not use them.
          