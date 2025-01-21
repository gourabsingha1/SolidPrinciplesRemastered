## The Liskov Substitution Principle (LSP) states that subtypes must be substitutable for their base types without affecting the correctness of the program.
- This principle ensures that polymorphism works as expected, promoting consistent behavior.

# Subtypes Do Not Fulfill the Base Class Contract:
- Penguin breaks the assumption that all Bird instances can fly.

# Code Becomes Error-Prone:
- Using a Penguin in place of a Bird requires additional checks or error handling, defeating the purpose of polymorphism.