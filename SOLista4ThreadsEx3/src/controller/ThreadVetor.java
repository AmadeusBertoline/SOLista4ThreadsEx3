package controller;

public class ThreadVetor extends Thread {

	private int valor;
	private int[] vetor;

	public ThreadVetor(int valor, int[] vetor) {

		this.valor = valor;
		this.vetor = vetor;

	}

	@Override
	public void run() {

		long inicio, fim, tempo;

		if (valor % 2 == 0) {

			inicio = System.nanoTime();

			for (int i = 0; i <= vetor.length - 1; i++) {

				System.out.println(vetor[i]);

			}

			fim = System.nanoTime();

			tempo = (fim - inicio) / 1000000;

			System.out.println("Tempo do For: " + tempo);

		} else {

			inicio = System.nanoTime();

			for (int v : vetor) {

				System.out.println(v);

			}

			fim = System.nanoTime();

			tempo = (fim - inicio) / 1000000;

			System.out.println("Tempo do Foreach: " + tempo);

		}

	}

}
