/**
 * Ejemplo básico de la estructura repetitiva For
 */
public class _11_BucleFor
{
    public static void main(String[] args)
    {
        // Un bucle For es un caso concreto de este tipo
        // de bucles While. Para poder trabajar con un 
        // bucle For necesitamos:
        // - Un invariante inicializado
        // - Una condición que me permita evaluar el invariante
        // - Que el invariante incremente/decremente su valor hasta 
        //   finalizar la condición
        
        /*
        int i = 0;
        while(i<=10) // i<11
        {
            System.out.println(3*i);
            i++;
        }
        */
        for(int i = 0;i<=10;i++)
        {
            System.out.println(3*i);
        }
    }
}
