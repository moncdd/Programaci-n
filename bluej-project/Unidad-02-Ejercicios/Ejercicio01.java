
/**
 * 1. Programa que lee desde el teclado la nota 
 * de programación de un alumno y nos dice si 
 * ha aprobado o no.
 * Nota: buscar en Internet cómo leer datos con la clase Scanner.
 */

public class Ejercicio01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos variables
        int nota = 0;
        String msg = "";
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce la nota de programación");
        nota = teclado.nextInt();

        // Comprobamos nota [1-10]
        if (nota > 0 && nota <= 10) {
            msg = (nota >= 5) ? "aprobado" : "suspendido";
            System.out.println("Tu nota de programación es " + nota + ", has " + msg);
        } else {
            System.out.println("No es una nota válida");
        }

    }

}
