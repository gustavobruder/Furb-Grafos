package trabalho1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/*
 * @autor: Gustavo Baroni Bruder
 * */
public class Trabalho1 {

    private static final String SEPARADOR_DE_TIPOS = ", ";
    private static final String DIRIGIDO = "dirigido";
    private static final String NAO_DIRIGIDO = "não dirigido";
    private static final String SIMPLES = "simples";
    private static final String MULTIGRAFO = "multigrafo";
    private static final String REGULAR = "regular";
    private static final String COMPLETO = "completo";
    private static final String NULO = "nulo";
    private static final String BIPARTIDO = "bipartido";

    public String tipoDoGrafo(int[][] matriz) {
        String tiposDoGrafo = "";

        String dirigidoOuNao =  this.grafoDirigidoOuNaoDirigido(matriz);
        tiposDoGrafo += dirigidoOuNao;

        String simplesOuMultigrafo =  this.grafoSimplesOuMultigrafo(matriz);
        tiposDoGrafo += SEPARADOR_DE_TIPOS + simplesOuMultigrafo;

        String regular;

        if (tiposDoGrafo.contains(NAO_DIRIGIDO)) {
            regular = this.grafoRegularNaoDirigido(matriz);
        } else {
            regular = this.grafoRegularDirigido(matriz);
        }

        if (regular != null) {
            tiposDoGrafo += SEPARADOR_DE_TIPOS + regular;
        }

        String completo = this.grafoCompleto(matriz);
        if (completo != null) {
            tiposDoGrafo += SEPARADOR_DE_TIPOS + completo;
        }

        String nulo = this.grafoNulo(matriz);
        if (nulo != null) {
            tiposDoGrafo += SEPARADOR_DE_TIPOS + nulo;
        }

        String bipartido = this.grafoBipartido(matriz);
        if (bipartido != null) {
            tiposDoGrafo += SEPARADOR_DE_TIPOS + bipartido;
        }

        return tiposDoGrafo;
    }

