package CodigoInicial;

import java.util.Arrays;
import java.util.Scanner;

public class E1_ArrayVetor {

	public static void main(String[] args) {
			 	
		int vetor[] = {1,2,3,4,5,6,7,8,9,10} ;
		int x = 0;;
		
		Scanner input= new Scanner (System.in);
		
		System.out.println("\n Digite um número para saber em que posição ele está ");
		x = input.nextInt();
		
		int listagem = Arrays.binarySearch(vetor, (int) x);
		
		if(listagem >= 0) {
			System.out.println("\n O número 7 está na posição: "+listagem);
		} else {
			System.out.println("\n O número não foi encontrado");
		}
		
		
	}

}
