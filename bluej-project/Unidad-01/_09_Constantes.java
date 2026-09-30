/**
 * En Java, una constante es una variable cuyo valor no puede modificarse 
 * una vez asignado. Se utiliza final.
 * 
 * 1. Declarar una constante
 * final int EDAD_MINIMA = 18;
 * Si intentamos modificar el valor de la constante, 
 * Java dará un error de compilación porque una variable final 
 * no puede recibir otro valor.
 * 
 * 2. Convención para nombrar constantes
 * Por convenio, las constantes se escriben:
 * MAYÚSCULAS_SEPARADAS_POR_GUIONES_BAJOS
 * Por ejemplo:
 * final double IVA = 0.21;
 * final int EDAD_MINIMA = 18;
 * final String NOMBRE_CENTRO = "IES Villaverde";
 * final int NUMERO_MAXIMO_ALUMNOS = 30;
 * 
 * Esto permite distinguir fácilmente las constantes de las variables normales:
 */   

public class _09_Constantes
{
    public static void main(String[] args)
    {
        // 1º Constantes
        final double IVA = 0.21;
        // 2º Variables
        double precio = 100;
        double precioFinal = precio + precio * IVA; // Precedencia de operadores
        System.out.println("Precio final: " + precioFinal);

    }
}
