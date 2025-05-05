public class AsteriskTree {
    public static void main(String[] args) {
        // Número de filas para el árbol
        int height = 4;

        // Imprimir el árbol
        for (int i = 0; i < height; i++) {
            // Imprimir espacios antes de los asteriscos
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos (2*i+1 asteriscos por  cada fila)
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            // Saltar a la siguiente línea
            System.out.println();
        }

        // Imprimir el tronco del árbol (2 filas)
        for (int i = 0; i < 2; i++) {
            // Centrar el tronco
            for (int j = 0; j < height - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}


