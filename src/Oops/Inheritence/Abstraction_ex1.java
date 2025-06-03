package Oops.Inheritence;

 abstract class Vehical {
    abstract void Sound ();
}
class Jeep extends Vehical {

    @Override
    void Sound() {
        System.out.println("gharrrrrrrr");

    }
}
class Bicycle extends Vehical {

    @Override
    void Sound() {
        System.out.println("hudddddddd");
    }
}

public class Abstraction_ex1 {
    public static void main(String[] args) {
        Vehical vehical = new Jeep();
        vehical.Sound();
        Vehical vehical1=new Bicycle();
        vehical1.Sound();

    }
 }
