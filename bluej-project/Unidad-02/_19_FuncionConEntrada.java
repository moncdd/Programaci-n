/**
 * Ejemplo de un subprograma que sí tiene entrada
 * y sí tiene salida (Función)
 */
public class _19_FuncionConEntrada
{
    /**
     * int: indica que devuelve un dato int
     * (int num1, int num2): indica que recibe dos datos enteros
     */
    static int suma(int num1, int num2)
    {
        int suma = num1 + num2;
        return suma; // num1+num2; 
    }
    
    public static void main(String[] args)
    {
        int numero1 = 3, numero2 = 5;
        System.out.println("La suma de "+numero1+" y "+numero2+
                           " es "+suma(numero1,numero2));
    }
}
