# Simple Java Project

A beginner-friendly Java project with three classes.

## Project Structure

```
java-project/
├── src/
│   └── com/example/
│       ├── Main.java         # Entry point
│       ├── Calculator.java   # Math operations
│       └── Greeter.java      # Greeting utility
├── bin/                      # Compiled .class files go here
└── README.md
```

## Classes

- **Main** — Runs the program and demonstrates all features
- **Calculator** — Supports add, subtract, multiply, divide
- **Greeter** — Greets a named person

## How to Compile & Run

```bash
# Compile
javac -d bin src/com/example/*.java

# Run
java -cp bin com.example.Main
```

## Expected Output

```
=== Simple Java Project ===
5 + 3 = 8.0
10 - 4 = 6.0
6 * 7 = 42.0
20 / 4 = 5.0
Hello, World!
Hello, Java!
```
