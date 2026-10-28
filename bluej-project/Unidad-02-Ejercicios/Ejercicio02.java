
/**
 * 2. Programa que lea una cantidad en dólares 
 * y nos haga el cambio a euros. 
 */

public class Ejercicio02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos constantes
        final double CAMBIO = 0.95;
        // Declaramos variables
        double dolar = 0.0, euros = 0.0;
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce los dólares a convertir");
        dolar = teclado.nextDouble();
        euros = dolar * CAMBIO;
        System.out.println("Tus " + dolar + " dólares son " + euros + " euros");

    }

}
