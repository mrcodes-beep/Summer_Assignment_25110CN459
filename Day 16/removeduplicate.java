import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        LinkedHashSet<Integer> uniqueElements = new LinkedHashSet<>();

        for (int num : arr) {
            uniqueElements.add(num);
        }

        System.out.println("Array after removing duplicates:");

        for (int num : uniqueElements) {
            System.out.print(num + " ");
        }
    }
}
