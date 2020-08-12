**_ Object Relationships _**

#### ASSOCIATION

- Loose relationship, lifetimes of obj are independent of one another
- "is-a" relationship (Doesn't apply to every instance of an Association)

#### COMPOSITION

- "has-a" relationship or a "part-of"
- A Dealership "has a" Department
  - The Department don't exist outside of a Dealership, therefore its a _Composition_ relationship

#### AGGREGATION

- A Dealership also "has" Vehicles, but its a less tightly coupled relationship
- Vehicles come and go through the Dealership and the Dealership can manipulate them while it "owns" them
- But, ultimately, a Vehicle _can_ exist outside of a Dealership (this is called _aggregation_)

#### GENERICS

- Allows us to create classes and methods that can be used on multiple kinds of data types, elements, etc

<E> for elements
<T> for type
<V> for value
<K> for key

- we can "bound our generics to specific user-generate object/type using the "extends" keyword
  example: <E extends Vehicles>

  #### OOP DESIGN PATTERNS

  - Sounds really intimidating, but its not
  - A convention so well recognized that it has a name and when someone calls a pattern by its name, everyone knows what they're talking about

  #### FACTORY PATTERN

  - A method for creating obj without exposing the lodic needed for creation
  - SUPER common pattern in OOP
  - using a Factory insulates the consumer from the actual class implementaion

  * Why is this important? Why use a factory instead of relying on the new keyword?
    **_ Abstraction_** and **_insulation_**

## NEW STUFF WE COVERED

1. Factory Pattern
2. Implementing multiple Interfaces
3. Generic class (focusing on generic elements)
4. Composing objects at another objects creation

## When to use abstract classes, generic classes, and interfaces

**Abstract classes**
A blueprint to use for something else

- Do you need both abstract and non-abstract methods?
- Are you okay with a class only being able to implement one of you?
- Do you exressly need to add new functionality or do need some other stuff too?

  **Generic classes**

- Do you need to work with multiple data types or object types?

  **Interface**

- Do you only need non-abstract methods?
- Are you easily named as an adjective? ( has -ible or -able at the end)
- Can you be paired with other interfaces and work together to add more functionality?
