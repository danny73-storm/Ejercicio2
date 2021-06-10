import java.util.*;

public class Ejercicio2{
	public static void main (String[] args){

		Scanner leer = new Scanner(System.in);

		//pedir el valor N 
		System.out.println("\nIngrese la cantidad de numeros: ");
		int N = leer.nextInt();
		int p = N;

		for (int i=1; i<=N ; --N) {
			System.out.println("Los valores comprendidos entre "+p+" y 1 es: "+N);
		}

	}
}	