
import java.util.Scanner;

public class Questão7java {
	public static void main(String[] args) {
		Scanner Entrada = new Scanner(System.in);
		int[] vetor = new int [100];
	int maior = 0, menor = 0; 
	
	for(int i = 0; i < vetor.length; i++){
		System.out.print("Digite o " +(i+1)+"º valor: ");  
		vetor[i] = Entrada.nextInt();
		if(vetor[i] > maior){ 
			maior = vetor[i];
		}
	}
	for (int j = 0; j < vetor.length; j++) {
		if(vetor[j] < menor){
			menor = vetor[j];
		}
	}
	System.out.println("Maior valor = "+ maior);
	System.out.println("Menor valor = "+ menor);
}
}
			