## The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules. Instead, both should depend on abstractions.
- Additionally, abstractions should not depend on details; details should depend on abstractions.

# Loosely Coupled:
- DesktopComputer does not depend on specific keyboard implementations, making the system modular and testable.

# Extensible and Maintainable:
- Adding new keyboards or changing existing ones does not require changes to the high-level module (DesktopComputer).

# Promotes Reusability:
- The DesktopComputer class can work with any implementation of the Keyboard interface, increasing its reusability.