
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
        System.out.println("Edad: ");
        edad = teclado.nextInt(); // Recogemos el dato entero
        System.out.println("Sueldo: ");
        sueldo = teclado.nextDouble(); // Recogemos el dato decimal
        System.out.println("Nombre: ");
        nombre = teclado.next(); // Recogemos la cadena
        System.out.println("Apellido 1: ");
        apellido1 = teclado.next(); // Recogemos la línea
        System.out.println("Apellido 2: ");
        apellido2 = teclado.next(); // Recogemos la línea
        teclado.nextLine(); // Limpiamos la entrada de datos
        System.out.println("¿Aprobado? ");
        aprobado = teclado.nextBoolean(); // Recogemos el dato booleano
        
        
        // Mostramos la información en pantalla
        System.out.println("Bienvenido "+nombre+" "+apellido1+" "+apellido2);
        System.out.println("Tienes "+edad);
        System.out.println("Tu sueldo es "+sueldo);
        System.out.println("¿Has aprobado Programación? "+aprobado);
    }
}
