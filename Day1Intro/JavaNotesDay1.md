Write once, Run EVERYWHERE

Java vs Javascript

- Like ham and hamburger
- Javascript was named to try to ride off the coattails of Java
- They have a small amount of similarities

- JAVA is OOP (object oriented programming)

4 Pillars of OOP:
1. Abstraction
2. Encapsulation
3. Inheritance
4. Polymorphism

Benefits of JAVA:
- Architecture and platform independent
- Compiles down to Bytecode
- Multithreaded: Asynchronous language, able to work on multiple problems at the same time

Compiled & Interpreted
- Compiled programming language, takes everything in code and breaks it down into bytecode
- Javac compiler is then able to interpret the bytecode and run it


- EVERYTHING in Java is an Object!


--------------------------------------------------------------
SETTING UP WITH JAVA
--------------------------------------------------------------

Public - means this method will be accessible anywhere, by any Class

Static - means the given method or variables is not instance-related, but Class-related
	- This method can be called directly using the class name without creating an instance of it

Void - is used to define the Return Type of the method. 
	- Void means the method will not return any value 
	- Int returns an integer/Number
	- String returns a 'String'

Main - Specifically searched out by the JVM (java virtual machine) as a starting point for an application
		- without a Main method, the JVM will return Error

{} - surround code blocks such as loops methods and classes 

System - public class provided by Java

out - "field"

println - method from the System class

\n - Forced line break, used in print methods

Variables - its a way of remembering data (int, float, double, short, long), (char) (boolean)

| TYPE VARNAME = VALUE; |

int varName = 5;
double varName2 = 2.5;

Reference Type - (string)

String georgesName = "George";

%s - tells printf("") that you want to print a variable
(Can use multiple %s and variables in one print)

field - variable inside of object

regex - regular expression

print, println, printf - Methods contained in system class to print information to the console
(System.out.print())


--------------------------------------------------------------
USING SCANNER
--------------------------------------------------------------

java.util.Scanner - a way to recieve input (userInput) 
"import java.util.Scanner;"

Scanner userInput = new Scanner(System.in);
-- Instantiate new Scanner
-- "System.in" represents your keyboard

String fName = userInput.nextLine();
--sets variable fName to whatever is returned from userInput


--------------------------------------------------------------DECLARING A VARIABLE IN JAVA
--------------------------------------------------------------

=Give it a Type - (String, float, double, int, boolean ...etc)

=Give it a Name - They should be instantiated as a camelCase (startWithLowerCaseThenUpperCase)

***Java is strictly typed language, meaning variables in Java do not change types once they are declared***

=Reference type - based on class rather than primitive. String is a reference type. Referring to the String class

=Primitive type - There are predefined by the language named by a keyword (byte, short, long, int, boolean, float, double and char)

=Integer - int - Default data type for whole values
	-int number = 45;
=Double - double - Generally the default for non whole numbers (think decimals)
	- double decNumber = 2.25;
=Boolean - boolean - Declares True or False
	- boolean answer = true;
=Character - char - Used to store any (one) character (numbers, letters, punctuation ...etc)
------------------------------
------------------------------
***MATH OPERATIONS*** 
Integer +, -, *, / Integer = Integer
------------------------------------------------------------
***FLOAT***
Float + (or) - (or) * Float = Float

Float / Float = Float

(if divisible, #.0, so still a Float)
------------------------------
Integer + (or) - (or) * Float = Float
Integer / Float = Float
Float / Integer = Float
------------------------------------------------------------

int num1 = 2;
num1++; //num1 = 3

num1--; //num1 = 2

double num2 = 2; //num2 = 2.0

num2++; //num2 = 3.0
num2--; //num2 = 2.0

------------------------------
THE MODULUS (%)

10%5 = 0 //no remainder
15%6 = 3 //remainder of 3
Mod- Gives you the remainder of whatever divisible



------------------------------
IF & ELSE STATEMENTS
------------------------------------------------------------
if/else
if(condition){
	//performed if TRUE
}else {
	//performed if FALSE
}

------------------------------------------------------------
JAVA NON-STRING COMPARISON SYMBOLS
------------------------------
equals ==
does not equal !=
less than <
less than equal <=
greater than >
greater than equal >=

------------------------------------------------------------
JAVA STRING COMPARISON
------------------------------
String name = "George"
String name2 = "Kaley"

name.equals(name2);
(".equals" is built in and ONLY used to compare values in "strings")

------------------------------

Integer.parseInt(userInput.nextLine());
^^Converts Stringinput to Integerinput


