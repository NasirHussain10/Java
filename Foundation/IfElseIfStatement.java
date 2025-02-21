import java.util.*;

public class IfElseIfStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Enter any number");
        num = scan.nextInt();
        
        if (num %2==0) {
            System.out.println("Even Number");
        } else if (num %2!=0) {
            System.out.println("Odd number");
        } else {
            System.out.println("Invalid Number!");
        }
    }
}
