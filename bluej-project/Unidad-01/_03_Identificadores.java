/**
 * Reglas obligatorias de Java para identificadores válidos
 * Caracteres permitidos: Solo puede contener letras (mayúsculas o minúsculas), números, el símbolo de dólar ($) y el guion bajo (_).
 * Primer caracter: Debe comenzar por una letra, un guion bajo (_) o un signo de dólar ($). Nunca puede empezar por un número.
 * Sensible a mayúsculas: Java distingue entre mayúsculas y minúsculas (edad y Edad son dos identificadores completamente diferentes).
 * Palabras reservadas: No puede ser una palabra reservada del lenguaje (como class, public, int, static, etc.).
 * Longitud: No hay límite de caracteres, pero se recomienda que sea descriptivo y conciso.
 */
public class _03_Identificadores
{
    public static void main(String[] args)
    {
        int edad; // Variable	
        int numeroDeEstudiantes; // Variable / camelCase	
        double _totalCuenta; //	Variable
        int $saldoPuntos; // Variable
    }
}
