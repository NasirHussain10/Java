import java.util.*;

public class ArrayElementPrinting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        System.out.println("Enter choice between 1-2: ");
        choice = scan.nextInt();

        if (choice == 1){
            int[] numbers = new int[5];
            numbers[0] = 10;
            numbers[1] = 20;

            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }

        }else{
                int[] Numbers = {10, 20, 30, 40, 50};

                for (int i = 0; i < Numbers.length; i++) {
                System.out.println(Numbers[i]);

                }
            scan.close();
        }
    }    
}