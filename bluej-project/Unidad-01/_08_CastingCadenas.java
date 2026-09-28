/**
 * Vamos a realizar las conversiones Cadena -> número y Número -> cadena 
 * Para convertir números en cadenas, siempre usamos String.valueOf(miEntero);
 * 
 * Para convertir cadenas en números, hay una función para cada tipo
 * Integer.parseInt(cadena);
 * Double.parseDouble(cadena);
 * Short.parseShort(cadena);
 */

public class _08_CastingCadenas
{
    public static void main(String[] args)
    {
        int miEntero = 7;
        String numConvertidoCadena = String.valueOf(miEntero);  
       
        System.out.println("Puedo sumar números "+(miEntero+2));
        System.out.println("Puedo sumar números "+(numConvertidoCadena+"2"));
        
        // ----------------------------------------
        String miNumCad = "8";
        int miNumEntero = Integer.parseInt(miNumCad); 
        
        System.out.println("Puedo sumar números "+(miNumCad+2));
        System.out.println("Puedo sumar números "+(miNumEntero+2));
    }
}
