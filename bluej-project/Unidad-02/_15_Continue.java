/**
 * Ejemplo básico de estructura de salto continue
 */
public class _15_Continue
{
    public static void main(String[] args)
    {
        // Podemos anidar bucles, que consiste en meter
        // un bucle dentro de otro
        // Ejemplo: Tablas de multiplicar
        
        // Bucle externo que genera las tablas
        for(int i=0;i<11;i++)
        {
            System.out.println("Tabla de multiplicar del "+i);
            // Bucle interno que hace los cálculos
            for(int j=0;j<11;j++)
            {
                if(j%2==1)
                {
                    continue;
                }
                System.out.println(i+" x "+j+" = "+(i*j));
                
            }
            System.out.println(); // Separación de tablas
        }
    }
}
