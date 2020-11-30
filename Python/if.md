# if statement
There are situations when your program needs to execute some piece of the code only if a particular condition is true. Such a piece of the code should be placed within the body of an if statement. The pattern is the same as in the English language: first comes the keyword if , then a condition, and then a list of expressions to execute. The condition is always a Boolean expression, that is, its value equals either True or False. Here is one example of how the code with a conditional expression should look like:

```python
biscuits = 17
if biscuits >= 5:
    print("It's time for tea!")
```

Note that the condition ends with a colon and a new line starts with an indentation. Usually, 4 spaces are used to designate each level of indentation. A piece of code in which all lines are on the same level of indentation is called a block of code. In Python, only indentation is used to separate different blocks of code, hence, only indentation shows which lines of code are supposed to be executed when the if statement is satisfied, and which ones should be executed independently of the if statement. Check out the following example:

```python
if biscuits >= 5:
    print("It's time for tea!")
    print("What tea do you prefer?")
print("What about some chocolate?")
```
