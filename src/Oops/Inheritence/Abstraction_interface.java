package Oops.Inheritence;

interface Animals {
    abstract void sound();

    default void Sleep() {
        System.out.println("so raha hai");
    }

}

class Cat implements Animals {
    @Override
    public void sound() {
        System.out.println("Meow Meow...");

    }
}


public class Abstraction_interface {
    public static void main(String[] args) {
        Animals animals = new Cat();
        animals.sound();
        animals.Sleep();
    }
}
