/*
 * Leer dos números y sumar, restar, multiplicar, y resto de división entera.
 */

public class Ejercicio11 {
    public static void main(String[] args){
        //Decl. variables
        int num1,num2,suma,resta,multiplicacion,modulo;
        /* 
        //Op. 1: valores estáticos
        num1 = 5;
        num2 = 3;
        */
        //Op. 2: valores recogidos por teclado
        //Usamos el teclado como entrada de programa
        java.util.Scanner teclado = new java.util.Scanner(System.in); 
        //Recogemos datos
        System.out.print("Introduzca el primer número: "); 
        num1 = teclado.nextInt(); 
        System.out.print("Introduzca el segundo número: "); 
        num2 = teclado.nextInt(); 

        //Op. y mostramos
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        modulo = num1 % num2;
        
        System.out.println("La suma de "+num1+" y "+num2+" es = "+suma);
        System.out.println("La resta de "+num1+" y "+num2+" es = "+resta);
        System.out.println("La multiplicación de "+num1+" y "+num2+" es = "+multiplicacion);
        System.out.println("El módulo de "+num1+" y "+num2+" es = "+modulo);
        
    }
}
