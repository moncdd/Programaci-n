/**
 * Ejemplo básico de la estructura repetitiva Do-While
 */
public class _10_BucleDoWhileMenu
{
    public static void main(String[] args)
    {
        int opcion;
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        
        do
        {
            System.out.print("Introduce un número, el 5 fuerza la salida ");
            opcion = teclado.nextInt();
            teclado.nextLine();
        }while(opcion != 5);
    }
}
