## SOLID
# S - single responsibility principle
# O - open close principle
# L - Liskov substitution
# I - Interface separation principle
# D - Dependency Inversion principle


# Single responsibility principle
A class should have only one reason to change, meaning it should only have one responsibility.
Example: A USER class should only handle user related logic, while database-related operation should be handled by a
separate UserRepository class.

# Open close principle
Software entities should be open fpr the extension but closed for modification
Example: Adding new functionality to a system using inheritance/interface/abstract for composition without modifying existing code.

# Liskov substitution
This states that the object of a superclass should be replaceable with objects of a subclass without altering the correctness of the program.
It ensures that a subclass in for its parent class and function in any context that expects the parent class

# Interface Separation principle
It ensures that classes are not burdened without methods they don't need. it promotes better design by breaking large general purpose interfaces into smaller,
more specific ones.
It improves maintainability, flexibility and testability by ensuring that classes only have dependencies they actually require.

# Dependency Inversion Principle
High-level modules should not depend on low-modules; both should depend on abstractions.