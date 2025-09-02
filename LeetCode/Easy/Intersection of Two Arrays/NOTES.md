
          Intersection of Two Arrays

          - Summary: The code uses arrays and an ArrayList to find the intersection of two input arrays.  It first sorts both input arrays, then uses two pointers to iterate through them simultaneously, comparing elements. If a common element is found, it's added to the ArrayList only if it's not already present (to avoid duplicates). Finally, the ArrayList is converted back to an integer array and returned.

          - Time Complexity: O(m log m + n log n + min(m, n)) where m and n are the lengths of the input arrays. This is because sorting takes O(m log m) and O(n log n) time, and the two-pointer iteration takes O(min(m, n)) time in the worst case.
          - Space Complexity: O(min(m, n)) in the worst case. This is because the ArrayList can store up to min(m, n) elements (the maximum number of common elements).
          