# Object-Oriented Programming (OOP) in Java

Object-Oriented Programming (OOP) is a programming paradigm based on the concept of "objects", which can contain data and code: data in the form of fields (attributes or properties), and code in the form of procedures (methods). Java is a pure object-oriented language (except for primitive types) and supports all OOP principles.

## Key OOP Concepts in Java

### 1. Class and Object

- **Class**: Blueprint for objects. Defines properties and behaviors.
- **Object**: Instance of a class.

```java
class Car {
    String color;
    int year;

    void drive() {
        System.out.println("Car is driving");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.color = "Red";
        myCar.year = 2022;
        myCar.drive();
    }
}
```

### 2. Encapsulation

Encapsulation is the mechanism of wrapping data (variables) and code (methods) together as a single unit. In Java, this is achieved using access modifiers (`private`, `public`, `protected`).

```java
class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
```

### 3. Inheritance

Inheritance allows one class to inherit fields and methods from another. The `extends` keyword is used.

```java
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
```

### 4. Polymorphism

Polymorphism allows objects to be treated as instances of their parent class rather than their actual class. It is of two types: compile-time (method overloading) and runtime (method overriding).

#### Method Overloading

```java
class MathUtils {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
```

#### Method Overriding

```java
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}
```

### 5. Abstraction

Abstraction is the process of hiding implementation details and showing only functionality. Achieved using abstract classes and interfaces.

#### Abstract Class

```java
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
```

#### Interface

```java
interface Drawable {
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}
```

## Access Modifiers

- `private`: Accessible within the class only.
- `default` (no modifier): Accessible within the package.
- `protected`: Accessible within package and subclasses.
- `public`: Accessible from everywhere.

## Constructors

Special methods to initialize objects.

```java
class Student {
    String name;
    Student(String n) {
        name = n;
    }
}
```

## Static Keyword

Used for memory management. Can be applied to variables, methods, blocks, and nested classes.

```java
class Counter {
    static int count = 0;
    Counter() {
        count++;
        System.out.println(count);
    }
}
```

## Final Keyword

Used to restrict the user. Can be applied to variables, methods, and classes.

```java
final class Vehicle {}
```

## Summary Table

| Concept        | Description                                 | Example Keyword   |
|----------------|---------------------------------------------|------------------|
| Encapsulation  | Data hiding                                 | `private`        |
| Inheritance    | Reuse of code                               | `extends`        |
| Polymorphism   | Many forms (overloading/overriding)         | `@Override`      |
| Abstraction    | Hiding implementation, showing functionality| `abstract`, `interface` |

## Conclusion

OOP in Java helps in organizing complex programs, promotes code reuse, and improves maintainability. Mastering these concepts is essential for effective Java programming.