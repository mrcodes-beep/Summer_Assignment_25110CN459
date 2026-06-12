import java.util.HashSet;
import java.util.Scanner;

public class pair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum: ");
        int target = sc.nextInt();

        HashSet<Integer> set = new HashSet<>();
        boolean found = false;

        for (int num : arr) {
            int needed = target - num;

            if (set.contains(needed)) {
                System.out.println("Pair Found: " + needed + " + " + num + " = " + target);
                found = true;
                break;
            }

            set.add(num);
        }

        if (!found) {
            System.out.println("No pair found.");
        }
    }
}