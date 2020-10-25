# Integer arithmetic
 - In real life, we often perform arithmetic operations. They help us to calculate the change from a purchase, determine the area of a room, count the number of people in a line, and so on. The same operations are used in programs.

## Basic operations 
 #### Python supports basic arithmetic operations
 - addition +
 - subtraction -
 - multiplication *
 - division /
 - integer division //
 #### The examples below show how it works for numbers.

       print(10 + 10)   # 20
       print(100 - 10)  # 90
       print(10 * 10)   # 100
       print(77 / 10)   # 7.7
       print(77 // 10)  # 7
 #### There is a difference between division / and integer division //. The first produces a floating-point number (like 7.7), while the second one produces an integer value (like 7) ignoring the decimal part.

##### Python raises an error if you try to divide by zero.

      ZeroDivisionError: division by zero
## Writing complex expressions
Arithmetic operations can be combined to write more complex expressions:

       print(2 + 2 * 2)  # 6
Like in arithmetic, parentheses can be nested inside each other. You can also use them for clarity.

The minus operator has a unary form that negates the value or expression. A positive number becomes negative, and a negative number becomes positive       

    print(-10)  # -10
    print(-(100 + 200))  # -300
    print(-(-20))  # 20
 ## Other operations
   The remainder of a division. Python modulo operator % is used to get the remainder of a division. It may come in handy when you want to check if a number is even. Applied to    2, it returns 1 for odd numbers and 0 for the even ones.
  
    print(7 % 2)  # 1, because 7 is an odd number
    print(8 % 2)  # 0, because 8 is an even number
#### Here are some more examples:

    # Divide the number by itself
    print(4 % 4)     # 0
    # At least one number is a float
    print(11 % 6.0)  # 5.0
    # The first number is less than the divisor
    print(55 % 77)   # 55
    # With negative numbers, it preserves the divisor sign
    print(-11 % 5)    # 4
    print(11 % -5)    # -4
***Taking the remainder of the division by 0 also leads to ZeroDivisionError.***
##### The behavior of the mod function in Python might seem unexpected at first glance. While 11 % 5 = 1 and -11 % -5 = -1 when both numbers on the left are of the same sign, 11 % -5 = -4 and -11 % 5 = 4 if we have one negative number. The thing is, in Python, the remainder always has the same sign as the divisor.
##### In the first case, 11 % -5 = -4, as the remainder should be negative, we need to compare 15 and 11, not 10 and 11: 11 = (-5) * (-3) + (-4). In the second case, -11 % 5 = 4, the remainder is supposed to be positive: -11 = 5 * (-3) + 4.
#### Exponentiation. Here is a way to raise a number to a power:

    print(10 ** 2)  # 100
