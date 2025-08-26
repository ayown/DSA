
          # Integer to Roman

          **Summary:** The code utilizes two parallel arrays: `values` storing integer values (1000, 900, 500, etc.) and `symbols` storing their corresponding Roman numeral representations.  It iterates through `values`, repeatedly subtracting the largest possible value from the input `num` and appending its Roman numeral equivalent to a StringBuilder until `num` becomes zero. Finally, it converts the StringBuilder to a string representing the Roman numeral.

          - Time Complexity: O(1). The number of iterations is bounded by the length of the `values` array, which is a constant 13. Therefore, the time complexity is constant, regardless of the input number.
          - Space Complexity: O(1). The space used by the arrays `values` and `symbols` and the StringBuilder is constant and doesn't depend on the input number. Hence, space complexity is O(1).
          