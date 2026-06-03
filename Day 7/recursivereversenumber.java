import java.util.Scanner;

public class recursivereversenumber {

    static int reverse(int n, int rev) {
        if (n == 0)
            return rev;

        return reverse(n / 10, rev * 10 + (n % 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int num = sc.nextInt();

        int reversed = reverse(Math.abs(num), 0);

        if (num < 0)
            reversed = -reversed;

        System.out.println("Original Number : " + num);
        System.out.println("Reversed Number : " + reversed);

        sc.close();
    }
}
