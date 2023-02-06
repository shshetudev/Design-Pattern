## Design patterns

- Designing is an art that comes with the experience. But there are some set of solutions already written by some
  advanced and experienced developers while facing and solving similar problems.
- Design Patterns is the experience in designing the object-oriented code.

## Four essential elements of Design patterns

- In general, a pattern has four essential elements:
    - **Pattern name:** Used to provide a single and meaningful name to the pattern which defines a design problem and a
      solution for it.
    - **The problem describes when to apply the pattern:** It explains the problem and its context. It might describe
      specific design problems such as how to represent algorithms as objects.
    - **The solution:** Describes the elements that make up the design, their relationships, responsibilities and
      collaborations. The solution is not the complete code, but it works as a template which can be fulfilled with
      code.
    - **The results and consequences of applying the pattern:** The consequences for software often concern space and
      time trade-offs. They may address language and implementation issues as well.

## Why use them

- **Flexibility**
- **Reusability**
- **Shared vocabulary**
- **Capture best practices**

## How to select and use one

- There are number of design patterns which solve almost a similar type of design problem and also have similar
  implementation.
- One must have a very deep understanding of them in order to implement the correct design pattern for the specific
  design problem.
- First we need to identify the kind of design problem we are facing. A design problem can be categorized into
  creational, structural or behavioral.
- **For Example:**
    - **There are too many instances of a class which represent only a single thing**, the value in the properties of
      the objects are same, and they are only used as ready-only: We can select **Singleton** pattern for this design
      problem which ensures only a single instance for the entire application and helps to decrease the memory size.
    - Classes are too much dependent on each other. A change in one class affects all other dependent classes**. We can
      use **Bridge, Mediator or Command** to solve this design problem.
    - **There are two different incompatible interfaces in two different parts of the code, and our need is to convert
      one interface into another which is used by the client code to make the entire code work**. The **Adapter**
      pattern fits into this problem.
- A design pattern can be used to solve more than one design problem, and one design problem can be solved by more than
  one design patterns.
- There could be plenty of problems and solutions for them, but to choose the pattern which fits exactly depends on our
  knowledge and understanding about the design patterns.

## Categorization of patterns

- Design patterns can be categorized in the following categories:
    - **Creational patterns**
    - **Structural patterns**
    - **Behavior patterns**

## Creational patterns

- Used to design the instantiation process of objects.
- **Uses inheritance to vary the object creation.**
- There are two recurring themes in these patterns:
    - **Firstly,** they all encapsulate knowledge about which concrete class the system uses.
    - **Secondly,** they hide how instances of these classes are created and put together.

## Structural patterns

- **Concerned with how classes and objects are composed to form larger structures.**
- As a simple example, we can consider how multiple inheritance mixes two or more classes into one. The result is a
  class that combines the properties of its parent class.
- **Uses inheritance to compose interfaces or implementations.**

## Behavior patterns

- **Concerned with algorithms and the assignment of responsibilities between objects. Describe not just patterns of
  objects or classes but also communication between them.**
- **These patterns characterize complex control flow that's difficult to follow at run-time. They shift our focus of
  control to let us concentrate just on the way objects are interconnected.**
- **Uses object composition rather than inheritance.**
- **For example:**
    - **The mediator provides the indirection needed for loose coupling.**

## List of patterns

| Creational       | Structural | Behavioral              |
|------------------|------------|-------------------------|
| Abstract Factory | Adapter    | Chain of Responsibility |
| Builder          | Bridge     | Command                 |
| Factory Method   | Composite  | Interpreter             |
|                  | Decorator  | Mediator                |
|                  | Facade     | Memento                 |
|                  | Flyweight  | Observer                |
|                  | Proxy      | State                   |
|                  |            | Strategy                |
|                  |            | Template Method         |
|                  |            | Visitor                 |


## Adapter Pattern