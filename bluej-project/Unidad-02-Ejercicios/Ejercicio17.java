/**
 * Programa que lee un número entero positivo mayor que 2. 
 * Si el número introducido no cumple estas condiciones 
 * se pide de nuevo al usuario que lo introduzca. 
 */

public class Ejercicio17 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        
        // Pedimos números hasta que se cumpla la condición
        do{
            System.out.print("Introduce un número positivo mayor que 2: ");
            num = entrada.nextInt();
        }while(num<3);      
    }
}
