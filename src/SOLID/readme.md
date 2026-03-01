# SOLID Principles

| Letter | Principle |
|--------|-----------|
| **S** | Single Responsibility Principle |
| **O** | Open/Closed Principle |
| **L** | Liskov Substitution Principle |
| **I** | Interface Segregation Principle |
| **D** | Dependency Inversion Principle |

---

## Single Responsibility Principle (SRP)

A class should have only **one reason to change**, meaning it should have only one responsibility.

**Example:** A `User` class should only handle user-related logic, while database operations should be handled by a separate `UserRepository` class.

---

## Open/Closed Principle (OCP)

Software entities should be **open for extension** but **closed for modification**.

**Example:** Adding new functionality to a system using inheritance, interfaces, or abstract classes (composition) — without modifying existing code.

---

## Liskov Substitution Principle (LSP)

Objects of a superclass should be **replaceable with objects of a subclass** without altering the correctness of the program. A subclass must be able to stand in for its parent class and function correctly in any context that expects the parent class.

**Example:** The `LSP/goodCode` directory demonstrates this by segregating read and write capabilities into separate interfaces:

- `Readable` — interface for read operations
- `Writable` — interface for write operations
- `ReadableClass` — implements `Readable`
- `WriteableClass` — extends `ReadableClass` and implements `Writable`

Because `WriteableClass` extends `ReadableClass`, it can be substituted anywhere a `ReadableClass` is expected without breaking behaviour.

---

## Interface Segregation Principle (ISP)

Classes should **not be forced to implement methods they don't use**. Large, general-purpose interfaces should be broken into smaller, more specific ones.

This improves maintainability, flexibility, and testability by ensuring classes only depend on the methods they actually require.

---

## Dependency Inversion Principle (DIP)

High-level modules should **not depend on low-level modules**; both should depend on **abstractions**. Abstractions should not depend on details — details should depend on abstractions.
