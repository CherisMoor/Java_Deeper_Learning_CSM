#### Goals for Today:

- review and cement the basic OOP principles
- become a little more comfortable with "big" applications
- our thought process when we need to start designing an application

#### Car Dealership:

- which to design first? the public interface or the inner detail
  - "top down or bottom up" design concept
  - depends on a lot of factors and most teams will use both when delivering software
- Top Down: identify "top level" objects first then find objects that represent smaller portions of the system

  - We continually refine those definitions until the system is complete
  - In our Car Dealership application this may look like this designing objects in this order:
    1. Dealership
    2. Departments
    3. Staff
    4. Vehicles

- Bottom Up: the owest level of objects would be designed first and those objects would be compiled into bigger modules untiloverall system is complete
  - In the Dealership this would be designed in this order:
    1. Vehicles
    2. Departments
    3. Dealership
    4. Staff

#### Today, starting with Vehicles (Bottom Up)

- object hierarchy

  - "Gen-Spec" (Generalized-Specialized) / "is-a" relationship
  - Find common abstractions and model those in our base class then having specialized classes derive those from the base class.

  New thing we learned today:

  1. Enumerations
  2. instanceof keyword
  3. How to work with a multifile Java program in VS Code
  4. Brief intro to annotations, mainly @Override
