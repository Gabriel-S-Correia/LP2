import java.util.Scanner;

public class Tarefa1_ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o raio do circulo: ");
		double a = entrada.nextDouble();
		double area = 3.14*(a*a);
		
		System.out.print("Área do círculo: "+area);
	}

}
