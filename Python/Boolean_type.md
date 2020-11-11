# Boolean type
The Boolean type, or simply bool, is a special data type that has only two possible values: True and False. In Python the names of boolean values start with a capital letter.

In programming languages the boolean, or logical, type is a common way to represent something that has only two opposite states like on or off, yes or no, etc.

If you are writing an application that keeps track of door openings, you'll find it natural to use bool to store the current door state.
     
     is_open = True
     is_closed = False

     print(is_open)    # True
     print(is_closed)  # False
# Boolean operations
There are three built-in boolean operators in Python: and, or and not. The first two are binary operators which means that they expect two arguments. not is a unary operator, it is always applied to a single operand. First, let's look at these operators applied to the boolean values.
 - There are three built-in boolean operators in Python: and, or and not. The first two are binary operators which means that they expect two arguments. not is a unary operator, it is always applied to a single operand. First, let's look at these operators applied to the boolean values.
       
       a = True and True    # True
       b = True and False   # False
       c = False and False  # False
       d = False and True   # False
 - or is a binary operator, it returns True if at least one argument is true, otherwise, it returns False.
         
       a = True or True    # True
       b = True or False   # True
       c = False or False  # False
       d = False or True   # True
 - not is a unary operator, it reverses the boolean value of its argument.
              
       to_be = True           # to_be is True
       not_to_be = not to_be  # not_to_be is False
# The precedence of boolean operations
Logical operators have a different priority and it affects the order of evaluation. Here are the operators in order of their priorities: not, and, or. So, not is considered first, then and, finally or. Having this in mind, consider the following expression:
