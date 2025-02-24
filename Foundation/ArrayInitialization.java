import java.util.*;

public class ArrayInitialization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        System.out.println("Enter choice between 1-2: ");
        choice = scan.nextInt();

        if (choice == 1){
            int[] numbers = new int[5];
            numbers[0] = 10;
            numbers[1] = 20;

        }else{
            int[] numbers = {10, 20, 30, 40, 50};

        }
        scan.close();
    }
}
