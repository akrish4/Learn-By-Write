number = int(input())
# put your python code here
first_number = number // 100
second_number = (number - first_number * 100) // 10
third_number = (number - first_number * 100 - second_number * 10) // 1
print(first_number + second_number + third_number)


# question: Given a three-digit integer (i.e. an integer from 100 to 999). Find the sum of its digits and print the result.

# input 
# 476



# output
# 17
