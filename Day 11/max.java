import java.util.Scanner;

public class max {

    static int findMaximum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int max = findMaximum(a, b);

        System.out.println("Maximum number = " + max);

        sc.close();
    }
}