import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[15];

        System.out.println("Digite 15 valores inteiros:");
        for (int a = 0; a < 15; a++) {
            values[a] = scanner.nextInt();
        }

        heapSort(values);

        System.out.println("Valores ordenados em ordem decrescente:");
        for (int value : values) {
            System.out.print(value + " ");
        }

    }

    private static void heapSort(int[] array) {
        int n = array.length;

        for (int a = n / 2 - 1; a >= 0; a--) {
            heapify(array, n, a);
        }

        for (int a = n - 1; a > 0; a--) {
            int temp = array[0];
            array[0] = array[a];
            array[a] = temp;

            heapify(array, a, 0);
        }

        for (int a = 0; a < n / 2; a++) {
            int temp = array[a];
            array[a] = array[n - 1 - a];
            array[n - 1 - a] = temp;
        }
    }

    private static void heapify(int[] array, int n, int a) {
        int largest = a;
        int left = 2 * a + 1;
        int right = 2 * a + 2;

        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != a) {
            int swap = array[a];
            array[a] = array[largest];
            array[largest] = swap;

            heapify(array, n, largest);
        }
    }
}
