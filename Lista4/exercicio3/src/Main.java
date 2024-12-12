import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = new int[10];

        for (int index = 0; index < values.length; index++) {  
            values[index] = in.nextInt();
        }

        insertionSort(values);

        in.close();
    }

    public static void insertionSort (int[] values) {
        boolean firstIteration = true;

        for (int index = 1; index < values.length; index++) {
            int current = values[index];
            int tempIndex = index - 1;
            
            while (tempIndex >= 0 && values[tempIndex] > current) {
                if (!firstIteration) {
                    show(values);
                }
                
                // show(values);
                values[tempIndex + 1] = values[tempIndex];
                tempIndex--;
            }
            show(values);
            
            values[tempIndex + 1] = current;
            
            firstIteration = false;
        }

        show(values);
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
