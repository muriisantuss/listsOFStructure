import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaLinearSimples lld = new ListaLinearSimples();
        Scanner in = new Scanner(System.in);
        int strSize = 3;
        int value = 0;

        // Lê valores do usuário até um valor negativo ser fornecido
        while ((value = in.nextInt()) >= 0) {
            // Cria um nó formatado com o valor e o insere na lista
            Node node = new Node(String.format("%0" + strSize + "d", value), value);
            lld.insertInOrd(node);
            lld.show();
        }
        
    }
}