/**
 * Programa que lee dos números, si son positivos los suma, 
 * si son negativos los resta y si alguno es nulo saca un mensaje de error.  
 */

public class Ejercicio08 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos variables
        int num1,num2;
        
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce el primer número");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número");
        num2 = teclado.nextInt();

        if(num1>0 && num2>0) System.out.println("Los números "+num1+" y "+num2+" son positivos y su suma es "+(num1+num2));
        else if(num1<0 && num2<0) System.out.println("Los números "+num1+" y "+num2+" son negativos y su resta es "+(num1-num2));
        else System.out.println("Mensaje de error.");
    
    }

}