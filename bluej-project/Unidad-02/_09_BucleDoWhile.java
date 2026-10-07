/**
 * Ejemplo básico de la estructura repetitiva Do-While
 */
public class _09_BucleDoWhile
{
    public static void main(String[] args)
    {
        // A diferencia de los bucles While que, puede que NO
        // se ejecuten NUNCA, el bucle Do-While se ejecuta
        // AL MENOS un única vez
        
        boolean condicion = false;
        
        while(condicion)
        {
            System.out.println("Ejecuto dentro de While");
        }
        
        // Se utiliza cuando necesitamos interacción del usuario
        // Generalmente para menús de comandos
        do
        {
            System.out.println("Ejecuto dentro de Do-While");
        }while(condicion);
    }
}
