/**
 * Evoluciona el algoritmo anterior para controlar que el valor 
 * introducido sea mayor que 0, en tal caso, se calculará el valor 
 * de la velocidad (gravedad * tiempo). En caso de que el valor sea 
 * menor o igual a 0 se mostrará el mensaje "Tiempo incorrecto" y 
 * finalizará el programa
 */
public class TareaAula03
{
    public static void main(String[] args)
    {
        // Constantes
        final double GRAVEDAD = 9.8; //m/s^2
        
        // Variables
        double velocidad, tiempo;
        
        // Definimos el uso de teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        // Pedimos datos al usuario
        System.out.print("Introduce el valor de tiempo que deseas: ");
        tiempo = teclado.nextDouble();
        
        // Comprobamos si el tiempo introducido es válido
        if(tiempo>0.0) // true
        {
            // velocidad = gravedad * tiempo
            //velocidad = (int) (GRAVEDAD * tiempo);
            velocidad = GRAVEDAD * tiempo;
            System.out.printf("La velocidad calculada es %.0f",velocidad);
        }
        else
        {
            System.out.println("Tiempo incorrecto");
        }
    }
}
