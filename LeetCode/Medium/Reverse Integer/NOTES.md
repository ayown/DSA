
          # Reverse Integer

          **Summary:** The Java code reverses a given integer. It uses a `long` variable `rev` to accumulate the reversed integer to handle potential overflow. The code iteratively extracts the last digit of the input integer `x` using the modulo operator (`%`), multiplies the accumulated reversed integer by 10, and adds the extracted digit. Then, it divides `x` by 10 to remove the last digit. Finally, it checks if the reversed integer `rev` is within the range of a 32-bit integer; if not, it returns 0; otherwise, it casts `rev` to an integer and returns it.

          - Time Complexity: O(log10(x)), where x is the input integer. The number of iterations in the while loop is proportional to the number of digits in x, which is logarithmic with respect to x.
          - Space Complexity: O(1). The algorithm uses a constant amount of extra space regardless of the input integer size.
          