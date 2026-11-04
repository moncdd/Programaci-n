/**
 * Programa que va leyendo números desde teclado y 
 * calcula la suma de todos ellos. El programa finaliza 
 * cuando el número leído es 0. 
 */

public class Ejercicio25 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num,suma=0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce un número positivo mayor que cero: ");
            num = entrada.nextInt();
            if(num>0) suma+=num; // suma = suma + num;
        }while(num>0); 

        System.out.println("La suma de los números introducidos es "+suma);
    }
}