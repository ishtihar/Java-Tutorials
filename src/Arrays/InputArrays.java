package Arrays;

import java.util.Scanner;

public class InputArrays {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=scanner.nextInt();
        int[] numbers = new int[size];

        for (int i=0;i<size;i++){
            System.out.println("Assign the value "+ i);
            numbers[i]=scanner.nextInt();


        }

        //output
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number value "+numbers[i]);
        }
    }
}

