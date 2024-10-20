package Oops;

class ComplileTime {
   // Based on Parameter
//    public void Names (String a){
//        System.out.println(a);
//    }
//
//    public void Names (String a, int b){
//        System.out.println(a + " " + b);
//    }


    public String UserDeatils (int age, int mo){
        return age+""+mo;
    }

    // Method Overloading using Order of Parameters
    public void show(int a, String b) {
        System.out.println("Integer: " + a + ", String: " + b);
    }

    // Overloaded method to display a string followed by an integer
    public void show(String b, int a) {
        System.out.println("String: " + b + ", Integer: " + a);
    }
}

public class Polymorphism_compile {
    public static void main(String[] args) {
        ComplileTime complileTime=new ComplileTime();
//        complileTime.Names("Ishtihar");
//        complileTime.Names("Khan", 25);
        complileTime.show(23,"hello");
        complileTime.show("world",45);
        System.out.println(complileTime.UserDeatils(23,73033029));
    }
}
