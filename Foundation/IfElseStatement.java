import java.util.*;

public class IfElseStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age ;
        
        System.out.println("Enter your age: ");
        age = scan.nextInt();

        if (age >= 18) {
            System.out.println("You are an adult.");
        }else{
            System.out.println("You are under age");
        }
    }
}
