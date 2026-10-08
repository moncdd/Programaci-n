/**
 * Ejemplo básico de bucle infinito con salida forzada
 */
public class _13_BucleInfinitoConBreak
{
    public static void main(String[] args)
    {
        int i = 0;
        while(true) // i<11
        {
            System.out.println(3*i);  
            if(i==10)
            {
                break;
            }
            i++;
            /*
            if(i==11)
            {
                break;
            }
            */
        }
    }
}
