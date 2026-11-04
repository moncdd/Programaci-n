/**
 * Programa que lee de manera consecutiva números hasta 
 * que se introducen dos números iguales seguidos.
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        //Declaramos las variables
        int numAnt, num;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        System.out.print("Introduce un número: ");
        num = entrada.nextInt();
        do{    
            numAnt = num;
            System.out.print("Introduce un número: ");
            num = entrada.nextInt();
        }while(numAnt!=num);

        System.out.println("Has introducido dos números iguales consecutivos");

    }
}