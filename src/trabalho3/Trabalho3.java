package trabalho3;

import java.util.ArrayList;
import java.util.Collections;

/*
 * @autor: Gustavo Baroni Bruder
 * */
public class Trabalho3 {
    private final int qtdVertices;
    private final int qtdArestas;
    private final ArrayList<Vertice> vertices;
    private final ArrayList<Aresta> arestas;

    public Trabalho3(int qtdVertices, int qtdArestas) {
        this.qtdVertices = qtdVertices;
        this.qtdArestas = qtdArestas;
        this.vertices = new ArrayList<Vertice>(this.qtdVertices);
        for (int i = 1; i <= this.qtdVertices; i++) {
            this.vertices.add(new Vertice(i));
        }
        this.arestas = new ArrayList<Aresta>(this.qtdArestas);
    }

    public void adicionarAresta(int origem, int destino, int custo) {
        Vertice verticeOrigem = this.vertices.get(origem - 1); // vertice = 1 -> index = 0
        Vertice verticeDestino = this.vertices.get(destino - 1); // vertice = 1 -> index = 0
        this.arestas.add(new Aresta(verticeOrigem, verticeDestino, custo));
    }

    public int executarKruskal() {
        int custoTotalMinimo = 0;

        Collections.sort(this.arestas);

        for (Aresta aresta : this.arestas) {
            if (!aresta.getOrigem().getConjunto().equals(aresta.getDestino().getConjunto())) {
                custoTotalMinimo += aresta.getCusto();
                aresta.getOrigem().unirConjuntos(aresta.getDestino());
            }
        }

        return custoTotalMinimo;
    }
}
