import java.util.Scanner;

public class SymmetricalImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int n = in.nextInt();
        System.out.println("Please enter the number of columns: ");
        int m = in.nextInt();

        int[][] image = new int[n][m];

        for (int p = 0; p < (n * m / 4); p++) {
            int i = (int)(Math.random() * n);
            int j = (int)(Math.random() * (m / 2.0));

            image[i][j] = 1;
        }


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (m / 2); j++) {
                if (image[i][j] == 1) {
                    image[i][m - 1 - j] = 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (image[i][j] == 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}