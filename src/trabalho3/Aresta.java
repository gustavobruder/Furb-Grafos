package trabalho3;

/*
 * @autor: Gustavo Baroni Bruder
 * */
public class Aresta implements Comparable<Aresta> {
    private final Vertice origem;
    private final Vertice destino;
    private final int custo;

    public Aresta(Vertice origem, Vertice destino, int custo) {
        this.origem = origem;
        this.destino = destino;
        this.custo = custo;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public int getCusto() {
        return custo;
    }

    @Override
    public int compareTo(Aresta outraAresta) {
        if (this.getCusto() > outraAresta.getCusto()) {
            return 1;
        } if (this.getCusto() < outraAresta.getCusto()) {
            return -1;
        }
        return 0;
    }
}
