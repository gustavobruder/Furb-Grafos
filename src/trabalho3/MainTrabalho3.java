package trabalho3;

import java.util.Scanner;

/*
 * @autor: Gustavo Baroni Bruder
 * */
public class MainTrabalho3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] verticesArestas = scanner.nextLine().split(" ");

        int qtdVertices = Integer.parseInt(verticesArestas[0]);
        int qtdArestas = Integer.parseInt(verticesArestas[1]);
        Trabalho3 trabalho3 = new Trabalho3(qtdVertices, qtdArestas);

        for (int i = 0; i < qtdArestas; i++) {
            String[] verticesCustos = scanner.nextLine().split(" ");

            int verticeOrigem = Integer.parseInt(verticesCustos[0]);
            int verticeDestino = Integer.parseInt(verticesCustos[1]);
            int custo = Integer.parseInt(verticesCustos[2]);
            trabalho3.adicionarAresta(verticeOrigem, verticeDestino, custo);
        }

        scanner.close();

        int custoTotalMinimo = trabalho3.executarKruskal();
        System.out.println("Custo total mínimo: " + custoTotalMinimo);
    }
}
