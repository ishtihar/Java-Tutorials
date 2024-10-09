package Arrays;
import java.util.*;
public class Arrays {
    public static void main(String[] args) {
//        int [] number= {2,4,64,2};
//        for (int i=0; i<3;i++){
//        System.out.println(number[i]);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter array size");
        int size=scanner.nextInt();
        int[] numbers = new int[size];

        for (int i=0;i<size;i++){
            System.out.println("Assign the value "+ i);
            numbers[i]=scanner.nextInt();


        }
        System.out.println("Enter value which you want to search");
        int x=scanner.nextInt();

        //output
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]==x){
                System.out.println("Value x on index of "+ i);
            }

        }
    }
}
