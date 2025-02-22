public class NestedIfStatement {
    public static void main(String[] args) {
        int age = 18;
        
        if (age >= 18) {
            if (age > 21) {
                System.out.println("You are older than 21.");
            } else {
                System.out.println("You are an adult but not older than 21.");
            }
        } else {
            System.out.println("You are a minor.");
        }
    }
}
