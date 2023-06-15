
public class EjercicioTablaMultiplicacion {

	public static void main(String[] args) {
		// Imprime una tabla de multiplicación del 0 al 10
		for (int factor1 = 0; factor1 <= 10; factor1++) {
			for (int factor2 = 0; factor2 <= 10; factor2++) {
				int resultado = factor1 * factor2;
				System.out.printf("%2d ", resultado);
			}
			System.out.println();
		}
	}

}
