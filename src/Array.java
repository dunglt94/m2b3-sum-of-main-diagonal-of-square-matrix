import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][];
        int rows, cols;
        int sum = 0;

        do {
            System.out.print("Enter the size of the matrix: ");
            rows = cols = scanner.nextInt();
            if (rows < 1) System.out.println("Invalid input!");
            else if (rows > 5) System.out.println("Size does not exceed 5!");
        } while (rows < 1 || rows > 5);
        arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for row " + (i + 1) + ": ");
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j) sum += arr[i][j];
            }
        }
        System.out.println("The sum of the main diagonal of the matrix is: " + sum);
    }
}
