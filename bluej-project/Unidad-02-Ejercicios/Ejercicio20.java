/**
 * Leer un número y mostrar su cuadrado, 
 * repetir el proceso hasta que se introduzca un número negativo. 
 */

public class Ejercicio20 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num;
        java.util.Scanner entrada = new java.util.Scanner(System.in);

        do{
            System.out.print("Introduce un número positivo: ");
            num = entrada.nextInt();
            if(num>-1) System.out.println("El cuadrado de "+num+" es "+Math.pow(num,2)); //(num*num)
        }while(num>-1);    
    }
}
