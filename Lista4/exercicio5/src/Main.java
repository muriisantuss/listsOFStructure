import java.util.Scanner;

public class Main {
    private long[] values;
    private int count = 0;

    public Main(long[] values) {
        this.values = values;
    }

    public long getSize() {
        return values.length;
    }

    private void sort(long began, long end) {
        int i = (int) began, j = (int) end - 1;
        int pivo = (int) this.values[(int) ((began + end) / 2)];

        while (i <= j) {
            while (values[i] < pivo && i < end) i++;
            while (values[j] > pivo && j > began) j--;
            if (i <= j) {
                swap(i, j);
                if (count < 20) {
                    show();
                    count++;
                }
                i++;
                j--;
            }
        }

        if (j > began) sort(began, j + 1);
        if (i < end) sort(i, end);
    }

    public void sort() {
        sort(0, (int) getSize());
    }

    private void swap(int idx, int i) {
        long temp = values[idx];
        values[idx] = values[i];
        values[i] = temp;
    }

    public void show() {
        long size = this.getSize();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(values[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] array = new long[15];

        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextLong();
        }

        Main quicksort = new Main(array);
        quicksort.sort();
        quicksort.show();
        scanner.close();
    }
}
