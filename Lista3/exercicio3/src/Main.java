import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EDStack stkl = new EDStack();
        EDStack stk2 = new EDStack();
        Scanner in = new Scanner(System.in);
        int value = 0;
        int factor = 2;

        // Leitura de valores e preenchimento das pilhas
        while ((value = in.nextInt()) >= 0) {
            Node nl = new Node(value + "", value);
            stkl.push(nl);
            Node n2 = new Node((value * factor) + "", value * factor);
            stk2.push(n2);
        }

        EDStackMerged mstk = new EDStackMerged();
        EDStack newStk = mstk.merge(stkl, stk2);
        newStk.show();
        in.close();
    }
}
