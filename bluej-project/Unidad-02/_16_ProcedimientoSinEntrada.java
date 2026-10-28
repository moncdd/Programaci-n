/**
 * Ejemplo de un subprograma que no tiene entrada
 * y no tiene salida (Procedimiento)
 */
public class _16_ProcedimientoSinEntrada
{
    /**
     * void: indica que no devuelve datos
     * (): indica que no recibe datos
     */
    static void ejemplo()
    {
       System.out.println("Soy un subprograma que no devuelve ni recibe datos"); 
    }
    
    public static void main(String[] args)
    {
        // Llamamos al subprograma
        ejemplo();
        System.out.println("Instrucción 1 de main"); 
        ejemplo();
        System.out.println("Instrucción 2 de main"); 
        ejemplo();
        System.out.println("Instrucción 3 de main"); 
    }
}
