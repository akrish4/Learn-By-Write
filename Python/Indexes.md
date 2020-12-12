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
