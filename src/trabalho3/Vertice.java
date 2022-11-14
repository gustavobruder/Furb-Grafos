package trabalho3;

import java.util.ArrayList;

/*
 * @autor: Gustavo Baroni Bruder
 * */
public class Vertice {
    private final int vertice;
    private ArrayList<Vertice> conjunto;

    public Vertice(int vertice) {
        this.vertice = vertice;
        this.conjunto = new ArrayList<Vertice>();
        this.conjunto.add(this);
    }

    public int getVertice() {
        return vertice;
    }

    public ArrayList<Vertice> getConjunto() {
        return conjunto;
    }

    private void setConjunto(ArrayList<Vertice> conjunto) {
        this.conjunto = conjunto;
    }

    public void unirConjuntos(Vertice outroVertice) {
        this.getConjunto().addAll(outroVertice.getConjunto());

        for (Vertice vertice : outroVertice.getConjunto()) {
            vertice.setConjunto(this.getConjunto());
        }
    }
}
