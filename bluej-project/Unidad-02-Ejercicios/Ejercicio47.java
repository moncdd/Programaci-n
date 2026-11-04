/**
 *         Escribir un programa en Java que lea un número entero 
 *         desde teclado y realiza la suma de los 100 número siguientes, 
 *         mostrando el resultado en pantalla.  
 */
import java.util.Scanner;

public class Ejercicio47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaramos variables
		int num, suma = 0;
		
		// Declaramos el objeto teclado
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce un número entero ");
		num = teclado.nextInt();
		teclado.close();
		
		for(int i=num;i<(num+100);i++) {
			suma+=i;
		}	
		System.out.println("La suma de los 100 números siguientes a "+num+" es "+suma);
	}

}
