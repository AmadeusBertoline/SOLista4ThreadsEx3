package view;

import java.util.Random;
import controller.*;

public class Main {

	public static void main(String[] args) {

		int[] vetor = new int[1000];
		Random random = new Random();
		
		//Preenche o vetor com valores aleatórios

		for (int i = 0; i <= vetor.length - 1; i++) {

			vetor[i] = random.nextInt(101);

		}
		
		//Chama 2 threads, 1 com valor par e outra com ímpar

		for (int i = 1; i <= 2; i++) {

			ThreadVetor thread = new ThreadVetor(i, vetor);

			thread.start();

		}

	}

}
