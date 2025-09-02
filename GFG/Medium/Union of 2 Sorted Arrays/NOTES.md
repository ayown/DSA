
          Union of 2 Sorted Arrays

          - Summary: The code efficiently finds the union of two sorted integer arrays using three while loops and an ArrayList.  The main loop iterates through both arrays simultaneously, adding elements to the ArrayList only if they are not duplicates.  Two additional loops handle any remaining elements in either array after the main loop completes. The `addIfNotDuplicate` function ensures uniqueness in the resulting ArrayList.

          - Time Complexity: O(n+m), where n and m are the lengths of the input arrays. This is because each element in both arrays is processed at most once.
          - Space Complexity: O(n+m) in the worst case. This is because the ArrayList `res` can store up to n+m unique elements in the case where all elements are distinct.
          