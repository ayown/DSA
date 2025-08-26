12. Integer to RomanSolvedMediumTopicsCompaniesSeven different symbols represent Roman numerals with the following values:

SymbolValueI1V5X10L50C100D500M1000

Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:


	If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
	If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
	Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.


Given an integer, convert it to a Roman numeral.

 
Example 1:


Input: num = 3749

Output: "MMMDCCXLIX"

Explanation:

3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
 700 = DCC as 500 (D) + 100 (C) + 100 (C)
  40 = XL as 10 (X) less of 50 (L)
   9 = IX as 1 (I) less of 10 (X)
Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places



Example 2:


Input: num = 58

Output: "LVIII"

Explanation:

50 = L
 8 = VIII



Example 3:


Input: num = 1994

Output: "MCMXCIV"

Explanation:

1000 = M
 900 = CM
  90 = XC
   4 = IV



 
Constraints:


	1 <= num <= 3999

 Seen this question in a real interview before?1/5YesNoAccepted1,836,870/2.7MAcceptance Rate69.2%TopicsHash TableMathStringCompaniesSimilar QuestionsRoman to IntegerEasyInteger to English WordsHardDiscussion (178)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestetanilaJan 24, 2024I am now at a 600 problems solved mark.
It's fun to revisit these first problems that seemed so hard months ago. Really makes you appreciate all the time and effort you've put in solving LeetCode, and realize HOW MUCH you've leaned.
Stay motivated! Read more47423sulicnMay 18, 2023Can I report those idiots that are still posting solutions here? Read moreTip5184Sayani JoddarDec 07, 2023Never thought I was THIS dumb. Read more2091LuojihenchaJan 16, 2020I paied a lot of money for leetcode......and still there is no answer. Leetcode please, all questions are hard for me. Read more985ChenxiLuOct 14, 2024The Romans did appear lacking a vision for scalability when designing this system. Read more781NodirDec 07, 2013I know the easy way of solving this problem is using 23 case statements (10 for numbers [1-10], 10 for [10-100], 10 for [1000-3000]). But the code does not look good and it's getting bit long. I'm thinking even applying the rules for converting may also make the code complex. Any suggestions? Read more405YumikoMay 26, 2025Roman to Integer 🤡
Integer to Roman 💀 Read more351Yura HrynivDec 29, 2022I bought leetcode subscription but this problem seems very hard to me :((. Unsubscribe, I thought I would get into FAANG Read more303Sumant YadavMar 25, 2024Some tips that might help:
Understand the rules of Roman numeral representation, especially the cases where subtraction is used.
Store the integer values and their corresponding Roman numeral representations.
Try to break down the integer into its place values (ones, tens, hundreds, and thousands) to construct the Roman numeral representation step by step.
Thanks! Read moreTip291Shubham SavajDec 27, 2023After a refreshing mini-break, tackling this question not only provided me with a sense of accomplishment but also sparked a wave of satisfaction. Solving challenges has a way of turning ordinary moments into thrilling victories! Read more19123418Copyright © 2025 LeetCode. All rights reserved.