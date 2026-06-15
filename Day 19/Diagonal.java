import java.util.Scanner;

public class Diagonal{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int diagonalSum = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];
        }

        System.out.println("Sum of Principal Diagonal = " + diagonalSum);

        sc.close();
    }
}