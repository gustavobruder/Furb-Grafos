package trabalho1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Trabalho1Tests {

    @Test
    public void deveObterTipoDoGrafo_NaoDirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {1, 0, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_Dirigido() {
        int[][] matriz = new int[][] {
            {0, 0, 0, 1},
            {1, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("dirigido"));
        assertFalse(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_Simples() {
        int[][] matriz = new int[][] {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {1, 0, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("simples"));
    }

    @Test
    public void deveObterTipoDoGrafo_Multigrafo_ComLaco() {
        int[][] matriz = new int[][] {
            {0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 1, 1},
            {1, 0, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("multigrafo"));
    }

    @Test
    public void deveObterTipoDoGrafo_Multigrafo_ComArestasParalelas() {
        int[][] matriz = new int[][] {
            {0, 1, 1, 2},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {2, 0, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("multigrafo"));
    }

    @Test
    public void deveObterTipoDoGrafo_Regular1_NaoDirigido() {
        int[][] matriz = new int[][] {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_Regular2_NaoDirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 0, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 1},
            {0, 0, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_Regular3_NaoDirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 0, 0, 0, 1},
            {1, 0, 0, 0, 0, 1},
            {0, 0, 0, 1, 1, 0},
            {0, 0, 1, 0, 1, 0},
            {0, 0, 1, 1, 0, 0},
            {1, 1, 0, 0, 0, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_Regular4_NaoDirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 0, 1, 0, 1},
            {1, 0, 1, 0, 0, 1},
            {0, 1, 0, 1, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {0, 0, 1, 1, 0, 1},
            {1, 1, 0, 0, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_NaoRegular1_NaoDirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 0},
            {1, 0, 1},
            {0, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertFalse(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_NaoRegular2_NaoDirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 0, 1},
            {1, 0, 0, 1},
            {0, 0, 0, 1},
            {1, 1, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertFalse(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_NaoRegular3_NaoDirigido() {
        int[][] matriz = new int[][] {
            {1, 1, 1},
            {1, 0, 2},
            {1, 2, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertFalse(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_Regular1_Dirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 0},
            {0, 0, 1},
            {1, 0, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("dirigido"));
        assertFalse(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_Regular2_Dirigido() {
        int[][] matriz = new int[][] {
            {1, 1, 0},
            {0, 1, 1},
            {1, 0, 1},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("dirigido"));
        assertFalse(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_NaoRegular1_Dirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 0},
            {0, 0, 1},
            {1, 0, 1},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertFalse(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("dirigido"));
        assertFalse(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_NaoRegular2_Dirigido() {
        int[][] matriz = new int[][] {
            {0, 2},
            {1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertFalse(tipoDoGrafo.contains("regular"));
        assertTrue(tipoDoGrafo.contains("dirigido"));
        assertFalse(tipoDoGrafo.contains("não dirigido"));
    }

    @Test
    public void deveObterTipoDoGrafo_Completo() {
        int[][] matriz = new int[][] {
            {0, 1, 1, 1},
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {1, 1, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("completo"));
    }

    @Test
    public void deveObterTipoDoGrafo_Nulo() {
        int[][] matriz = new int[][] {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("nulo"));
    }

    @Test
    public void deveObterTipoDoGrafo_NaoNulo() {
        int[][] matriz = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertFalse(tipoDoGrafo.contains("nulo"));
    }

    @Test
    public void deveObterTipoDoGrafo_Bipartido() {
        int[][] matriz = new int[][] {
            {0, 1, 1, 0},
            {1, 0, 0, 1},
            {1, 0, 0, 1},
            {0, 1, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertTrue(tipoDoGrafo.contains("bipartido"));
    }

    @Test
    public void deveObterTipoDoGrafo_NaoBipartido() {
        int[][] matriz = new int[][] {
            {0, 1, 1},
            {1, 0, 1},
            {1, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String tipoDoGrafo = trab.tipoDoGrafo(matriz);

        assertFalse(tipoDoGrafo.contains("bipartido"));
    }

    @Test
    public void deveObterArestasDoGrafo_NaoDirigido() {
        int[][] matriz = new int[][] {
            {0, 1, 1, 1},
            {1, 0, 0, 1},
            {1, 0, 0, 1},
            {1, 1, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String arestasDoGrafo = trab.arestasDoGrafo(matriz);

        assertEquals("Quantidade de arestas: 5. E = { (v1,v2), (v1,v3), (v1,v4), (v2,v4), (v3,v4) }", arestasDoGrafo);
    }

    @Test
    public void deveObterArestasDoGrafo_Dirigido1() {
        int[][] matriz = new int[][] {
            {0, 0, 0, 1},
            {1, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String arestasDoGrafo = trab.arestasDoGrafo(matriz);

        assertEquals("Quantidade de arestas: 5. E = { (v1,v4), (v2,v1), (v3,v2), (v4,v2), (v4,v3) }", arestasDoGrafo);
    }

    @Test
    public void deveObterArestasDoGrafo_Dirigido2() {
        int[][] matriz = new int[][] {
            {1, 0, 0, 1},
            {1, 0, 0, 0},
            {0, 1, 1, 0},
            {0, 1, 1, 1},
        };

        Trabalho1 trab = new Trabalho1();
        String arestasDoGrafo = trab.arestasDoGrafo(matriz);

        assertEquals("Quantidade de arestas: 8. E = { (v1,v1), (v1,v4), (v2,v1), (v3,v2), (v3,v3), (v4,v2), (v4,v3), (v4,v4) }", arestasDoGrafo);
    }

    @Test
    public void deveObterArestasDoGrafo_Nulo1() {
        int[][] matriz = new int[][] {
            {0},
        };

        Trabalho1 trab = new Trabalho1();
        String arestasDoGrafo = trab.arestasDoGrafo(matriz);

        assertEquals("Quantidade de arestas: 0. E = {  }", arestasDoGrafo);
    }

    @Test
    public void deveObterArestasDoGrafo_Nulo2() {
        int[][] matriz = new int[][] {
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String arestasDoGrafo = trab.arestasDoGrafo(matriz);

        assertEquals("Quantidade de arestas: 0. E = {  }", arestasDoGrafo);
    }

    @Test
    public void deveObterGrausDoVertice_NaoDirigido1() {
        int[][] matriz = new int[][] {
            {0, 1, 2, 1},
            {1, 0, 0, 1},
            {2, 0, 0, 0},
            {1, 1, 0, 1},
        };

        Trabalho1 trab = new Trabalho1();
        String grausDoVertice = trab.grausDoVertice(matriz);

        assertEquals("Graus de cada vértice: [v1 = 4, v2 = 2, v3 = 2, v4 = 4].\nSequência de graus: [2, 2, 4, 4].", grausDoVertice);
    }

    @Test
    public void deveObterGrausDoVertice_NaoDirigido2() {
        int[][] matriz = new int[][] {
            {0, 0, 0},
            {0, 0, 2},
            {0, 2, 1},
        };

        Trabalho1 trab = new Trabalho1();
        String grausDoVertice = trab.grausDoVertice(matriz);

        assertEquals("Graus de cada vértice: [v1 = 0, v2 = 2, v3 = 4].\nSequência de graus: [0, 2, 4].", grausDoVertice);
    }

    @Test
    public void deveObterGrausDoVertice_Dirigido() {
        int[][] matriz = new int[][] {
            {0, 0, 0, 1},
            {1, 0, 0, 0},
            {0, 1, 0, 0},
            {0, 1, 1, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String grausDoVertice = trab.grausDoVertice(matriz);

        String msgExpected = "Graus de entrada de cada vértice: [v1 = 1, v2 = 2, v3 = 1, v4 = 1]." +
                "\nSequência de graus de entrada: [1, 1, 1, 2]." +
                "\nGraus de saida de cada vértice: [v1 = 1, v2 = 1, v3 = 1, v4 = 2]." +
                "\nSequência de graus de saida: [1, 1, 1, 2].";

        assertEquals(msgExpected, grausDoVertice);
    }

    @Test
    public void deveObterGrausDoVertice_Nulo() {
        int[][] matriz = new int[][] {
            {0, 0, 0},
            {0, 0, 0},
            {0, 0, 0},
        };

        Trabalho1 trab = new Trabalho1();
        String grausDoVertice = trab.grausDoVertice(matriz);

        assertEquals("Graus de cada vértice: [v1 = 0, v2 = 0, v3 = 0].\nSequência de graus: [0, 0, 0].", grausDoVertice);
    }
}
