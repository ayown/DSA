
          # String to Integer (atoi)

          **Summary:** The function uses integer variables and a long variable to handle potential overflow. It iterates through the input string, skipping leading spaces, checking for a sign, and converting digit characters to an integer.  It incorporates overflow checks to ensure the result stays within the range of a 32-bit integer. Finally, it returns the resulting integer with the appropriate sign.

          - Time Complexity: O(n), where n is the length of the input string. This is because the algorithm iterates through the string at most once.
          - Space Complexity: O(1). The algorithm uses a fixed number of variables regardless of the input string length.
          