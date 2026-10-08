/**
 * Ejemplo básico de la estructura de salto Break
 */
public class _12_Break
{
    public static void main(String[] args)
    {
        // Break es una estructura de salto 
        // "QUE FUERZA" la salida del bucle
        
        int i = 0;
        while(i<=10) // i<11
        {
            System.out.println(3*i);
            if(i==5)
            {
                break; // Cuando i valga 5, saldremos del bucle
            }    
            i++;
        }
        System.out.println("Break no rompe el programa, yo me imprimo");
    }
}
