# Comparison operators
Comparison or relation operations let you compare two values and determine the relation between them. There are ten comparison operators in Python:
- `<` strictly less than
- `<=` less than or equal
- `>` strictly greater than
- `>=` greater than or equal
- `==` equal
- `!=` not equal
- `is` object identity
- `is not` negated object identity
- `in` membership
- `not in` negated membership

The result of applying these operators is always bool.
# Comparing integers
 only integer comparison.

```python
a = 5
b = -10
c = 15

result_1 = a < b   # False
result_2 = a == a  # True
result_3 = a != b  # True
result_4 = b >= c  # False
```
Any expression that returns integer is a valid comparison operand too:

```python
calculated_result = a == b + c  # True
```
Given the defined variables a, b and c, we basically check if 5 is equal to -10 + 15, which is true.
