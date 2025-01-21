## The Liskov Substitution Principle (LSP) states that subtypes must be substitutable for their base types without affecting the correctness of the program. This principle ensures that polymorphism works as expected, promoting consistent behavior.

# Violation of LSP:
- Penguin cannot fulfill the contract of Bird, as it overrides the fly method to throw an exception.
- The behavior of Bird is inconsistent when replaced by a Penguin.

# Incorrect Abstraction:
- The base class Bird assumes all birds can fly, which is not true for some subclasses like Penguin.