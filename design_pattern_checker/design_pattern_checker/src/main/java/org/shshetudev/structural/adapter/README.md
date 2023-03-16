## Adapter Design Pattern

## Project Requirements
- An e-commerce website allows users to shop and pay online and this site is integrated with a 3rd party payment gateway,
through which users can pay their bills using their credit card.
- The company is planning to change the payment gateway vendor, and has to implement that in the code.
- The problem that arises here is that the site is attached to the **Xpay** payment gateway which takes an Xpay type of object.
- The new vendor **PayD** only allows teh PayD type of object to allow the process.
- The company does not want to change the whole set of 100 of classes which have reference to an object of type XPay.
- This also raises the risk on the project, which is already running on the production.

## Development challenges


## How Factory method resolves the challenges

## What is Factory method pattern?

## Elements of Factory method pattern
![Elements of Factory method pattern](generic_design.png)
- **Product:** Defines the interface of objects the factory method creates.
- **ConcreteProduct:** Implements the product interface.
- **Creator:** Declares the factory method, which returns an object of type Product. Creator may also define a default implementation fo the factory method that returns a default **ConcreteProduct** object.
- **ConcreteCreator:** Overrides the factory method to return an instance of a **ConcreteProduct.**

## How it helps?
Factory methods eliminate the need to bind application-specific classes into your code. The code only deals with the Product interface; therefore it can work with any user-defined **ConcreteProduct** class.

