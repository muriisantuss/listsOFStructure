import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaLinearSimples list = new ListaLinearSimples();
        Scanner in = new Scanner(System.in);
        int value = 0;

        while ((value = in.nextInt()) >= 0) {
            Node node1 = new Node(value + "", value);
            list.add(node1);
            Node node2 = new Node(value + "", value);
            list.append(node2);
            list.show();
        }

        while (!list.empty()) {
            list.remove();
            list.pop();
            list.show();
        }

        in.close();
    }
}
