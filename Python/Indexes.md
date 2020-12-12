There are several types of collections to store data in Python. Positionally ordered collections of elements are usually called sequences, and both lists and strings 
\belong to them. Each element in a list, as well as each character in a string, has an index that corresponds to its position. Indexes are used to access elements 
within a sequence. Indexing is zero-based, so if you see a person who counts from zero, 
you must have met a programmer.

# Indexes of elements
To access an element of a list by its index, you need to use square brackets. 
You add the brackets after the list and, between them, you write the index of an element you want to get.

Don't forget, the indexes start at 0, so the index of the first element is 0. The index of the last element is equal to `len(list) - 1`.

Let's take a look at the example below:

```python
colors = ['red', 'green', 'blue']

first_elem = colors[0]   # 'red'
second_elem = colors[1]  # 'green'
third_elem = colors[2]   # 'blue'
```

Strings work in the same way:

```python
pet = "cat"

first_char = pet[0]   # 'c'
second_char = pet[1]  # 'a'
third_char = pet[2]   # 't'
```

# Potential pitfalls
When using indexes, it's important to stay within the range of your sequence: you'll get an error (called IndexError) if you try to access an element with a non-existing index!

```python
colors = ['red', 'green', 'blue']
pet = "cat"

print(colors[3])  # IndexError: list index out of range
print(pet[3])     # IndexError: string index out of range
```
There is one more obstacle in your way. Imagine that you want to change one of the elements in a list. It can be easily done:

```python
colors = ['red', 'green', 'blue']

colors[1] = 'white'
print(colors)  # ['red', 'white', 'blue']
```
