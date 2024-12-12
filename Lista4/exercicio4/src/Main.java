import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        int[] num = new int[tamanho];

        // Lê os números do usuário
        for (int a = 0; a < tamanho; a++) {
            num[a] = scanner.nextInt();
        }

        int trocas = tamanho / 2;

        // Realiza as trocas
        for (int i = 0; i < trocas; i++) {
            int j = num.length - 1 - i;
            int temp = num[i];
            num[i] = num[j];
            num[j] = temp;

            // Exibe o estado atual do array
            exibirArray(num);
        }

        scanner.close();
    }

    public static void exibirArray(int[] array) {
        for (int a = 0; a < array.length; a++) {
            if (a > 0) {
                System.out.print(" ");
            }
            System.out.print(array[a]);
        }
        System.out.println();
    }
}