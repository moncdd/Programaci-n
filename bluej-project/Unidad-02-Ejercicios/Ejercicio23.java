/**
 * Pedir números hasta que se teclee uno negativo, y 
 * mostrar cuántos números se han introducido. 
 */

public class Ejercicio23 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num,cont=0;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce números que no sean negativos: ");
            num = entrada.nextInt();
            if(num>-1) cont++;
        }while(num>-1);
        
        System.out.print("Has introducido "+cont+" números no negativos");         
    }
}