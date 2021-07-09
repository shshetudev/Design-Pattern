### Bridge Pattern
* __When we use:__ Bridge is used when we need to decouple an abstraction from its implementation so that the two can vary independently.
* __Type:__ This type of design pattern comes under structural pattern as this pattern __decouples implementation class and abstract class__ by providing a bridge structure between them.
* __How structured:__
    * __This pattern involves an interface which acts as a bridge which makes the functionality of concrete classes independent from interface implmenter classes.__
    * Both types of classes can be altered structurally without affecting each other.

### How we implement
* We are demonstrating use of Bridge pattern via following example in which __a circle can be drawn in different colors using same abstract class method but different bridge implementer classes.__

### Implementation
* __We have a `DrawAPI` interface which is acting as a bridge implementer__ and __concrete classes `RedCircle`, `GreenCircle` implementing the `DrawAPI` interface__.
* __`Shape` is an abstract class and will use object of `DrawAPI`.__
* `BridgePatternDemo, our demo class will use `Shape` class to draw different colored circle.