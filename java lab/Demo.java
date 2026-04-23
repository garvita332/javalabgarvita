// 🔹 Abstract Class
abstract class Animal {
    abstract void sound();   // abstract method
}

// 🔹 Interface
interface Test {
    void show();
}

// 🔹 Child Class (inherit + implement)
class Dog extends Animal implements Test {

    // abstract method override
    void sound() {
        System.out.println("Dog barks");
    }

    // interface method implement
    public void show() {
        System.out.println("Interface method called");
    }
}

// 🔹 Main Class
public class Demo {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();   // abstract class method
        d.show();    // interface method
    }
}