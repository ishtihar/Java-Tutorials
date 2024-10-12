package Inheritance;
class Base {

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int x;


}

class Derived extends Base {
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
        Base b = new Base();
        b.setX(23);
        System.out.println(b.getX());
    }
}
