package Oops;

class Family {
    private int a;
    public void setMember (int a){
        this.a=a;
    }
    public void getMember(){
        System.out.println(a);
    }
}

public class Enapsulation {
    public static void main(String[] args) {
        Family family=new Family();
        family.setMember(45);
        family.getMember();
    }
}
