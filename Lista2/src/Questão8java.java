import java.util.Scanner;

public class Questão8java {
	public static void main(String[] args) {

		Scanner Entrada = new Scanner(System.in);
		int[] vetor = new int [100];
		int soma;
		double media;
		
		for(int i = 0; i < vetor.length; i++){
			System.out.print("Digite o " +(i+1)+"º valor: ");  
			vetor[i] = Entrada.nextInt();
			int soma1 = vetor[i];
			media = soma1/vetor.length;
			
			System.out.println(media);
		
			
		}
		
	}
		
}
	