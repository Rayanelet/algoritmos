import java.util.Scanner;

public class Questão2java {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A[][] = new int [3][3];
		int B[][] = new int [3][3];
		int C[][] = new int [3][3];
		
		System.out.println("Primeira Matriz");
		
		for(int i = 0; i<3; ++i) {
			for(int j = 0; j<3; ++j) {
				System.out.printf("A[%d][%d]: \n", i,j);
				A[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("Segunda Matriz");
		
		for(int i= 0; i<3; ++i) {
			for(int j = 0; j<3; ++j) {
				System.out.printf("B[%d][%d]: \n", i,j);
				B[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("Soma da matriz");
		
		for(int i= 0; i<3; ++i) {
			for(int j = 0; j<3; ++j) {
				C[i][j] = A[i][j] + B[i][j];
				System.out.printf("%d\t", C[i][j]);
			}
			System.out.println("\n");
		}
	}
}
