/**
 * Ejemplo básico de la estructura repetitiva While
 */
public class _08_BucleWhile3
{
    public static void main(String[] args)
    {
        // En la condición del bucle while
        // podemos incluir operaciones de comparación
        // y operaciones lógicas (&&,||,!)
        // -----------------------------
        // En este segundo ejemplo, vamos a comprobar las
        // comparaciones
        boolean datoA = true, datoB = false;
        
        while(datoA && !(datoB)) 
        {
            System.out.println("Opción de negación dentro de la condición");
            System.out.println("Dato A: "+datoA+" ; Dato B: "+datoB);
            datoA = false;
        }
    }
}
