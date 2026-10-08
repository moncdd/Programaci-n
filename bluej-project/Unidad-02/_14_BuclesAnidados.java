/**
 * Ejemplo básico de bucles anidados
 */
public class _14_BuclesAnidados
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
                System.out.println(i+" x "+j+" = "+(i*j));
                if(j==5)
                {
                    break;
                }
            }
            System.out.println(); // Separación de tablas
        }
    }
}
