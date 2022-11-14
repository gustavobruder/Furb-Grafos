package trabalho3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Trabalho3Tests {

    @Test
    public void deveExecutar_AlgoritmoKruskal1() {
        // Entrada
        // 5 6
        // 1 2 15
        // 1 3 10
        // 2 3 1
        // 3 4 3
        // 2 4 5
        // 4 5 20
        //
        // Saída
        // 34

        Trabalho3 trab = new Trabalho3(5, 6);
        trab.adicionarAresta(1, 2, 15);
        trab.adicionarAresta(1, 3, 10);
        trab.adicionarAresta(2, 3, 1);
        trab.adicionarAresta(3, 4, 3);
        trab.adicionarAresta(2, 4, 5);
        trab.adicionarAresta(4, 5, 20);

        assertEquals(34, trab.executarKruskal());
    }

    @Test
    public void deveExecutar_AlgoritmoKruskal2() {
        // Entrada
        // 4 6
        // 1 2 1
        // 1 3 10
        // 1 4 1
        // 2 3 1
        // 2 4 10
        // 3 4 1
        //
        // Saída
        // 3

        Trabalho3 trab = new Trabalho3(4, 6);
        trab.adicionarAresta(1, 2, 1);
        trab.adicionarAresta(1, 3, 10);
        trab.adicionarAresta(1, 4, 1);
        trab.adicionarAresta(2, 3, 1);
        trab.adicionarAresta(2, 4, 10);
        trab.adicionarAresta(3, 4, 1);

        assertEquals(3, trab.executarKruskal());
    }
}
