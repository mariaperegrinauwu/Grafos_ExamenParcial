import java.util.*;

class Grafo {
    private int[][] mAdy;
    private int numVertices;

    public Grafo(int numVertices) {
        this.numVertices = numVertices;
        mAdy = new int[numVertices][numVertices];
    }

    public void agregarArista(int origen, int destino) {
        mAdy[origen][destino] = 1;
        mAdy[destino][origen] = 1;
    }

    //matriz impresa
    public void imprimirGrafo() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices;j++) {
                    System.out.print(mAdy[i][j] + " ");
            }
            System.out.println();
        }
    }
}