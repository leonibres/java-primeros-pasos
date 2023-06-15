public class EjercicioMatriz {

    public static void main(String[] args) {
        // Genera una matriz triangular de asteriscos
        for (int fila = 0; fila <= 10; fila++) {
            for (int columna = 0; columna < fila; columna++) {
                // Imprime un asterisco seguido de un espacio en cada posición de la matriz
                System.out.print("*");
            }
            // Imprime una nueva línea después de cada fila
            System.out.println();
        }
    }
}

