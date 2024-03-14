import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float l, area, perimeter;

        System.out.println("Enter L:");
        l = scan.nextFloat();

        area = l * l;
        perimeter = 4 * l;
        System.out.printf("The area of square is %f\n", area);
        System.out.printf("The perimeter of square is %f", perimeter);

        scan.close();
    }
}
