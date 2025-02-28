import java.util.Scanner;

public class MaxMinArray {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
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

        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
