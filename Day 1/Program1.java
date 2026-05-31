
import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int total = (n * (n + 1)) / 2;

        System.out.println("Sum of first " + n + " natural numbers = " + total);

        sc.close();
    }
}