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

    @Test
    public void deveExecutar_AlgoritmoKruskal3() {
        // Entrada
        // 6 11
        // 1 2 4
        // 1 4 3
        // 1 5 4
        // 2 3 8
        // 2 5 9
        // 2 6 5
        // 3 4 9
        // 3 5 3
        // 3 6 2
        // 4 6 7
        // 5 6 2
        //
        // Saída
        // 15

        Trabalho3 trab = new Trabalho3(6, 11);
        trab.adicionarAresta(1, 2, 4);
        trab.adicionarAresta(1, 4, 3);
        trab.adicionarAresta(1, 5, 4);
        trab.adicionarAresta(2, 3, 8);
        trab.adicionarAresta(2, 5, 9);
        trab.adicionarAresta(2, 6, 5);
        trab.adicionarAresta(3, 4, 9);
        trab.adicionarAresta(3, 5, 3);
        trab.adicionarAresta(3, 6, 2);
        trab.adicionarAresta(4, 6, 7);
        trab.adicionarAresta(5, 6, 2);

        assertEquals(15, trab.executarKruskal());
    }

    @Test
    public void deveExecutar_AlgoritmoKruskal4() {
        // Entrada
        // 12 17
        // 1 2 4
        // 1 9 4
        // 1 12 7
        // 2 3 4
        // 2 11 8
        // 3 4 3
        // 3 12 6
        // 4 5 1
        // 4 11 2
        // 5 6 3
        // 6 10 2
        // 7 8 7
        // 7 10 2
        // 7 12 5
        // 8 9 3
        // 9 10 6
        // 10 11 4
        //
        // Saída
        // 33

        Trabalho3 trab = new Trabalho3(12, 17);
        trab.adicionarAresta(1, 2, 4);
        trab.adicionarAresta(1, 9, 4);
        trab.adicionarAresta(1, 12, 7);
        trab.adicionarAresta(2, 3, 4);
        trab.adicionarAresta(2, 11, 8);
        trab.adicionarAresta(3, 4, 3);
        trab.adicionarAresta(3, 12, 6);
        trab.adicionarAresta(4, 5, 1);
        trab.adicionarAresta(4, 11, 2);
        trab.adicionarAresta(5, 6, 3);
        trab.adicionarAresta(6, 10, 2);
        trab.adicionarAresta(7, 8, 7);
        trab.adicionarAresta(7, 10, 2);
        trab.adicionarAresta(7, 12, 5);
        trab.adicionarAresta(8, 9, 3);
        trab.adicionarAresta(9, 10, 6);
        trab.adicionarAresta(10, 11, 4);

        assertEquals(33, trab.executarKruskal());
    }

    @Test
    public void deveExecutar_AlgoritmoKruskal5() {
        // Entrada
        // 6 11
        // 1 2 20
        // 1 3 55
        // 1 5 45
        // 1 6 10
        // 2 4 5
        // 2 5 21
        // 2 6 70
        // 3 5 45
        // 4 5 55
        // 4 6 300
        // 5 6 4
        //
        // Saída
        // 84

        Trabalho3 trab = new Trabalho3(6, 11);
        trab.adicionarAresta(1, 2, 20);
        trab.adicionarAresta(1, 3, 55);
        trab.adicionarAresta(1, 5, 45);
        trab.adicionarAresta(1, 6, 10);
        trab.adicionarAresta(2, 4, 5);
        trab.adicionarAresta(2, 5, 21);
        trab.adicionarAresta(2, 6, 70);
        trab.adicionarAresta(3, 5, 45);
        trab.adicionarAresta(4, 5, 55);
        trab.adicionarAresta(4, 6, 300);
        trab.adicionarAresta(5, 6, 4);

        assertEquals(84, trab.executarKruskal());
    }

    @Test
    public void deveExecutar_AlgoritmoKruskal6() {
        // Entrada
        // 8 12
        // 4 6 1
        // 2 8 1
        // 7 8 2
        // 1 3 3
        // 1 8 4
        // 1 2 5
        // 4 5 6
        // 6 5 7
        // 5 8 8
        // 1 7 9
        // 5 7 9
        // 1 6 11
        //
        // Saída
        // 25

        Trabalho3 trab = new Trabalho3(8, 12);
        trab.adicionarAresta(4, 6, 1);
        trab.adicionarAresta(2, 8, 1);
        trab.adicionarAresta(7, 8, 2);
        trab.adicionarAresta(1, 3, 3);
        trab.adicionarAresta(1, 8, 4);
        trab.adicionarAresta(1, 2, 5);
        trab.adicionarAresta(4, 5, 6);
        trab.adicionarAresta(6, 5, 7);
        trab.adicionarAresta(5, 8, 8);
        trab.adicionarAresta(1, 7, 9);
        trab.adicionarAresta(5, 7, 9);
        trab.adicionarAresta(1, 6, 11);

        assertEquals(25, trab.executarKruskal());
    }
}
