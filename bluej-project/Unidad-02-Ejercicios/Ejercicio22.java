/**
 * Leer números hasta que se introduzca un 0. 
 * Para cada uno indicar si es par o impar. 
 */

public class Ejercicio22 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce un número distinto de cero: ");
            num = entrada.nextInt();
            if(num%2==0 && num!=0) System.out.println("El "+num+" es par");
            else if(num%2!=0) System.out.println("El "+num+" es impar");
        }while(num!=0);        
    }
}