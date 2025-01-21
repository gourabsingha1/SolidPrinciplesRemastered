## A class should be open for extension but closed for modification. This means you should be able to add new functionality to a class without altering its existing code.

# This design is not correct because:

Frequent Extension Is Expected:
If the application is expected to add new shapes (like Triangle, Square, etc.), this approach requires modifying the calculateArea method every time.
Each modification increases the risk of bugs and makes the class less stable.

Violates OCP:
Adding a new shape (e.g., Triangle) is not possible without changing the existing method.
The class is not closed for modification because changes to requirements will directly impact the AreaCalculator class.

Complexity Grows:
As more shapes are added, the if-else structure grows, making the method harder to maintain and understand.