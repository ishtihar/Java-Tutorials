package Oops.Inheritence;
class Parent {
    Parent(String name) {
        System.out.println("Parent constructor called: " + name);
    }
}

class Child extends Parent {
    Child(String name) {
        super(name); // Parent class ka constructor call kiya
        System.out.println("Child constructor called");
    }
}

public class Const_Inher {
    public static void main(String[] args) {
        Child obj = new Child("ishtihar");
    }
}
