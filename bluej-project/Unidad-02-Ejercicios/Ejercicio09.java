/**
 * Programa que lee dos números (distintos) y nos dice cual es el mayor 
 */

public class Ejercicio09 {

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
        

        if(num1!=num2){
            if(num1>num2) System.out.println("El número "+num1+" es mayor que "+num2);
            else System.out.println("El número "+num2+" es mayor que "+num1);
        }
        else System.out.println("Los números "+num1+" y "+num2+" son iguales");
    }

}