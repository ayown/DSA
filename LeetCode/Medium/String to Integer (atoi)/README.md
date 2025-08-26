8. String to Integer (atoi)SolvedMediumTopicsCompaniesImplement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:


	Whitespace: Ignore any leading whitespace (" ").
	Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
	Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
	Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.


Return the integer as the final result.

 
Example 1:


Input: s = "42"

Output: 42

Explanation:

The underlined characters are what is read in and the caret is the current reader position.
Step 1: "42" (no characters read because there is no leading whitespace)
         ^
Step 2: "42" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "42" ("42" is read in)
           ^



Example 2:


Input: s = " -042"

Output: -42

Explanation:

Step 1: "   -042" (leading whitespace is read and ignored)
            ^
Step 2: "   -042" ('-' is read, so the result should be negative)
             ^
Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)
               ^



Example 3:


Input: s = "1337c0d3"

Output: 1337

Explanation:

Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
         ^
Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)
             ^



Example 4:


Input: s = "0-1"

Output: 0

Explanation:

Step 1: "0-1" (no characters read because there is no leading whitespace)
         ^
Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
         ^
Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)
          ^



Example 5:


Input: s = "words and 987"

Output: 0

Explanation:

Reading stops at the first non-digit character 'w'.


 
Constraints:


	0 <= s.length <= 200
	s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.

 Seen this question in a real interview before?1/5YesNoAccepted2,106,533/10.7MAcceptance Rate19.7%TopicsStringCompaniesSimilar QuestionsReverse IntegerMediumValid NumberHardCheck if Numbers Are Ascending in a SentenceEasyDiscussion (803)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestlazurAug 03, 2019I mean. Like seriously.
Submit...
: yeah need to take care of this case
Submit...
: K got to handle this as well
Submit...
: ...Are you kidding me? Read more1.3K19Chandrashekar ChimbiliFeb 07, 2018Who ever wrote the problem had some major problems with his wife and is trying to take out his frustration on people who are sincerely trying to prepare for interview.
Excepted answer for test case "   -1123u3761867" is -1123. Who in this sane world would expect such an answer. If the string contains any value other than a digit, then the entire string is supposed to be invalid. Any mindful implementation of parser written in any programming language doesn't return the above answer. Every compiler would throw an exception. Who ever came  up with the requirements. Please find a better job. This is not for you. Read more1K22Bret WilliamsNov 11, 2020Input  "00000-42a1234"
My output -42
Expected output 0
The requirements don't cover this scenario "Ignore leading zeroes until you get a number but if you get a character next that isn't a number then return zero."  This is a frustrating puzzle trying to guess how to interpret the requirements. Read more41419CoderKorraAug 28, 2021Too many frustrating edge cases
Too irrelevant and useless
absolutely senseless question
it will add absolutely no value at all to your skills
you could utilise the time in doing 2-3 real questions instead
there's a reason this question is so down voted, it sucks, skip it. Read more4258Siddhant AryaJan 14, 2022Can anyone please tell me that why the output of the below test case should be 0, because according to me the output should be 987
"words and 987"
See the below image:
 Read more14722karimo94Sep 26, 2018I don't understand the expected return of this test case. I even tried it on the C atoi() function and it returned the correct ouput I had. My solution matches the C atoi() functionality and returns the same value. Anyone else have this issue?
Input: "-91283472332"
Output: -1089159116
Expected: -2147483648 Read more14510mrn_cpNov 12, 2021So many edge cases (feel like stupid).....should have avoid this..... Read more572shakeelsDec 01, 2022I can see why so many hate this problem and that it has more dislikes than likes. I hate to disagree though - it is not a bad problem. Nor a difficult one. It is just plain outright irritating - like many real life problems. You write input field validators for every possible use-case and the the code passes QA and goes to production and (guess what?) the user enters a values that no sane or sober person would ever do.
This has everything from a real job - unrealistic requirements from product owners, over the top expectations from the management and a fat-fingering user (possibly fat). If you are looking for a real job then better get used to solving such problems without getting frustrated (and taking it out on your family).
There is a sado-masochistic side of me that likes this problem and the Deterministic Finite Automaton approach to solve such problems was a cherry on top. Read more532Dmitry GorelovMar 31, 2019test case: "+-2"
I return -2.
Expected answer is 0.
????
Lets check description of a problem:
The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function. Read more416Hejia PanOct 27, 2014I was quite surprises to see this test case:

Input:	"   -115579378e25"


Output:	-2147483648


Expected:	-115579378

since -115579378*10^25 definitely caused underflow. I tried atoi("1e3") which gives me 1. Based on those test cases, I believe 'e' is invalid.
It would be very helpful to let the user know 'e' is invalid since in problem "Valid Number", 'e' is totally acceptable. Read more302123481Copyright © 2025 LeetCode. All rights reserved.