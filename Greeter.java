package com.example;

public class Greeter {

    private String name;

    public Greeter(String name) {
        this.name = name;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
