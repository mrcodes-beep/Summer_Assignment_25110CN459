import java.util.HashMap;
import java.util.Scanner;

public class maxfreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxElement = arr[0];
        int maxFrequency = 0;

        for (int key : frequencyMap.keySet()) {
            if (frequencyMap.get(key) > maxFrequency) {
                maxFrequency = frequencyMap.get(key);
                maxElement = key;
            }
        }

        System.out.println("Maximum Frequency Element = " + maxElement);
        System.out.println("Frequency = " + maxFrequency);
    }
}
