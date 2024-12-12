import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = new int[15];

        for (int index = 0; index < values.length; index++) {  
            values[index] = in.nextInt();
        }

        heapSort(values);

        in.close();
    }

    public static void heapSort(int[] values) {
        int size = values.length;
    
        for (int halfSize = size / 2 - 1; halfSize >= 0; halfSize--) {
            heapfy(size, halfSize, values);
            show(values);
        }
    
        for (int index = size - 1; index > 0; index--) {
            int temp = values[0];
            values[0] = values[index];
            values[index] = temp;
    
            show(values);

            heapfy(index, 0, values);

            show(values);

            show(values);
        }

    }
    
    public static void heapfy(int size, int halfSize, int[] values) {
        int largest = halfSize;
        int left = 2 * halfSize + 1;
        int right = 2 * halfSize + 2;
    
        if (left < size && values[left] > values[largest]) {
            largest = left;
        }
    
        if (right < size && values[right] > values[largest]) {
            largest = right;
        }
    
        if (largest != halfSize) {
            int temp = values[halfSize];
            values[halfSize] = values[largest];
            values[largest] = temp;
    
            heapfy(size, largest, values);
        }
    }
    

    public static void show(int[] values) {
        for (int index = 0; index < values.length; index++) {
            if (index > 0) {
                System.out.print(" ");
            }
            System.out.print(values[index]);
        }
        System.out.println();
    }
}
