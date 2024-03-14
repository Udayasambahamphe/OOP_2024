import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float mile, km;

        System.out.println("Enter the distance in miles:");
        mile = scan.nextFloat();

        km = mile * 1.60f;

        System.out.printf("The distance in kilometers is: %.2f", km);

        scan.close();
    }
}
