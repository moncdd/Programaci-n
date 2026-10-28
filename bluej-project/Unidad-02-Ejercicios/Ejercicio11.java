/**
 * Programa que lee tres números distintos y nos dice cuál de ellos es el mayor 
 */

public class Ejercicio11 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Declaramos variables
        int num1,num2,num3;
        
        // Declaramos el objeto teclado
        java.util.Scanner teclado = new java.util.Scanner(System.in);

        // Ejetutamos...
        System.out.println("Introduce el primer número entero");
        num1 = teclado.nextInt();
        System.out.println("Introduce el segundo número entero");
        num2 = teclado.nextInt();
        System.out.println("Introduce el tercer número entero");
        num3 = teclado.nextInt();
        

        //comprobamos que sean diferentes
        if(num1!=num2 && num2!=num3 && num1!=num3){
            if(num1>num2 && num1>num3) {
                System.out.print("El mayor es: "+num1);
            }
            else if(num2>num3) {
                System.out.print("El mayor es: "+num2);
            }
            else if(num3>num2){
                System.out.print("El mayor es: "+num3);
            }
        }
        else System.out.println("Los números "+num1+", "+num2+" y "+num3+" no son distintos");
    }

}