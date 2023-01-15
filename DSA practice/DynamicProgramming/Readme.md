# Dynamic Programming

1. Aditya verma playlist practice

2. will be implementing all patterns of dp covered there

3. Then will complete, dp mentioned in cracking coding interview.


**Note to identify DP problem**:
DP problems will have choice and optimal:
1. Choose to include that node or not (recursion)
2. Find max, min, largest, etc.


### 0-1 Knapsack problems list
+ Subset sum
+ Equal sum partition
+ count of subset sum 
+ min subset sum diff
+ Target sum
+ #\ of subset given diff

Problem stmt :

You have list of Items
with their respective weight and values

you have a bag, with limited Weight capacity.

You need to choose items, to maximise total value in bag.

**Fractional**:
simple solution, in greedy.

**0/1 KS**:
Item is
 0 -> outside bag
 1 -> inside the bag

 input:

 w[] -> [   1   3   4   5   ]
 V[] -> [   1   4   5   7   ]
 W -> 7 _maxWeight_
 
 Output:
 find max profit.

**Recursive Solution**:

1. Smallest possible input:

empty arr for weight and Value or Weight capacity is 0 :
return 0 as max Value

_code_:
if(n==0 || W == 0)
    return 0;

2. Choice part :

For each item, we have a choice to include it or not,

Lets assume, you had 5 items,
assume you have optimally filled items from first four.

now, when you are on 5th item, 
to choose either to include or not depends on following.

w5 < W ?
False -> 
    Cant include [Max value remains same as previous]

True ->
    Compare following and update max
        * Including is optimal solution
        * Not including is optimal as other better possibility.

Thats all !

**Memoization**:

Create a grid n*m for dp

how to decide  n and m value

-> Find whose values keep on changing in the recursive calls
-> W updated when we included currentItem
-> n kept on decreasing

so create T[n][W] -> 
loop Arrays.fill(t[i],-1) over t

jst before each recursive call check, if value already exists in Matrix

**Generating Top down approach from Recursive

|   *   |  Memoization  | Top Down   |
| ------------- | ------------- |:-------------:|
| initialize |  base condition     | top row and first column zero |
| choice include      | max function of recursive      | max func from t matrix |





















