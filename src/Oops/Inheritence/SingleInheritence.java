package Oops.Inheritence;

class Animall {
    void Eats () {
        System.out.println("The animals eat food");
    }
}
// single inheritence
class Dog extends Animall {
    void Bark () {
        System.out.println("Dog is barking");
    }

}
class Lion extends Dog{
    void Roar(){
        System.out.println("Lion is roaring");
    }

}


public class SingleInheritence {
    public static void main(String[] args) {
   Lion lion=new Lion();
   lion.Roar();
   lion.Bark();
   lion.Eats();

    }

}

