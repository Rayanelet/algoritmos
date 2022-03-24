import java.util.Scanner;

public class Questão2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		double peso = 0;
		double altura = 0;
		
		System.out.println("Digite o seu peso");
		peso = entrada.nextDouble();
		System.out.println("Digite a sua altura");
		altura = entrada.nextDouble();
		
		 System.out.println("O seu IMC é igual a:"+(peso/altura*altura));
		
		
		
	}
}
