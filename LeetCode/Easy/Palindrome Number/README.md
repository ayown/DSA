9. Palindrome NumberSolvedEasyTopicsCompaniesHintGiven an integer x, return true if x is a palindrome, and false otherwise.

 
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.


Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.


Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


 
Constraints:


	-231 <= x <= 231 - 1


 
Follow up: Could you solve it without converting the integer to a string? Seen this question in a real interview before?1/5YesNoAccepted6,850,173/11.5MAcceptance Rate59.5%TopicsMathCompaniesHint 1Beware of overflow when you reverse the integer.Similar QuestionsPalindrome Linked ListEasyFind Palindrome With Fixed LengthMediumStrictly Palindromic NumberMedium  Count Symmetric IntegersEasyFind the Count of Good IntegersHardFind the Largest Palindrome Divisible by KHardDiscussion (607)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestprincejacobOct 18, 2021Folks, like many of you (maybe?) I stumbled on this question.  It's categorized as Easy.  Sure...easy if you know the answer.  The challenge is, you can't (shouldn't) convert the integer to a string.  Why?  Because the question is about math.
They're not looking for substring manipulation, they're looking for integer manipulation. Read more1238rellikSep 05, 2014I am wondering how the other people got their code ACed, the testing result of "-2147447412" seems a little odd to me. Should it be a palindromic number or not?
Note: I believe the range of int is [-2147483648, 2147483647] and "-2147447412" is not overflowed, plus I handled the overflow cases already (test case "-2147483648" in particular).
11499 / 11502 test cases passed.
Status: Wrong Answer
Input:	-2147447412
Output:	true
Expected:	false

Here's my second question:
Why does the function take "int" as input instead of "unsigned int", when we assume all negative numbers are NOT palindromic. Read more15815Sudheer MishraDec 10, 2022what the hell output is whats wrong with my code
int rev=0;
if(x<0){
return false;
}
while(x!=0){
rev= rev*10 + x%10;
x=x/10;
}
if(x!=rev){
return false;
}
return true;
it gives wrong for 121 test case my output is false.. Read more4847Jian LiFeb 27, 2015If it says O(1) space I can understand how to do that, but what does no "extra space" mean? If I use another integer to save the reversed number does it mean I'm still using extra space? Or when I simply am using an integer i for loop does it mean I have extra space? Read more304ABHINAV ANANDApr 02, 2023A small hint for negative numbers, return false. Read more292camoverrideNov 20, 2020Reversing the number and checking whether it equals the un-reversed version is a test of your coding ability, and might appear in a basic coding interview. The "don't convert to a string" variation will NEVER appear in an interview and is a bullshit question. Here's why:

You solved the problem by stringifying it. Why overthink things and use complicated and hard-to-debug math?
The "algorithmic" component of this is NOT part of a broader problem-solving paradigm in comptuer science (think of dynamic programming, graph algorithms, etc). Rather, it's a one-off math trick.
 Read more36cherishlcSep 10, 2015If a number is a palindrome,,  its reverse equals itself.
Which means its reverse is NOT overflow!!!
So that ' reversed integer might overflow'  doesn't matter at all, since a overlowed number isn't a palindrome.
Now the question becomes whether a NONE palindrome  == its reverse if we do NOT deal with overflow. Read more202MR_BITNov 14, 2021 Read more232CandyRobberyDec 13, 2015

Impossible to solve without extra space. Always need space for constants, variables or whatever. Recursion calls will take space for call stack.


If you are talking about constant space, then even declaring a string / stack will take constant space. (In fact at most (log(10, INT_MAX) * sizeof char), which is no worse than declaring an integer or more). Actually, even recursion will take constant space.

 Read more154daniel_9650May 13, 2024Kind of a nitpick, but why even include negative numbers as inputs if all of them are NOT palindromes by this problem's own standards? Its just an extra line of code you have to add to check for this case. Read more13123461Copyright © 2025 LeetCode. All rights reserved.