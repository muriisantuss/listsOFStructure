import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[15];

        System.out.println("Digite 15 números inteiros:");
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }

        quickSoft(array, 0, array.length - 1);

        System.out.println("Vetor ordenado em ordem decrescente:");
        for (int value : array) {
            System.out.print(value + " ");
        }

        scanner.close();
    }

    public static void quickSoft(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSoft(array, low, pivotIndex - 1);
            quickSoft(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] > pivot) { 
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
