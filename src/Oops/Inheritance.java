package Oops;
class Base1 {
    public Base1() {
        System.out.println("Main constructor hu");
    }

    public int getX() {
        System.out.println("I am getter base");
        return x;
    }

    public void setX(int x) {
        System.out.println("I am setter");
        this.x = x;
    }

    int x;


}

class Derived extends Base1 {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Base1 b = new Base1();
    }
}
//ishtihar new 2
