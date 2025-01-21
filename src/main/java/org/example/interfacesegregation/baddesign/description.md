## The Interface Segregation Principle (ISP) states that a class should not be forced to implement interfaces it does not use.
- Instead of having one large, monolithic interface, we should divide it into smaller, more specific interfaces to ensure that implementing classes are only exposed to the methods they need.

# Interfaces Are Too Large:
- The Animal interface includes unrelated methods (fly and swim), forcing all implementing classes to provide meaningless implementations.

# Increases Coupling:
- Changes to the Animal interface (e.g., adding run) would force all implementing classes to be updated, even if the new behavior is irrelevant to them.

# Error-Prone:
- Throwing exceptions for unsupported operations (UnsupportedOperationException) creates runtime risks.