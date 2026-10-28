/**
 * Ejemplo de un subprograma que si tiene entrada
 * y no tiene salida (Procedimiento)
 */
public class _17_ProcedimientoConEntrada
{
    /**
     * void: indica que no devuelve datos
     * (String parametro): indica que recibe un String y la variable 
     *                     dentro de la función se llama parametro    
     */
    static void ejemplo(String parametro)
    {
       System.out.println("Subprograma "+parametro); 
    }
    
    public static void main(String[] args)
    {
        // Llamamos al subprograma
        ejemplo("1");
        System.out.println("Instrucción 1 de main"); 
        ejemplo("2");
        System.out.println("Instrucción 2 de main"); 
        ejemplo("3");
        System.out.println("Instrucción 3 de main"); 
    }
}
