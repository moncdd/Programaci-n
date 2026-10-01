/**
 * Ejemplo de uso de condicionales anidados
 */
public class _03_Condicional3
{
    public static void main(String[] args)
    {
        // Declaramos una variable entera que almacena la edad
        int edad = 22;
        
        // Bebé
        if((edad>=0) && (edad<3)) 
        {
            System.out.println("Bebé");
        }
        // Niñez
        else if((edad>=3) && (edad<12))
        {
            System.out.println("Niñez");
        }
        // Adolescencia
        else if((edad>=12) && (edad<18))
        {
            System.out.println("Adolescencia");
        }
        // Adulto
        else if((edad>=18) && (edad<67))
        {
            System.out.println("Adulto");
        }
        // Vejez
        else if((edad>=67) && (edad<110))
        {
            System.out.println("Vejez");
        }
        // Edad no válida
        else
        {
            System.out.println("Edad no válida");
        }
    }
}
