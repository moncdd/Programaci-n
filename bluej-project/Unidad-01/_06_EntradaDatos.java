
public class _06_EntradaDatos
{
    public static void main(String[] args)
    {
        // Declaración de variables
        int edad;
        double sueldo;
        String nombre, apellido1, apellido2;
        boolean aprobado;
        
        // Declaramos el teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);
        
        // Inicializamos las variables con los datos del teclado
        edad = teclado.nextInt(); // Recogemos el dato entero
        sueldo = teclado.nextDouble(); // Recogemos el dato decimal
        nombre = teclado.next(); // Recogemos la cadena
        apellido1 = teclado.nextLine(); // Recogemos la línea
        apellido2 = teclado.nextLine(); // Recogemos la línea
        aprobado = teclado.nextBoolean(); // Recogemos el dato booleano
        
        
        // Mostramos la información en pantalla
        System.out.println("Bienvenido "+nombre+" "+apellido1+" "+apellido2);
        System.out.println("Tienes "+edad);
        System.out.println("Tu sueldo es "+sueldo);
        System.out.println("¿Has aprobado Programación? "+aprobado);
    }
}
