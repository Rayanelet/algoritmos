import java.util.Scanner;

public class Questão3 {
public static void main(String[] args) {
	
	Scanner entrada = new Scanner(System.in);
	int Base1  = 0;
	int Base2 = 0;
	int Altura = 0;
	int Area = 0;
	
	System.out.println("Digite a base maior");
	Base1  = entrada.nextInt();
	System.out.println("DEigite a base menor");
	Base2 = entrada.nextInt();
	System.out.println("Digite a altura");
	Altura = entrada.nextInt();
	Area = (Base1 + Base2)*Altura/2;
			System.out.println(Area);
			
	
}
	
		

	
}


