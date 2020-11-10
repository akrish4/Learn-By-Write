# Program with numbers
## Reading numbers from user input
 You  might have become familiar with the input() function in Python, it's hardly new to you that any data passed to this function is treated as a string. But how should we deal with numerical values? As a general rule, they are explicitly converted to corresponding numerical types:
       
     integer = int(input())
     floating_point = float(input())
## Free air miles
Imagine you have a credit card with a free air miles bonus program (or maybe you already have one). As a user, you are expected to input the amount of money you spend on average from this card per month. Let's assume that the bonus program gives you 2 free air miles for every dollar you spend. Here's a simple program to figure out when you can travel somewhere for free:
      
    # the average amount of money per month
    money = int(input("How much money do you spend per month: "))

    # the number of miles per unit of money
    n_miles = 2

    # earned miles
    miles_per_month = money * n_miles

    # the distance between London and Paris
    distance = 215

    # how many months do you need to get
    # a free trip from London to Paris and back
    print(distance * 2 / miles_per_month)
    
This program will calculate how many months you need to travel the selected distance and back.
## Advanced forms of assignment
 Whenever you use an equal sign =, you actually assign some value to a name. For that reason, = is typically referred to as an assignment operator. Meanwhile, there are other assignment operators you can use in Python. They are also called compound assignment operators, for they carry out an arithmetic operation and assignment in one step. Have a look at the code snippet below:
       
       # simple assignment
       number = 10
       number = number + 1  # 11
 This code is equivalent to the following one:
      
    # compound assignment
    number = 10
    number += 1  # 11
