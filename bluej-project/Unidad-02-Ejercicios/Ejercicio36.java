/**
 * Programa que lea dos números enteros y muestre por pantalla 
 * todos los números comprendidos entre esos dos, ambos incluidos. 
 * El programa no debe suponer que el primero será menor que el segundo 
 * ni viceversa, pero sí deberá tenerlo en cuenta para mostrar los números 
 * en orden creciente o decreciente según corresponda. 
 */

public class Ejercicio36 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num1,num2;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        System.out.print("Introduce el primer número ");
        num1 = entrada.nextInt();
        System.out.print("Introduce el segundo número ");
        num2 = entrada.nextInt();
        

        if(num1<num2){ //ascendente
            for(int i=num1;i<=num2;i++) System.out.println(i);
        }
        else if(num1>num2){ //descendente
            for(int i=num1;i>=num2;i--) System.out.println(i);
        }
        else System.out.println(num1); //coincidente
    }
}