2. Add Two NumbersSolvedMediumTopicsCompaniesYou are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 
Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.


Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]


Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]


 
Constraints:


	The number of nodes in each linked list is in the range [1, 100].
	0 <= Node.val <= 9
	It is guaranteed that the list represents a number that does not have leading zeros.

 Seen this question in a real interview before?1/5YesNoAccepted6,114,997/13.1MAcceptance Rate46.8%TopicsLinked ListMathRecursionCompaniesSimilar QuestionsMultiply StringsMediumAdd BinaryEasySum of Two IntegersMediumAdd StringsEasyAdd Two Numbers IIMediumAdd to Array-Form of IntegerEasyAdd Two Polynomials Represented as Linked ListsMediumDouble a Number Represented as a Linked ListMediumDiscussion (950)Choose a typeComment💡 Discussion Rules1. Please don't post any solutions in this discussion.2. The problem discussion is for asking questions about the problem or for sharing tips - anything except for solutions.3. If you'd like to share your solution for feedback and ideas, please head to the solutions tab and post it there.Sort by:BestVinay Kumar patApr 09, 2019Hello all,
I'm new coding and noob in using classes. why no one is writing int main() in their codes. Definetly there will be different versions in the main() i.e taking input from STDIN, passing arguments to class etc. Read more83976AlgoEngineApr 29, 2023Video visualizing how a hash table can reduce the runtime from O(n^2) to O(n):
 Read more46812winstonchiMar 10, 2016In interview, I was asked what if duplicates exists.. How do we handle this?
My original thought is worst case nums = [1,1,1,1] target is 2
then the complexity if N^2... Is it true?
Is there any way to improve this? Read more27751CafogarN4May 24, 2024Not that easy Read more1947AlexTheGreatNov 04, 2014Can't find a better place to ask this...
Every time I passed a problem, it's marked with a green check mark.
If I want to redo all the problems for the second round, is there a way to "reset" all the marks? Read more16517Xu ZHANGMay 13, 2016We can see a lot of HashMap solutions using a HashMap to store the number as the key and the index as the value.
Many people will come up the same questions that what if there have duplicate numbers in the array?
Well, it's not a problem at all. Because in the description, it says there is exactly one solution. I will prove it here:


Say we have three N1 in the array like this [N1, N2, N1, N3, N1], then N1 will not be part of the result with N2 or N3, since if N1 is part of the result, then we have three solutions which go against the description. N1 cannot be part of result with itself neither since then we have three solutions again. So in this case, we do not care duplicates at all.


So the only possible situation that the N1 can be the result is: N1 MUST only have two of them, and the target MUST be 2 * N1, then we have an array like this: [N1, N2, N1], and a target like this 2 * N1. In this case, after building up the map, N1's index will be the right most one which is 2. Then when we start from the first N1 at index 0, we do (target - N1) and get N1, and then query the N1's index in the array, which is 2, and then we can get the result which is [0, 2] with no problem.

 Read more1417CodeBumblebeeJun 11, 2024this is easy? im cooked Read moreFeedback842Ming YueJan 15, 2014O(n^2) I got Time Limit Exceed. Does anyone got accept by O(n^2) ? I just use binary search and finally accept. Read more5824shaguvFeb 01, 2015Sorry for the newbie question: is there any way to read the test cases for a given problem? Even after having validated it, I couldn't find how to access them.
PS: At the moment of posting this general question, I realize I need to assign it a particular problem as a category. So I guess this is the wrong place to ask. Could you redirect me to some "meta" forum? Read more781Mikhail LachikhinNov 19, 2019Hello there. This is my first time solving problems on leetcode and I ran into a problem. The output of my code is [0, 1], and the output expected is [0,1]. But yet, site says im wrong. Also I see my output in "stdout", not in the "Output" line. I used "print()" method for output. How should I do it instead? image Read more68171234153Copyright © 2025 LeetCode. All rights reserved.