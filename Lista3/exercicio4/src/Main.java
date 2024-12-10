import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EDQueue queue1 = new EDQueue();
        EDQueue queue2 = new EDQueue();
        Scanner in = new Scanner(System.in);
        int value = 0;
        int factor = 3;

        // Leitura dos valores e enfileiramento
        while ((value = in.nextInt()) >= 0) {
            Node n1 = new Node(value + "", value);
            queue1.enqueue(n1);

            Node n2 = new Node((value * factor) + "", value * factor);
            queue2.enqueue(n2);
        }

        // Mesclagem das filas
        EDQueueMerged mqueue = new EDQueueMerged();
        EDQueue mergedQueue = mqueue.merge(queue1, queue2);

        // Exibição dos elementos da fila mesclada
        mergedQueue.show();
    }
}
