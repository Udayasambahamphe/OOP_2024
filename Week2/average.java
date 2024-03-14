import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, num1, num2, num3;

        System.out.println("Enter the first number:");
        num = scan.nextInt();

        System.out.println("Enter the second number:");
        num1 = scan.nextInt();

        System.out.println("Enter the second number:");
        num2 = scan.nextInt();

        num3 = (num + num1 + num2) / 3;
        System.out.printf("The average of %d,%d and %d is: %d", num, num1, num2, num3);
        scan.close();
    }
}
