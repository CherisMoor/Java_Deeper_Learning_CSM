Object Oriented Programming in Java (OOP)

OOP is all about creating objects that contain data and methods

Create a custom class, create an object
- "new" keyword

WHY OOP?
- Helps us keep our code DRY (Dont repeat yourself)
- Faster and easier to execute
- Provides a clear structure for our program

What Topics are we going to talk about today?
- Classes and Objects
	1. Encapsulation
	2. Inheritance
	3. Polymorphism
	4. Abstraction
- Interfaces and Abstract Classes
- Associations
- Aggregation
- Composition

1. Encapsulation:
	- Protective shield that prevents data from being accessed by the code that shouldnt have access 
2. Inheritance:
	- Using the "extends" keyword to allow classes to be able to use data and methods from another class
3. Polymorphism: 
	- "many forms", when a method performs different actions depending on where and by whom it was called
	- Often this takes place by "Overloading" methods
		1. number of parameters
		2. data types of the parameters
		3. sequence of data type of the parameters
4. Abstraction:
	- hide data and certain details, only showing essential info to the user
	- making a phone call. You know how to dial a number, but you dont know the process of connecting to the callee.
		1. with Abstract classes
		2. with Interfaces
	Abstract classes-
		- cannot be instantiated, but can be inherited
		- has the abstract keyword prefixed to it
		- the inheriting class must overload/implr]ement all the abstract
		- can have both abstract and non-abstract methods 
	Interfaces-
		- cannot be instantiated
		- does not contain any constructore
		- not extended, it is implemented
		- can only have abstract, default, and static methods
		- all members of an interface are public by default

	Associations:
		- a relationship between 2 objects
		- Human and Animal
			- Many animals can be associated with one human while one animal can also be associated with multiple humans
			- "many-to-many" relationship ^

	Aggregations
		- "Has-A" relationship
		- child object cant belong to another parent object

	Composition
		- "One-to-many" relationship
		- One entity cannot exist without the other
		- Question and Answers
			- One question can have multiple answers, but answers cannot have multiple questions