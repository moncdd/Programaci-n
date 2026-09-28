/**
 * Casting de datos
 * 1. Casting implícito
 * Java realiza la conversión automáticamente cuando la conversión es segura, 
 * normalmente de un tipo con menor rango a otro con mayor rango.
 * int -> double
 * Es seguro porque un double puede representar, en general, los valores de un int 
 * sin que se produzca un desbordamiento por el rango.
 * Un ejemplo habitual de conversiones numéricas implícitas es:
 * byte → short → int → long → float → double
 * 2. Casting explícito
 * Se utiliza cuando Java no puede hacer la conversión automáticamente, normalmente 
 * porque puede producirse una pérdida de información.
 * La sintaxis es: (tipo) valor
 * Por ejemplo:
 * int numero = (int) decimal;
 * Aquí estamos indicando explícitamente:
 * 3. ¿Por qué hace falta casting?
 * Porque esta conversión no es necesariamente segura:
 * Java no permite esa conversión automáticamente porque pasar de double a int puede perder información.
 */

public class _07_CastingDatos
{
    public static void main(String[] args)
    {
       
    }
}
