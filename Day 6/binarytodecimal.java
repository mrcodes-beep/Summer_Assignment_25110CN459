import java.util.Scanner;

public class binarytodecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binary = sc.nextLong();

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            long digit = binary % 10;
            decimal += digit * (1 << power);
            power++;
            binary /= 10;
        }

        System.out.println("Decimal Number = " + decimal);

        sc.close();
    }
}
