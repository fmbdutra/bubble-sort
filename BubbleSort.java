public class BubbleSort {


	public static void sortNumbersCresc(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {

		int[] vetor = { a, b, c, d, e, f, g, h, i, j };

		for (int x = 0; x < vetor.length - 1; x++) {
			for (int y = x + 1; y < vetor.length; y++) {
				int var = 0;
				if (vetor[x] > vetor[y]) {
					var = vetor[x];
					vetor[x] = vetor[y];
					vetor[y] = var;
				}
			}
		}

		for (int x = 0; x < vetor.length; x++) {
			System.out.print(vetor[x]+" ");
		}
	}

	public static void main(String[] args) {

		sortNumbersCresc(10, 9, 4, 6, 7, 1, 2, 8, 3, 5);
	}

}
