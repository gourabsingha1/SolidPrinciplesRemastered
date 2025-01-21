## The Dependency Inversion Principle (DIP) states that high-level modules should not depend on low-level modules. Instead, both should depend on abstractions.
- Additionally, abstractions should not depend on details; details should depend on abstractions.

# High-Level Module Depends on Details:
- DesktopComputer is tightly coupled to the WiredKeyboard class, making it rigid and hard to extend.

# Difficult to Test:
- Testing the DesktopComputer class requires using the concrete WiredKeyboard implementation, which might not be suitable in all cases.

# Lack of Flexibility:
- Switching to a new keyboard type (e.g., WirelessKeyboard) requires modifying DesktopComputer.