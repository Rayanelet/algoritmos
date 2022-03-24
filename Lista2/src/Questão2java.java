import java.util.Scanner;

public class Questão2java {
public static void main(String[] args) {
		
		Scanner Entrada = new Scanner(System.in);
		
        
        int[] vetor = new int[10];
        
       
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número");
            vetor[i] = Entrada.nextInt();
        }
       
        for(int i = vetor.length-1; i >= 0; i--){
            System.out.println(vetor[i]);
        }
        
    }
}
