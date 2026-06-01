import java.util.Scanner;

public class largestprimefactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();

        long largestPrimeFactor = 0;

        for (long i = 2; i <= number; i++) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number = number / i;
            }
        }

        System.out.println("Largest Prime Factor = " + largestPrimeFactor);

        sc.close();
    }
}
