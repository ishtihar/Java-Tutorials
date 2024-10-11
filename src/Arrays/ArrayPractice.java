package Arrays;
import java.util.Scanner;
//ishtiharkhan 1995-2024 ye sabse naya hai
public class ArrayPractice {
    public static void main(String[] args) {

//        Create an array of 5 floats and calculate their sum.

        float [] marks={23.4f,45.6f,37.9f,94.3f,53.2f};
        float sum=0;
        for (float elements:marks){
            sum=sum+elements;
        }
//        System.out.println(sum);

//        Write a program to find out whether a given integer is present in an array or not.
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        int [] numbers= {12, 78, 41, 66, 88};
        boolean isFound = false;

        for (int i=0; i<numbers.length; i++){
             if (numbers[i]==input){
                 isFound=true;
                 break;

             }

         }
        if (isFound){
            System.out.println("True");
        }
        else {
            System.out.println("false");

        }



    }
}
