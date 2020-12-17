#  Invoking a function🤔😃
Even though invoking functions in Python is not about casting a spell or the like, it does sometimes work wonders. Let's start with the concept. Basically, a function is a structured fragment of code we may want to use in more than one place and more than one time. For another thing, functions allow us to read both our code and that of someone else way better. Haven't they become your favorite yet?

Here is a simple function call:

`multiply(1, 7)`

Here multiply is the name of the function, and numbers in parentheses (1, 7) are its arguments. What is an argument? Well, it's just a value, that will be used inside the body of the function. Let's go deeper into it!



# Invoking print()
To call, or invoke, a function in your program, simply write its name and add parentheses after it. That's all it takes! Fun fact: if you've ever typed an expression like this `print("Hello, world!")`, you already know a little about functions. In this tiny example, however, we see the message `"Hello, world!"` in the parentheses after the name of the `print` function. What does it mean? This string is just an argument. And more often than not, functions do have arguments. As for the `print` function, we may as well use it with no argument at all or even with multiple arguments:



```python
print("Hello, world!")
print()
print("Bye,", "then!")
```

And here is the output:

```python
Hello, world!

Bye, then!
```


So, the first call prints one string, the second call of `print` without arguments prints, in fact, an empty line, and the last call outputs our two messages as one expression. Are you surprised by these results? Then you may learn how the `print` function works in more detail from its documentation. The Python documentation contains all sorts of information about the function of your interest, for example, which arguments it expects.




# Built-in functions
Functions can make life easier, provided one is aware of their existence. Many algorithms are already written, so there is no need for reinvention, except perhaps for educational purposes. The Python interpreter has a number of functions and types built into it, so they are always available. Currently, the number of built-in functions amounts to 69 (in the latest version Python 3.8). Some of them are used to convert the object type, for example, str() returns a string, int() returns an integer, float() returns a floating-point number. Others deal with numbers: you can round() them and sum() them, find the minimum min() or the maximum max(). Still others give us information about the object: its type() or length len(). Let's consider them in action

In the following example, len() counts the number of characters in the string (the same goes for any sequence).

```python
number = "111"

# finding the length of an object
print(len(number))  # 3
```

Then we declare the variables integer and float_number and write their sum into my_sum. By the way, the sum() function also deals with sequences.

```python
# converting types
integer = int(number)
float_number = float(number)
print(str(float_number))  # "111.0"

# adding and rounding numbers
my_sum = sum((integer, float_number))
```

The result is a floating-point number, which becomes clear after printing `my_sum`.


```python
print(my_sum)  # 222.0
print(round(my_sum))  # 222
```

Furthermore, you can see how to find the minimum and maximum values: the smallest number equals 111 and the largest number 222.0 belongs to floats .


```python
# finding the minimum and the maximum
print(min(integer, float_number))  # 111
print(type(max(integer, float_number, my_sum)))  # <class 'float'>
```

# Recap

Let's make a brief summary:

- functions are meant to be reusable, which means we are free to apply it multiple times with different arguments,
- to call a function write its name followed by parentheses and place the arguments within,
- normally, a function has documentation, which sometimes might be of huge help.

