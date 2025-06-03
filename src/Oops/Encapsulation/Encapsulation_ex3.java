package Oops.Encapsulation;

//student marks check
class Students{
    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        if (marks>=0 && marks<=100){
            this.marks = marks;
            System.out.println("Marks is greater "+marks);
        }
        else {
            System.out.println("Marks is less");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
        private int marks;

}

public class Encapsulation_ex3 {
    public static void main(String[] args) {
   Students students=new Students();
   students.setName("Ishtihar");
   students.setMarks(50);
        System.out.println("Name is " + students.getName());

    }
}
//