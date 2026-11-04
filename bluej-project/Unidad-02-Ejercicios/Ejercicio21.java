/**
 * Leer un número e indicar si es positivo o negativo. 
 * El proceso se repetirá hasta que se introduzca un 0. 
 */

public class Ejercicio21 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce un número distinto de cero: ");
            num = entrada.nextInt();
            if(num>0) System.out.println("El "+num+" es postivo");
            else if(num<0) System.out.println("El "+num+" es negativo");
        }while(num!=0);        
    }
}
