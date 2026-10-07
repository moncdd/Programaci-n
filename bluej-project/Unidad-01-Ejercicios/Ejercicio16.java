/* 
 * Realiza un programa que, dados las variables enteras edad, nivel de estudios e ingresos, 
 * almacene en una variable booleana llamada jasp el valor calculado:
 * Verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que tres 
 * y los ingresos superan los 28000 euros
 * Falso. En caso contrario.
 */
public class Ejercicio16
{
    public static void main(String[] args)
    {
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        int nota;
        String msg;
        
        System.out.print("Introduce tu nota: ");
        nota = teclado.nextInt();
        msg = (nota>=5)?"Aprobado":"Suspenso";
        System.out.println(msg);
    }
}
