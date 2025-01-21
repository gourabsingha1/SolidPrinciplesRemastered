## A class should have only one reason to change, meaning it should only have one responsibility or functionality.
- The Single Responsibility Principle (SRP) does not mean a class should have only one function. Instead, it means a class should have only one reason to change, meaning it should be responsible for a single functionality or cohesive set of behaviors.

# Calculator Class Handles Multiple Concerns:
- If input validation, logging, or other tasks are added to Calculator, it no longer adheres to SRP.

# Tightly Coupled Logic:
- Combining responsibilities into one class makes it harder to test, maintain, and extend.