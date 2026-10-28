
/**
 * 3. Añadir al programa anterior el código 
 * necesario para cobrar una comisión del 0,2% 
 * si cambiamos menos de 100$ 
 */

public class Ejercicio03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos constantes
        final double CAMBIO = 0.95;
        final double PORCENTAJE_COMISION = 0.002;
        final double COMISION = 1.0 - PORCENTAJE_COMISION;
        // Declaramos variables
        double dolar = 0.0, euros = 0.0;
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce los dólares a convertir");
        dolar = teclado.nextDouble();
        if (dolar < 100)
            euros = dolar * CAMBIO * COMISION;
        else
            euros = dolar * CAMBIO;
        System.out.println("Tus " + dolar + " dólares son " + euros + " euros");


    }

}
