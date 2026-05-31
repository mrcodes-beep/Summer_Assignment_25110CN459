import java.util.Scanner;

public class nthterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter position: ");
        int n = sc.nextInt();

        int first = 0, second = 1;

        if (n == 0) {
            System.out.println(first);
            return;
        }

        for (int i = 2; i <= n; i++) {
            int next = first + second;
            first = second;
            second = next;
        }

        System.out.println("Nth Fibonacci Term = " + second);
    }
}