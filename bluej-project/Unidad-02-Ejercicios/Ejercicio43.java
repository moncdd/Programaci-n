/**
 *     Pedir un número y calcular su factorial.
 */
public class Ejercicio43 {
    public static void main(String[] args) {
        //Declaramos las variables
        int num,fact=1;
        java.util.Scanner entrada = new java.util.Scanner(System.in);
        //Pedimos datos
        System.out.print("Introduce un número: ");
        num = entrada.nextInt();
        
        
        for(int i=1;i<=num;i++) {
            fact*=i;
        }
        System.out.println("El factorial de "+num+" es "+fact);

    }
}