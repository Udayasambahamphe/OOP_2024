import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter current salary: ");
        double current_salary = scanner.nextDouble();

        System.out.println("Enter performance rating (Excellent, Good or Poor): ");
        scanner.nextLine();
        String performance_rating = scanner.nextLine();

        double raise_percent;
        if (performance_rating.equals("Excellent")) {
            raise_percent = 6.0;
        } else if (performance_rating.equals("Good")) {
            raise_percent = 4.0;
        } else if (performance_rating.equals("Poor")) {
            raise_percent = 1.5;
        } else {
            System.out.println("Invalid performance rating.");
            return;
        }

        double raise = current_salary * (raise_percent / 100);
        double salary_raised = current_salary + raise;

        System.out.println("Raise: $" + raise);
        System.out.println("New Salary: $" + salary_raised);

        scanner.close();
    }
}
