# OOP with Java – Assignment 1

**Name:** Bhuvaneshwar

## Problem A — Inheritance & Constructor Chaining

**Statement:** Create a class `Student` with attributes `name` and `rollNo`, and a constructor to initialize them. Create a subclass `GraduateStudent` that adds an attribute `thesisTitle`. Use `super()` in the subclass constructor to call the parent constructor.

**Assigned Data:**
- Student: name = "Aarav Sharma", rollNo = 101
- GraduateStudent: name = "Priya Verma", rollNo = 205, thesisTitle = "Machine Learning for Crop Yield Prediction"

**Sample Output:**
```
--- Student ---
Name: Aarav Sharma
Roll No: 101

--- Graduate Student ---
Name: Priya Verma
Roll No: 205
Thesis Title: Machine Learning for Crop Yield Prediction
```

---

## Problem B — Interface Implementation

**Statement:** Create an interface `Gradable` with a method `calculateGPA()`. Implement this interface in a class `UndergradStudent`.

**Assigned Data:**
- Student: name = "Rohan Mehta", rollNo = 310
- Subject marks (out of 100): 85, 90, 78, 92, 88

**Sample Output:**
```
Name: Rohan Mehta
Roll No: 310
GPA: 8.66
```

---

## Problem C — Exception Handling (InputMismatchException)

**Statement:** Write a program that reads a roll number as an integer using `Scanner`. Handle `InputMismatchException` gracefully if the user enters non-numeric text instead of a number.

**Sample Output (input: "abc" then "42"):**
```
Enter roll number: Invalid input! Please enter a numeric roll number.
Enter roll number: Roll number accepted: 42
```

---

## How to Compile & Run

```bash
javac ProblemA.java
java ProblemA

javac ProblemB.java
java ProblemB

javac ProblemC.java
java ProblemC
```
