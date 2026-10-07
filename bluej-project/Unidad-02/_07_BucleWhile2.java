/**
 * Ejemplo básico de la estructura repetitiva While
 */
public class _07_BucleWhile2
{
    public static void main(String[] args)
    {
        // En la condición del bucle while
        // podemos incluir operaciones de comparación
        // y operaciones lógicas (&&,||,!)
        // -----------------------------
        // En este segundo ejemplo, vamos a comprobar las
        // comparaciones
        int datoA = 0, datoB = 5;
        
        while(datoA != datoB) 
        {
            System.out.println("Dato A: "+datoA+" ; Dato B: "+datoB);
            datoB--;
        }
    }
}
