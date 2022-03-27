import java.util.Scanner;

public class Questão3java {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int A[][] = new int [3][2];
		int B[][] = new int [2][3];
		int C[][] = new int [3][2];
		
		System.out.println("Primeira Matriz");
		
		for(int i = 0; i<3; ++i) {
			for(int j = 0; j<2; ++j) {
				System.out.printf("A[%d][%d]: \n", i,j);
				A[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("Segunda Matriz");
		
		for(int i= 0; i<2; ++i) {
			for(int j = 0; j<3; ++j) {
				System.out.printf("B[%d][%d]: \n", i,j);
				B[i][j] = entrada.nextInt();
			}
		}
		
		int linhas = B.length;
		int colunas = B[0].length;
		int transposta[][] = new int[colunas][linhas];
		
		for(int i = 0; i < B.length; i++) {
			for(int j = 0; j < B[0].length; j++) {
				transposta[j][i] = B[i][j];
			}
		}
		
		System.out.println("Soma da matriz");
		
		for(int i= 0; i<transposta.length; ++i) {
			for(int j = 0; j<transposta[0].length; ++j) {
				C[i][j] = A[i][j] * transposta[i][j];
				System.out.printf("%d\t", C[i][j]);
			}
			System.out.println("\n");
		}
	}
}

