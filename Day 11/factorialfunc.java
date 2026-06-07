import java.util.Scanner;

public class factorialfunc {

    static long findFactorial(int number) {
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long result = findFactorial(num);

        System.out.println("Factorial = " + result);

        sc.close();
    }
}