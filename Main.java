package com.example;
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simple Java Project ===");
        // Use Calculator
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("20 / 4 = " + calc.divide(20, 0));
        // Use Greeter
        Greeter greeter = new Greeter("World");
        greeter.greet();
        greeter.setName("Java");
        greeter.greet();
    }
}
