
public class Tarefa1_ex2 {
   
	public static void main(String[] args) {
		int a = 1,
		b = 2,
		c = 3,
		aux;
		
		//depois a = 3, b =1 , c = 2
		
		aux = a;
		a = c;
		c = b;
		b = aux; 
		
		System.out.print(a +", "+ b +", "+ c);
		

	}

}
