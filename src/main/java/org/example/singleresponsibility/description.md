## A class should have only one reason to change, meaning it should only have one responsibility or functionality.
- The Single Responsibility Principle (SRP) does not mean a class should have only one function. Instead, it means a class should have only one reason to change, meaning it should be responsible for a single functionality or cohesive set of behaviors.

# ArithmeticOperations:
This class has one responsibility: performing basic arithmetic operations.
While it has multiple methods (add, subtract, multiply, divide), they all belong to the cohesive group of arithmetic operations.
If there is a change to arithmetic logic (e.g., adding new operations or optimizing existing ones), only this class is impacted.

# GeometryCalculations:
This class handles geometric calculations like computing the area of a circle or the perimeter of a rectangle.
The methods are tightly related because they all perform geometric calculations.
Changes to geometric logic would impact only this class.

# When is it Correct?
A class can have multiple methods as long as:
- The methods are part of the same responsibility or functionality.
- The class has only one reason to change, which aligns with its responsibility.

# When is it Incorrect?
It becomes a violation of SRP if the methods cater to different responsibilities. For example:

class Calculator {
    public double add(double a, double b) { ... }  // Arithmetic
    public double calculateAreaOfCircle(double radius) { ... }  // Geometry
    public void saveToFile(String result) { ... }  // File handling
}
Here, the Calculator class handles arithmetic, geometry, and file-saving, which are unrelated responsibilities.