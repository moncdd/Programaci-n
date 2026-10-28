
/**
 * 6. Programa que lee desde teclado 
 * las notas en programación y marcas de 
 * un alumno y nos dice si ha aprobado 
 * una o las dos asignaturas 
 */

public class Ejercicio06 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos variables
        int notaProg = 0, notaMarcas = 0;
        String msg = "";
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce la nota de programación");
        notaProg = teclado.nextInt();

        System.out.println("Introduce la nota de marcas");
        notaMarcas = teclado.nextInt();

        if (notaProg > 0 && notaProg <= 10) {
            msg = (notaProg < 5) ? "suspendido" : "aprobado";
            System.out.println("Has " + msg + " programación");
        } else
            System.out.println("La nota de programación no es válida");

        if (notaMarcas > 0 && notaMarcas <= 10) {
            msg = (notaMarcas < 5) ? "suspendido" : "aprobado";
            System.out.println("Has " + msg + " marcas");
        } else
            System.out.println("La nota de marcas no es válida");
        
    }

}
