/**
 * Programa que lee una secuencia 5 números y escribe cual ha sido el mayor.
 */
public class Ejercicio35 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num = 0, max=Integer.MIN_VALUE;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        for(int i=0;i<5;i++){
            System.out.print("Introduce un número entero: ");
            num = entrada.nextInt();
            if(max<num) max = num;
        }
        entrada.close();

        System.out.println("El número mayor introducido fue "+max);
    }
}