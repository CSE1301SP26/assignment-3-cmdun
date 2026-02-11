import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter array length: ");
        int n = in.nextInt();
        int[] array = new int[n];
        int placeholder;

        for (int p = 0; p < n; p++) {
            System.out.print("Please enter values into the array: ");
            array[p] = in.nextInt();
        }

        System.out.print("Given values: ");
        for (int x = 0; x < n; x++) {
            System.out.print(array[x] + " ");
        }
        System.out.println();


        in.close();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (array[j - 1] > array[j]) {
                    placeholder = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = placeholder;
                } 
            }
        }

        System.out.print("Sorted values: ");
        for (int z = 0; z < n; z++) {
            System.out.print(array[z] + " ");
        }
    }
}
