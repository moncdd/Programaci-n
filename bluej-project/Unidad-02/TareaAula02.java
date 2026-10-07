/**
 * Evoluciona el algoritmo anterior para solicitar al usuario 
 * que especifique qué valor de tiempo tenemos que usar
 */
public class TareaAula02
{
    public static void main(String[] args)
    {
        // Constantes
        final double GRAVEDAD = 9.8; //m/s^2
        
        // Variables
        int velocidad;
        double tiempo;
        
        // Definimos el uso de teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        // Pedimos datos al usuario
        System.out.print("Introduce el valor de tiempo que deseas: ");
        tiempo = teclado.nextDouble();
    }
}
