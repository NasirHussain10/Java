import java.util.Scanner;

public class AverageArray {

    public static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter how many numbers: ");
        int n = scan.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scan.nextInt();
        }

        double average = calculateAverage(numbers);
        System.out.println("Average is: " + average);
    }
}
