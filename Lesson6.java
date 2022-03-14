import java.util.Scanner;

public class Lesson6 {

    // BubbleSort
    public void BubbleSort(int[] arr) {
        int temp = 0;
        int n = arr.length;

        // Swap
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display
        for (int i = 0; i < arr.length; i++) {
            System.out.printf(" %d", arr[i]);
        }

    }

    // Main
    public static void main(String[] args) {
        Lesson6 lesson6 = new Lesson6();
        Scanner sc = new Scanner(System.in);

        System.out.println("How many number do you want ?");
        System.out.println("Input: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input array
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]: ", i);
            a[i] = sc.nextInt();
        }
        System.out.println();

        // Array before sort
        for (int i = 0; i < a.length; i++) {
            System.out.printf("a[%d]: %d", i, a[i]);
            System.out.println();
        }

        lesson6.BubbleSort(a);

        sc.close();
    }


}
