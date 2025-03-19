public class MethodOverloading {
    static class Employee {
        public double calculateBonus(int salary) {
            return salary * 0.05;
        }
        
        public double calculateBonus(double salary, int rating) {
            if (rating == 5) return salary * 0.20;
            else if (rating == 4) return salary * 0.15;
            else if (rating == 3) return salary * 0.10;
            
            else if (rating == 2) return salary * 0.05;
            else if (rating == 1) return 0.0;
            else {
                System.out.println("Error: Rating must be between 1 and 5");
                return 0.0;
            }
        }
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        
        int baseSalary = 50000;
        double basicBonus = emp.calculateBonus(baseSalary);
        System.out.println("Basic bonus for $" + baseSalary + " is $" + basicBonus);
        
        double yearlySalary = 60000.0;
        
        double bonus5 = emp.calculateBonus(yearlySalary, 5);
        System.out.println("Rating 5 bonus for $" + yearlySalary + " is $" + bonus5);
        
        double bonus4 = emp.calculateBonus(yearlySalary, 4);
        System.out.println("Rating 4 bonus for $" + yearlySalary + " is $" + bonus4);
        
        double bonus3 = emp.calculateBonus(yearlySalary, 3);
        System.out.println("Rating 3 bonus for $" + yearlySalary + " is $" + bonus3);
        
        double bonus2 = emp.calculateBonus(yearlySalary, 2);
        System.out.println("Rating 2 bonus for $" + yearlySalary + " is $" + bonus2);
        
        double bonus1 = emp.calculateBonus(yearlySalary, 1);
        System.out.println("Rating 1 bonus for $" + yearlySalary + " is $" + bonus1);
        
        double invalidBonus = emp.calculateBonus(yearlySalary, 6);
        System.out.println("Invalid rating bonus for $" + yearlySalary + " is $" + invalidBonus);
    }
}
