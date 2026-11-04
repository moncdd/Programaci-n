/**
 * Programa que lee 11 números comprendidos entre el 20 y 40, 
 * ambos inclusive. En el caso en el que algún número introducido 
 * no se encontrara dentro del rango permitido, se mostrará un mensaje 
 * de error y seguirá pidiendo números. El programa finalizará cuando 
 * se hayan introducido 11 números válidos y mostrará el número máximo 
 * introducido de los 11 válidos. Además indicará cuántos números de los 
 * introducidos no han sido válidos. 
 */

public class Ejercicio37 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num = 0, contValidos = 0, contInvalidos = 0, max=Integer.MIN_VALUE;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        do{
            System.out.print("Introduce el "+(contValidos+1)+" número entero: ");
            num = entrada.nextInt();
            if(num>=20 && num<=40){
                if(max<num) max = num;
                contValidos++;
            }
            else {
                System.out.println("Número no permitido");
                contInvalidos++;
            }
        }while(contValidos!=11);

        System.out.println("Has introducido "+contValidos+" números válidos");
        System.out.println("Has introducido "+contInvalidos+" números inválidos");
        System.out.println("El número mayor introducido fue "+max);

    }
}