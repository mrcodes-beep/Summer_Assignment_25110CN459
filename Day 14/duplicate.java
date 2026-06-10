import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Duplicate elements are:");

        boolean duplicateFound = false;

        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No duplicate elements found.");
        }

        sc.close();
    }
}