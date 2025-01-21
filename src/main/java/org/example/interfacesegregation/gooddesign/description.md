## The Interface Segregation Principle (ISP) states that a class should not be forced to implement interfaces it does not use.
- Instead of having one large, monolithic interface, we should divide it into smaller, more specific interfaces to ensure that implementing classes are only exposed to the methods they need.

# Interfaces Are Specific:
- Each interface has a single responsibility, ensuring that implementing classes are not overloaded with irrelevant methods.

# Classes Only Use What They Need:
- Dog and Bird are not burdened with behaviors that don’t apply to them.

# Flexible and Extensible:
- Adding new interfaces or behaviors is straightforward and does not require modifying existing code.