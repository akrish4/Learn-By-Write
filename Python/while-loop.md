# While loop
Sometimes one iteration (=execution) of a statement is not enough to get the result you need. That is why Python offers a special statement that will execute a block of code several times. Meet the loop command and one of the universal loops — the while loop.

People generally don't choose Python to write fast code. The main advantages of Python are readability and simplicity. As the while loop requires the introduction of extra variables, iteration takes up more time. Thus, the while loop is quite slow and not that popular. It resembles a conditional operator: using the while loop, we can execute a set of statements as long as the condition is true.

The condition itself (2) is written before the body of the loop (some call it the conditional code) and is checked before the body is executed. If the condition is true (3a), the iterations continue. If the condition is false (3b), the loop execution is terminated and the program control moves further to the next operation.
## Visualization
If we visualize the while loop, it’ll look like this

```python
number = 0
while number < 5:
    print(number)
    number += 1
print('Now, the number is equal to 5')
```