    private String grafoDirigidoOuNaoDirigido(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz.length; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    return DIRIGIDO;
                }
            }
        }
        return NAO_DIRIGIDO;
    }

    private String grafoSimplesOuMultigrafo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    if (matriz[i][j] > 0) {
                        return MULTIGRAFO;
                    }
                } else {
                    if (matriz[i][j] > 1) {
                        return MULTIGRAFO;
                    }
                }
            }
        }
        return SIMPLES;
    }

    private String grafoRegularNaoDirigido(int[][] matriz) {
        int grauPrimeiroVertice = matriz[0][0] * 2;

        for (int j = 1; j < matriz.length; j++) {
            grauPrimeiroVertice += matriz[0][j];
        }

        for (int i = 1; i < matriz.length; i++) {
            int grauVertice = 0;

            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    grauVertice += matriz[i][j] * 2;
                } else {
                    grauVertice += matriz[i][j];
                }
            }

            if (grauPrimeiroVertice != grauVertice) {
                return null;
            }
        }
        return REGULAR;
    }

    private String grafoRegularDirigido(int[][] matriz) {
        int grauEntradaPrimeiroVertice = matriz[0][0];
        int grauSaidaPrimeiroVertice = matriz[0][0];

        for (int i = 1; i < matriz.length; i++) {
            grauEntradaPrimeiroVertice += matriz[i][0];
        }
        for (int j = 1; j < matriz.length; j++) {
            grauSaidaPrimeiroVertice += matriz[0][j];
        }

        for (int vertice = 1; vertice < matriz.length; vertice++) {
            int grauEntradaVertice = 0;
            int grauSaidaVertice = 0;

            for (int i = 0; i < matriz.length; i++) {
                grauEntradaVertice += matriz[i][vertice];
            }
            for (int j = 0; j < matriz.length; j++) {
                grauSaidaVertice += matriz[vertice][j];
            }

            boolean grausEntradaDiferentes = (grauEntradaPrimeiroVertice != grauEntradaVertice);
            boolean grausSaidaDiferentes = (grauSaidaPrimeiroVertice != grauSaidaVertice);

            if (grausEntradaDiferentes || grausSaidaDiferentes) {
                return null;
            }
        }

        return REGULAR;
    }

    private String grafoCompleto(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j) {
                    if (matriz[i][j] != 0) {
                        return null;
                    }
                } else {
                    if (matriz[i][j] != 1) {
                        return null;
                    }
                }
            }
        }
        return COMPLETO;
    }

    private String grafoNulo(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > 0) {
                    return null;
                }
            }
        }
        return NULO;
    }

    private String grafoBipartido(int[][] matriz) {
        HashSet<Integer> conjuntoVertices1 = new HashSet<Integer>(matriz.length);
        HashSet<Integer> conjuntoVertices2 = new HashSet<Integer>(matriz.length);
        conjuntoVertices1.add(0);

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                int verticeAtual = i;
                int verticeLigado = j;

                boolean verticesTemLigacao = matriz[i][j] > 0;
                boolean verticeAtualEstaNoConjunto1 = conjuntoVertices1.contains(verticeAtual);
                boolean verticeAtualEstaNoConjunto2 = conjuntoVertices2.contains(verticeAtual);
                boolean verticeLigadoEstaNoConjunto1 = conjuntoVertices1.contains(verticeLigado);
                boolean verticeLigadoEstaNoConjunto2 = conjuntoVertices2.contains(verticeLigado);

                if (verticesTemLigacao) {
                    if (verticeAtualEstaNoConjunto1 && verticeLigadoEstaNoConjunto1) {
                        return null;
                    }
                    if (verticeAtualEstaNoConjunto2 && verticeLigadoEstaNoConjunto2) {
                        return null;
                    }

                    if (verticeLigadoEstaNoConjunto1) {
                        conjuntoVertices2.add(verticeAtual);
                    } else {
                        conjuntoVertices1.add(verticeAtual);
                    }
                } else {
                    if (!verticeAtualEstaNoConjunto1 && !verticeAtualEstaNoConjunto2) {
                        conjuntoVertices1.add(verticeAtual);
                    }
                }
            }
        }
        return BIPARTIDO;
    }

    public String arestasDoGrafo(int[][] matriz) {
        int qtdArestas = 0;
        ArrayList<String> conjuntoArestas = new ArrayList<String>();

        String dirigidoOuNao =  this.grafoDirigidoOuNaoDirigido(matriz);

        if (dirigidoOuNao.equals(DIRIGIDO)) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    qtdArestas += matriz[i][j];

                    if (matriz[i][j] > 0) {
                        conjuntoArestas.add(String.format("(v%s,v%s)", (i+1), (j+1)));
                    }
                }
            }
        } else {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = i; j < matriz.length; j++) {
                    qtdArestas += matriz[i][j];

                    if (matriz[i][j] > 0) {
                        conjuntoArestas.add(String.format("(v%s,v%s)", (i+1), (j+1)));
                    }
                }
            }
        }

        return String.format("Quantidade de arestas: %s. E = { %s }", qtdArestas, String.join(", ", conjuntoArestas));
    }

    public String grausDoVertice(int[][] matriz) {
        String dirigidoOuNao =  this.grafoDirigidoOuNaoDirigido(matriz);

        if (dirigidoOuNao.equals(DIRIGIDO)) {
            ArrayList<String> verticesGrausEntradas = new ArrayList<String>();
            ArrayList<Integer> sequenciaGrausEntradas = new ArrayList<Integer>();
            ArrayList<String> verticesGrausSaidas = new ArrayList<String>();
            ArrayList<Integer> sequenciaGrausSaidas = new ArrayList<Integer>();

            for (int vertice = 0; vertice < matriz.length; vertice++) {
                int grauEntradaVertice = 0;
                int grauSaidaVertice = 0;

                for (int i = 0; i < matriz.length; i++) {
                    grauEntradaVertice += matriz[i][vertice];
                }
                for (int j = 0; j < matriz.length; j++) {
                    grauSaidaVertice += matriz[vertice][j];
                }

                verticesGrausEntradas.add(String.format("v%s = %s", (vertice+1), grauEntradaVertice));
                sequenciaGrausEntradas.add(grauEntradaVertice);
                verticesGrausSaidas.add(String.format("v%s = %s", (vertice+1), grauSaidaVertice));
                sequenciaGrausSaidas.add(grauSaidaVertice);
            }

            Collections.sort(sequenciaGrausEntradas);
            Collections.sort(sequenciaGrausSaidas);

            String msgGrausEntradas = String.format("Graus de entrada de cada vértice: %s", verticesGrausEntradas);
            String msgSequenciaEntradas = String.format("Sequência de graus de entrada: %s", sequenciaGrausEntradas);
            String msgGrausSaidas = String.format("Graus de saida de cada vértice: %s", verticesGrausSaidas);
            String msgSequenciaSaidas = String.format("Sequência de graus de saida: %s", sequenciaGrausSaidas);
            return String.format("%s.\n%s.\n%s.\n%s.", msgGrausEntradas, msgSequenciaEntradas, msgGrausSaidas, msgSequenciaSaidas);
        } else {
            ArrayList<String> verticesGraus = new ArrayList<String>();
            ArrayList<Integer> sequenciaGraus = new ArrayList<Integer>();

            for (int i = 0; i < matriz.length; i++) {
                int grauVertice = 0;

                for (int j = 0; j < matriz.length; j++) {
                    if (i == j) {
                        grauVertice += matriz[i][j] * 2;
                    } else {
                        grauVertice += matriz[i][j];
                    }
                }

                verticesGraus.add(String.format("v%s = %s", (i+1), grauVertice));
                sequenciaGraus.add(grauVertice);
            }

            Collections.sort(sequenciaGraus);

            String msgGraus = String.format("Graus de cada vértice: %s", verticesGraus);
            String msgSequencia = String.format("Sequência de graus: %s", sequenciaGraus);
            return String.format("%s.\n%s.", msgGraus, msgSequencia);
        }
    }
}
