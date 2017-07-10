# Tutorial 1
#### COMP 1006/1406 Summer 2017
---

## Objectives  
Basic Java programming: input, output, arrays, Strings, control flow. 

## Attendance Quiz

Please log on to cuLearn using on of the computer in the tutorial room and complete the attendance quiz. You can only access the quiz if you log in using one of the computers in the lab. You cannot use a laptop for this. This is a time limited quiz. Be sure to do this as soon as you arrive.

At the end of the tutorial a TA will assign you a grade, call it G, which is 0, 1 or 2, depending on the progress you make during the tutorial. If you spend your time reading mail and chatting with your friends you will receive 0. If you have completed the attendance quiz on time then G will be your tutorial grade. If you have not completed the attendance quiz on time, then your tutorial grade will be max(0, G - 1/2). Each tutorial grade will therefore be one of 0, 0.5, 1.5 or 2.

## Play Computer [10 minutes]  

Reading and reading comprehension are essential skills to have with any language (human language or computer language). While the focus of most computer science courses is writing (correct) programs it is also essential to be able to read and understand code.

One important skill is to be able trace the execution of code. I'll call this _play computer_ in this course, as you will play the role of the computer running the code. You __will__ be asked to play computer on the midterms and final exam so be sure you practice.

You should not spend more than 10 minutes on this problem in the tutorial. 

```
int n = ???;
int x = 4;
int y = 9;
   
int count = 0
for(int i=0; i<x; i+=1){
   if( y + 2*i >= n){
      count += 1;
      y = y - x;
   }else{
      y = y + x;
   }
}
   
System.out.println( count + "," + y);
```

What is printed when the value of `n` is initialized to 14?

## Bugs
In some tutorials, we will provide you with one more Java "programs" that have 
some bugs in them.  They might be compile-time errors, run-time errors, or logical errors (a flaw in the logic of the program). Your task will be to find the bugs and fix the programs.

Try to compile and run the `Bugs1.java` file. The `Bugs1` program is supposed to be like the hello world program you are familiar with.  

If you are using   DrJava, the error message might be a bit confusing. Using an IDE, such a DrJava, can help to make programming easier.  But, they are also software themselves and might have their own bugs associated with them or might not always work perfectly. In this case, in the Interactions window, after compiling the program, trying typing `java Bugs1` instead of `run Bugs1`.  The use of `run` is just a feature of DrJava to make running programs simpler but it is not exactly the same as using `java Bugs1`. The error message when calling the JVM directly (using java instead of run) in this case is more informative than DrJava's run command. 
 
Try to compile and run `Bugs2.java`. Where exactly did the program  crash? The compiler tells you this information.  The error message you get should look  something like 

```
java.lang.NullPointerException
   at Bugs2.main(Bugs2.java:20)
   at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
   at sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)
   at sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)
   ...
```

The first line tells you what kind of error crashed the program and the second linetells you exactly where in the code the program crashed.  Thus, we know it crashed in the class `Bugs2`, in the `main` method, on line 20.

Even when you know which line a program crashes on, we might not know exactly where in that line the problem is. Try modifying the offending line (line 20) in the program to be two lines: 

```
System.out.println("words[i] is " + words[i]);
System.out.println("length of words[i] is " + words[i].length());
```
What can you determine about the bug in the original code?  What was the problem?  What is a potential solution?




# Basic Command Line Programs

If you look at the `main` method in the HelloWorld program from the first class, you will notice that it takes an array of Strings as input. When we run the HelloWorld program, we can specify what that input is and use it in our program. Just keep in mind that command line arguments are always seen as Strings to Java (and so you may need to convert a string to a number if need be).

Compile and run the `HelloHello` program. Read the class and make sure you understand what it is doing. Try running it with different command line arguments (like the examples provided in the header comment section of the file).

Modify the program so that it outputs an N by N block of Qs. Here, N is an integer specified as the first command line argument. 

For example, running the program with `java HelloHello 10` will output

```
QQQQQQQQQQ  
QQQQQQQQQQ  
QQQQQQQQQQ  
QQQQQQQQQQ  
QQQQQQQQQQ  
QQQQQQQQQQ  
QQQQQQQQQQ  
QQQQQQQQQQ  
QQQQQQQQQQ  
QQQQQQQQQQ  
```

and running `java HelloHello 2` will output

```
QQ  
QQ  
```

## User input

Using the `HelloInput` program as a starting point, change the previous program so that instead of using command line arguments, it uses a `Scanner` object to read input (the value of N) from the user.

For example, the following prompts the user for an integer, reads the integer, and then prints it back out.

```
java.util.Scanner keyboard = new java.util.Scanner( System.in );
int = number;
System.out.print("enter an integer :");
int = keyboard.nextInt();
System.out.println("you entered " + int);
```

Have a look at the `Scanner` API. It shows all methods that you can use with the class. 

https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html

Note: If we put `import java.util.Scanner;` at the top of our code (before the class` declaration) then we do not to put `java.util` before `Scanner` each time.  

Note: We need to be careful here. When we use a Scanner object to read an `int` but actually enter a string problems will happen. Try doing this when running your code. 

## More Coding
Write a program that uses command line arguments that does the following:

1. prints out how many command line arguments were given. Hint: all arrays have an attribute called `length`.  
2. prints on one line all the command line arguments in reverse order. Each string should be separated by a comma and space. There should be no comma after the final string printed.

For example, running `java Args cat dog eel` should output 

```
There are 3 command line arguments
eel, dog, cat
```

You will find that `System.out.print()` is useful here.

Note: In Java, if you try to print an array like you would print a list in Python, the output will most likely not be what you expect. Try adding `System.out.println( args );` to your code and see what the output is. We will talk about this in class.

Modify the program again so that command each string printed out is in upper case. For example, running `java Args Cat dOG EEl` should output

```
There are 3 command line arguments
eel, dog, cat
```

Hint: Look at the `String` API and search for lowercase.

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

Next, modify the program so that it still prints the command line arguments in reverse order and in lower case but only prints the strings that have length that satisfies 2 < length < 9. (That is, only print the strings with length 3,4,5,6,7 or 8.) For example, running `java Args doggy Cat kitttttttttttty dOG EEl 12 a abc`  should output

```
there are 8 command line arguments
abc,eel,dog,cat,doggy
```

## More coding
Write a program called `Find` that prompts the user for a string and a character. The program then prints our how many times that charcater appears in the string. For example, the program might look like

```
C:Users> java Find
Enter a string    : I'm a hot air balloon that could go to space
Enter a character : o
The character o appears in your string 6 times.

C:Users> java Find
Enter a string    : I'm a hot air balloon that could go to space
Enter a character : q
The character q appears in your string 0 times.
```

Modify the program so that is only asks for a string but then outputs the frequency of each letter in the alphabet that occurs in the string. For example, a run of the program might lool like

```
C:\Users> java Find  
Enter a string: the cat in the hat
Fequency of letters is
a - 2  
c - 1  
e - 2  
h - 3  
i - 1  
n - 1  
t - 4
```

Hint: we can convert between `char`s and `int`s easily. Assume the input is all lower case. The letter `'a'` corresponds to 97, `'b'` to 98, `'c'` to 99, etc.
