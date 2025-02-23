import java.util.*;

public class DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char ch;

        do {
            System.out.println("Do you love me ?(y/n) ");
            ch = scan.next().charAt(0);

        } while (ch == 'y' || ch == 'Y');
    }
}
