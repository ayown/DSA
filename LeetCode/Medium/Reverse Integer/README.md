7. Reverse IntegerSolvedMediumTopicsCompaniesGiven a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 
Example 1:

Input: x = 123
Output: 321


Example 2:

Input: x = -123
Output: -321


Example 3:

Input: x = 120
Output: 21


 
Constraints:


	-231 <= x <= 231 - 1

 Seen this question in a real interview before?1/5YesNoAccepted4,320,217/14.1MAcceptance Rate30.7%TopicsMathCompaniesSimilar QuestionsString to Integer (atoi)MediumReverse BitsEasyA Number After a Double ReversalEasyCount Number of Distinct Integers After Reverse OperationsMediumDiscussion (581)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestzherebetskyySep 12, 2019Looks like the test-values have invalid test cases for x:
1534236469, 1563847412 and -1563847412
Because all these numbers are within the required range [-2^31 ; 2^31 -1] Read more52834WeichengNov 28, 2015Input:
1534236469
Output:
9646324351
Expected:
0
I submit my code,but it give a tip like that. Read more28523shiyinayurikoMar 29, 2016for the input of '1534236469'
Js can easily return '9646324351', not zero. Read more1037hh548Dec 05, 2014Here is what I got:
Input:	1534236469
Output:	1056389759
Expected:	0
I believe an int is not sufficient and the output is exceeding the limit of an 32-bit integer. Read more8312Yixian115Jun 07, 2015Number in Python doesn't have limit, either the input or output number won't overflow anyway.
But OJ still requires 0 as outcome of the huge reversed number. Read more786NettttSep 29, 20201534236469 < 2^31 should return the reverse, but the solution from test case was 0. Please check. Thanks! Read more694zhaozhongyu_Sep 12, 2015The problem should tell us that when the num is out of range of int, then we need to return 0 Read more683mddrillFeb 18, 2020Most of the solutions here handle the overflow case by storing the value in a long and checking if that long is over Integer.MAX_VALUE, but the problem clearly says we must assume the environment can only store 32 bit ints. If we could store longs we wouldn't have to worrry about 32 bit int overflow in the first place. Read more49pheonixJul 09, 2019Input:
1534236469
Output:
1056389759
expected:
0 Read more414alexargAug 01, 2015Does it really makes sense to emulate overflow in JavaScript? There is no int in JS. Number type is a floating point type. If overflow has to be simulated, "integer" cell size should be defined as something in the task, e.g. double word. Read more1092123459Copyright © 2025 LeetCode. All rights reserved.