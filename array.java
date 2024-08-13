import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows and column : ");
            int row = sc.nextInt();
            int column = sc.nextInt();

            int a[][] = new int[row][column];
            System.out.println("Enter the value: ");
            for (int i = 0; i < row; i++) {
                for (var j = 0; j < column; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter the number for the search: ");
            int search = sc.nextInt();

            for (int i = 0; i < row; i++) {
                for (var j = 0; j < column; j++) {
                    if (a[i][j] == search) {
                        System.out.println("Index of enter number : " + i + " " + j);
                    }

                }
            }
            System.out.println("Output of the array: ");
            for (int i = 0; i < row; i++) {
                for (var j = 0; j < column; j++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
