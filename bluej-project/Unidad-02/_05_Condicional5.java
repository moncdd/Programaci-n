/**
 * Estructura condicional switch
 * Sirve para evaluar una única variable Y 
 * el tipo de dato sea cuantificable (int, char, string)
 */
public class _05_Condicional5
{
    public static void main(String[] args)
    {
        // Declaramos una variable que nos dia el día de la semana
        int dia = 4;
        
        switch(dia)
        {
            // Si dia vale 1
            case 1: System.out.println("Lunes");
                    break;
            // Si dia vale 2
            case 2: System.out.println("Martes");
                    break;
            // Si dia vale 3
            case 3: System.out.println("Miércoles");
                    break;
            // Si dia vale 4
            case 4: System.out.println("Jueves");
                    break;
            // Si dia vale 5
            case 5: System.out.println("Viernes");
                    break;
            // Si dia vale 6
            case 6: System.out.println("Sábado");
                    break;
            // Si dia vale 7
            case 7: System.out.println("Domingo");
                    break;
            // Si no entras en ningún case
            default: System.out.println("Día no válido");
                     break;
        }
        
    }
}
