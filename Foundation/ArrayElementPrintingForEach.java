import java.util.Scanner;

public class ArrayElementPrintingForEach {
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice;
        System.out.println("Enter choice between 1-2: ");
        choice = scan.nextInt();

        if (choice == 1){
            int[] numbers = new int[5];
            numbers[0] = 10;
            numbers[1] = 20;

            for (int num : numbers) {
                System.out.println(num);
            }

        }else{
                int[] Numbers = {10, 20, 30, 40, 50};

                for (int num : Numbers) {
                    System.out.println(num);
                }
            scan.close();
        }
    }    
}
