Task #1. 

  If we from correct arithmetic expression, which contains numbers, signs of operations and the opening and closing parentheses throw numbers and symbols operations, and then write down the remaining brackets in the expression without spaces between them, the result is called a right bracket expression [bracket expression "(()(()))" - right expression, and  "()(" and "())(" - wrong expression].
Please, find number of right bracket expression, which containing N opening and N closing parentheses. N entered from the keyboard. N non-negative integer.

Example:
N =  1 (one parenthesis the opening and closing) - answer 1
()
)(
))
((
Only one correct version.

For the entered number 2 - 2 :
()()
(())
I.e. only two versions, when all opening and closing parentheses is properly opened / closed.
And so on.

Task #2. 

  You are given a list of cities. Each direct connection between two cities has its transportation cost (an integer bigger than 0). The goal is to find the paths of minimum cost between pairs of cities. Assume that the cost of each path (which is the sum of costs of all direct connections belongning to this path) is at most 200000. The name of a city is a string containing characters a,...,z and is at most 10 characters long.2) 

Input

s [the number of tests <= 10]
n [the number of cities <= 10000]
NAME [city name]
p [the number of neighbours of city NAME]
nr cost [nr - index of a city connected to NAME (the index of the first city is 1)]
           [cost - the transportation cost]
r [the number of paths to find <= 100]
NAME1 NAME2 [NAME1 - source, NAME2 - destination]
[empty line separating the tests]

Output

cost [the minimum transportation cost from city NAME1 to city NAME2 (one per line)]

Example

Input:
1
4
gdansk
2
2 1
3 3
bydgoszcz
3
1 1
3 1
4 4
torun
3
1 3
2 1
4 1
warszawa
2
2 4
3 1
2
gdansk warszawa
bydgoszcz warszawa

Output:
3
2


Task #3.
  
  Find the sum of the digits in the number 100! (i.e. 100 factorial) 
{Correct answer: 648}
