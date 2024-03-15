public class Main {
    public static void main(String[] args) {
        Grafo grafo0 = new Grafo(5);
        Grafo grafo1 = new Grafo(5);
        Grafo grafo2 = new Grafo(5);
        Grafo grafo3 = new Grafo(5);
        Grafo grafo4 = new Grafo(5);


        //grafo0
        grafo0.agregarArista(0, 1);
        grafo0.agregarArista(0, 2);
        grafo0.agregarArista(0, 3);

        grafo0.agregarArista(2, 4);
        
        grafo0.agregarArista(3, 2);
        grafo0.agregarArista(3, 4);
        grafo0.agregarArista(3, 4);
        System.out.println();
        //Impresión
        System.out.println("\n Matriz grafo 0:");
        grafo0.imprimirGrafo();

        //grafo1
        grafo1.agregarArista(0, 2);

        grafo1.agregarArista(2, 1);
        grafo1.agregarArista(2, 4);
        grafo1.agregarArista(2, 3);

        System.out.println("\n Matriz grafo 1:");
        grafo1.imprimirGrafo();

        //grafo2
         grafo2.agregarArista(0, 3);
         grafo2.agregarArista(0, 4);
         grafo2.agregarArista(0, 2);
 
         grafo2.agregarArista(2, 1);
 
         System.out.println("\n Matriz grafo 2:");
         grafo2.imprimirGrafo();

        //grafo3
        grafo3.agregarArista(0, 4);

        grafo3.agregarArista(4, 3);
        grafo3.agregarArista(4, 1);

        grafo3.agregarArista(3, 1);
        
        grafo3.agregarArista(1, 2);

        System.out.println("\n Matriz grafo 3:");
        grafo3.imprimirGrafo();

        //grafo4
        grafo4.agregarArista(0, 3);
        grafo4.agregarArista(0, 2);
        grafo4.agregarArista(0, 4);
        grafo4.agregarArista(0, 1);
        
        grafo4.agregarArista(3, 4);

        System.out.println("\n Matriz grafo 4:");
        grafo4.imprimirGrafo();

        }

    
}