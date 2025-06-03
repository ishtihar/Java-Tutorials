package Oops.Inheritence;

class Papa {
    void Speak (){
        System.out.println("Every person speak");
    }

}

class Child1 extends Papa {
    void Smart () {
        System.out.println("This boy is smart");
    }

}

class Child2 extends Papa {
    void OverSmart(){
        System.out.println("This child is oversmart");
    }
}


public class HeirarchicalInheritence {
    public static void main(String[] args) {
        Child1 child1=new Child1();
        child1.Speak();
        child1.Smart();
        Child2 child2=new Child2();
        child2.OverSmart();
        child2.Speak();
    }
}
