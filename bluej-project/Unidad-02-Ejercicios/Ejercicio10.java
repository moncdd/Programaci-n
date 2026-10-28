/**
 * Programa que lee dos números (no necesariamente distintos) y los escribe ordenados 
 */

public class Ejercicio10 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos variables
        int num1,num2;
        
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce el primer número entero");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número entero");
        num2 = teclado.nextInt();

        if(num1>=num2) System.out.println("Los dos números ordenados son: "+num2+", "+num1);
        else System.out.println("Los dos números ordenados son: "+num1+", "+num2);
    }

}