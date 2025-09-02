
          Union of 2 Sorted Arrays

          - Summary: The code efficiently finds the union of two sorted integer arrays using three `while` loops and an `ArrayList`. The first loop iterates through both arrays simultaneously, adding elements to the `ArrayList` only if they are not duplicates. The subsequent loops handle remaining elements in either array. The `addIfNotDuplicate` helper function ensures that only unique elements are added to the result.

          - Time Complexity: O(n+m), where n and m are the lengths of the input arrays. This is because each element in both arrays is processed at most once.
          - Space Complexity: O(n+m) in the worst case, where n and m are the lengths of the input arrays. This is because the `ArrayList` can store up to n+m elements if all elements are unique.
          