# Comments
In HTML files, you can write a special text which the browser will ignore when opening the file. Such text is called a comment. Why write it if in the end it is simply and deliberately ignored? It actually makes a lot of sense to use comments during the process of development as they can greatly improve the readability of the code.

A comment in HTML code can be generally defined as follows:


```
<!-- Any text -->
```
Any text placed in <!-- and --> will be considered a comment. The text of the comment can be placed either on a single line or several
`Comments can be used anywhere on the page except the <title> tag.`

# One-line comments
Comments that occupy one line are called one-line comments. Take a careful look at the syntactic features of one-line comments:

```
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>One-line comments</title>
  </head>
  <body>
    <!-- It's a one-line comment -->
    <p>It's a paragraph of the text</p>
  </body>
</html>
```

The result in the browser will look as follows:

<img src="https://ucarecdn.com/3c005cb0-89d6-478d-81f0-aa93f2c86af1/-/crop/521x165/67,27/-/preview/">

As you can see, the comment text is not displayed in the browser window. It is invisible for visitors of web pages, but can be very useful for developers. With these notes you can easily remember later why some particular code fragment is needed. Comments can also serve as hints for other developers who will work with your code later on.

# Multi-line comments
Comments that take up several lines are called multi-line comments. Take a look at their syntactic features:

```
<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title>Multi-line comments</title>
  </head>
  <body>
    <!-- 
    It's 
    a multi-line comment 
    -->
    <p>It's a paragraph of the text</p>
  </body>
</html>
```

