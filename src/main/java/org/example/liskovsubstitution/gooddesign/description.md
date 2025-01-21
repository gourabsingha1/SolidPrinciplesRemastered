## The Liskov Substitution Principle (LSP) states that subtypes must be substitutable for their base types without affecting the correctness of the program.
- This principle ensures that polymorphism works as expected, promoting consistent behavior.

# Subtypes Maintain Behavior:
- Sparrow and Penguin can replace Bird without causing unexpected results or breaking functionality.

# Polymorphism Works as Expected:
- Code relying on Bird (e.g., the main method) does not need to know whether it’s dealing with a Sparrow or a Penguin.
- The Bird class no longer assumes that all birds can fly. The behavior for movement is generalized through the move method, and FlyingBird specializes it for flying birds.

# Extensible Design:
- Adding new bird types (e.g., Ostrich or Hummingbird) can be done without altering existing behavior.