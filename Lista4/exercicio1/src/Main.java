import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        int[] num = new int[tamanho];

        for (int a = 0; a< tamanho; a++) {  
            num[a] = scanner.nextInt();
        }

        boolean change;
        do {
            change = false;
            for (int a = 0; a < num.length -1; a++) { 
                if (num[a] > num[a + 1]) { 
                    int temp = num[a];
                    num[a] = num[a + 1];
                    num[a + 1] = temp;
                    exibirArray(num);
                    change = true;
                }
            }
        } while (change);

        scanner.close();
    }

    public static void exibirArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
