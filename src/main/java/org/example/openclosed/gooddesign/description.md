## A class should be open for extension but closed for modification.
- This means you should be able to add new functionality to a class without altering its existing code.

# The refactored design using polymorphism adheres to OCP

# Scalability Is Required:
- If new shapes are expected to be added (e.g., Triangle, Square), you simply create new subclasses of Shape. The AreaCalculator class does not require modification.
- The system is open for extension (new shapes) but closed for modification (existing code remains unchanged).

# Adheres to OCP:
- You don’t need to modify the AreaCalculator class when new shapes are introduced. Each shape class is self-contained.

# Promotes Reusability and Maintainability:
- The Shape hierarchy allows reusing the area calculation logic independently for each shape.
- Individual shapes are easier to test and debug.