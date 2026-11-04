/**
 * Pedir números hasta que se introduzca uno negativo, y calcular la media. 
 */

public class Ejercicio26 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num,suma=0,cont=0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce un número positivo: ");
            num = entrada.nextInt();
            if(num>-1.0){ suma+=num; cont++;}
        }while(num>-1.0); 

        System.out.println("La media de los números introducidos es "+(double)(suma/cont));
    }
}