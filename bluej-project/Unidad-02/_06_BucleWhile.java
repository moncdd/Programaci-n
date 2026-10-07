/**
 * Ejemplo básico de la estructura repetitiva While
 */
public class _06_BucleWhile
{
    public static void main(String[] args)
    {
        // En la condición del bucle while
        // podemos incluir operaciones de comparación
        // y operaciones lógicas (&&,||,!)
        // -----------------------------
        // En este primer ejemplo, vamos a utilizar el 
        // bucle while como estructura repetitiva
        // que se ejecutará siempre que se cumpla la condición
        // y se incremente el "invariante" de uno en uno
        
        int i = 0;
        while(i<=10) // i<11
        {
            System.out.println(3*i);
            i++;
        }
    }
}
