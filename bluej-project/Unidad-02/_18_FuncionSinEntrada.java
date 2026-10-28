/**
 * Ejemplo de un subprograma que no tiene entrada
 * y sí tiene salida (Función)
 */
public class _18_FuncionSinEntrada
{
    /**
     * String: indica que devuelve un dato String
     * (): indica que no recibe datos
     */
    static String ejemplo()
    {
       return "Soy un subprograma que devuelve una cadena y no recibe datos"; 
    }
    
    public static void main(String[] args)
    {
        String var;
        // Llamamos al subprograma
        var = ejemplo();
        System.out.println(var);
        
        System.out.println("Instrucción 1 de main"); 
        
        var = ejemplo();
        System.out.println(var);
        
        System.out.println("Instrucción 2 de main"); 
        
        var = ejemplo();
        System.out.println(var);
        
        System.out.println("Instrucción 3 de main"); 
    }
}
