import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num;
        int numerator, denominator;

        System.out.println("Enter the first number:");
        numerator = scan.nextInt();

        System.out.println("Enter the second number:");
        denominator = scan.nextInt();

        num = numerator / denominator;

        System.out.printf("The fraction of %d and %d is: %.2f", numerator, denominator, num);
        scan.close();
    }
}
