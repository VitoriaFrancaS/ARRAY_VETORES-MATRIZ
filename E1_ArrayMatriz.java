package CodigoInicial;

import java.util.Scanner;

public class E1_ArrayMatriz {

	public static void main(String[] args) {
		
		int matriz[][] = new int [3][3];
		int linha, coluna, somaDiag=0, somaSec=0;
		
		Scanner input = new Scanner (System.in);
		
		for (linha=0; linha<3; linha++) {
			for (coluna=0; coluna<3; coluna++) {
				System.out.println("\nEntre com um número: ");
				matriz[linha][coluna] = input.nextInt();
				
				if (linha == coluna) {
						somaDiag = somaDiag + matriz[linha][coluna];
					}
					
					if ((linha+coluna)== 2) {
						somaSec = somaSec + matriz  [linha][coluna];
					}
				if (linha==coluna) {
					System.out.println("\nO número: "+matriz[linha][coluna]+ " é da diagonal principal");
				}
				else if ((linha+coluna) == 2) {
					System.out.println("O número: "+matriz[linha][coluna]+ " é da diagonal secundária");		

				}
				
			}
		}
		
		System.out.println("\nA somatória dos números da diagonal principal é "+somaDiag);
		System.out.println("\nA somatória dos números da diagonal secundária é "+somaSec);
	}

}
