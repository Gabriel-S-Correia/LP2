import java.util.Scanner;

public class Tarefa1_ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a largura e altura da parede (em metros): ");
		double largura = entrada.nextDouble();
		double altura = entrada.nextDouble();
		
		double area = largura * altura;
		
		double consumo = area*300;
		
		double lata = consumo/2000;
		
		System.out.print("V�o ser ncess�rias " + lata + " latas! ");
	}

}
