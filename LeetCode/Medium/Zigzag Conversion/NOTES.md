
          # Zigzag Conversion

          **Summary:** The code uses an array of StringBuilders to simulate the zigzag pattern. It iterates through the input string, appending each character to the appropriate StringBuilder based on the current row index and a step variable that alternates between 1 and -1 to change direction. Finally, it concatenates all the StringBuilders to form the zigzag string.

          - Time Complexity: O(n) because the code iterates through the input string of length n once to build the zigzag pattern.  The concatenation of the StringBuilder array at the end also takes linear time.
          - Space Complexity: O(n) because the space used is proportional to the length of the input string. The StringBuilder array stores characters from the input string. In the worst case (numRows=1), it uses O(n) space.
          