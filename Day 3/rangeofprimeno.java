import java.util.Scanner;

public class rangeofprimeno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int n = start; n <= end; n++) {
            boolean prime = true;

            if (n <= 1)
                prime = false;
            else {
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        prime = false;
                        break;
                    }
                }
            }

            if (prime)
                System.out.print(n + " ");
        }
    }
}