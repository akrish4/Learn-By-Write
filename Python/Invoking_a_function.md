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


So, the first call `prints` one string, the second call of `print` without arguments prints, in fact, an empty line, and the last call outputs our two messages as one expression. Are you surprised by these results? Then you may learn how the print function works in more detail from its documentation. The Python documentation contains all sorts of information about the function of your interest, for example, which arguments it expects.





