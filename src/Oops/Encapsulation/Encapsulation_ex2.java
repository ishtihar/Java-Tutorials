package Oops.Encapsulation;
//check and store password
class Password {
    public boolean checkPass(String inputpass) {
      return inputpass.equals(this.pass);
    }

    public void setPass(String pass) {
        if (pass.length()>=8){
            this.pass=pass;
            System.out.println("Password is "+ this.pass);
        }
        else {
            System.out.println("password too short");
        }    }

    private String pass;

}

public class Encapsulation_ex2 {
    public static void main(String[] args) {
     Password password=new Password();
     password.setPass("heigggtgtgtd");
     boolean isPasswordCorrect=password.checkPass("heigggtgtgtd");
     if (isPasswordCorrect){
         System.out.println("Correct password");
     }
     else {
         System.out.println("wrong password");
     }
    }
}
